package chapter_2;

public class TestNode {

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);


        n1.addNode(n2);
        n1.addNode(n3);
//        n1.addNode(n3);
        n1.addNode(new Node(4));

//        System.out.println(n1.isLast());
//        System.out.println(n2.isLast());
//        System.out.println(n3.isLast());
//
//        System.out.println(n1.next.next.getData());

//        n1.removeNext();
//        n1.showAll();
//        n1.removeNext();
        n1.showAll();



    }
}
