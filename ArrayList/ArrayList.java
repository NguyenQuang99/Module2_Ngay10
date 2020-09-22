package ArrayList;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private E[] data = (E[]) new Object[DEFAULT_CAPACITY];
    private Object elements[];
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[]) (new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }


    private void add(E element, int index) {
        if(size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }
    public boolean add(E element) {
        ensureCapacity();
        elements[size ] = element;
        elements[size] = element;
        size++;
        return true;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }
    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    /** Add a new element at the specified index */
    public void add(int index, E e) {
        ensureCapacity();
// Move the elements to the right after the specified index
        for (int i = size - 1; i >= index; i--) data[i + 1] = data[i];
// Insert new element to data[index]
        data[index] = e;
// Increase size by 1
        size++;
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i]))
                return true;
        return false;
    }
    public int indexOf(E e) {
        for (int i = 0; i < size; i++)
            if (e.equals(data[i])) return i;
        return -1;
    }
    public E remove(int index) {
        checkIndex(index);

        E e = data[index];

        // Shift data to the left
        for (int j = index; j < size - 1; j++)
            data[j] = data[j + 1];

        data[size - 1] = null; // This element is now null

        // Decrement size
        size--;
        return e;
    }
}
