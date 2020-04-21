package chapter_2;

public class Node {

    int data;

    Node next;

    public Node(int data) {
        this.data = data;
    }

    public void addNode(Node node){
//        this.next = node;
        Node current = this;

        while (true){
            Node nextNode = current.next;
            if (nextNode == null){
                break;
            }
            current = nextNode;
        }
        current.next = node;
//        return this;

    }

    public void insert_after(Node node){
        Node nextNext = next;
        this.next = node;
        node.next = nextNext;

    }

    public Node next(){
        return this.next;
    }

    public int getData(){
        return this.data;
    }

    public boolean isLast(){
        return next == null;
    }

    public void removeNext(){
        Node newNext = next.next;
        this.next = newNext;
    }

    public void showAll(){
        Node currentNode = this;
        while (true){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;

            if (currentNode == null)
                break;
        }
        System.out.println();
    }
}
