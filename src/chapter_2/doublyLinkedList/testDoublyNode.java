package chapter_2.doublyLinkedList;

public class testDoublyNode {
    public static void main(String[] args) {
        DoublyNode n1 = new DoublyNode(1);
        DoublyNode n2 = new DoublyNode(2);
        DoublyNode n3 = new DoublyNode(3);
        DoublyNode n4 = new DoublyNode(4);

        n1.insertAfter(n2);
        n2.insertAfter(n3);

        System.out.println(n1.prev().getData());
        System.out.println(n1.getData());
        System.out.println(n1.next().getData());
        System.out.println("=====");
        System.out.println(n2.prev().getData());
        System.out.println(n2.getData());
        System.out.println(n2.next().getData());

    }
}
