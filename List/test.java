package MyLinkedList;

public class Test {
    public static void main(String[] args) {
        MyList newNode = new MyList();
        newNode.addFirst(5);
        newNode.addFirst(8);
        newNode.addLast(6);
        newNode.addLast(7);
        newNode.add(4, 9);
        newNode.printList();
        System.out.println(newNode.size());
        newNode.indexOf(5);
        System.out.println(newNode.indexOf(8));
        System.out.println(newNode.contains(6));
    }
}
