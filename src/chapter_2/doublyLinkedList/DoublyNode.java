package chapter_2.doublyLinkedList;

public class DoublyNode {

    DoublyNode prev = this;
    DoublyNode next = this;
    int data;

    public DoublyNode(int data){
        this.data = data;
    }

    public void insertAfter(DoublyNode node){

        DoublyNode nextNext = next;
        this.next = node;
        node.prev = this;
        node.next = nextNext;
        nextNext.prev = node;

    }

    public DoublyNode next(){
        return this.next;
    }

    public DoublyNode prev(){
        return this.prev;
    }

    public int getData() {
        return this.data;
    }
}
