package chapter_2;

public class TestMyStack {

    public static void main(String[] args) {

        MyStack ms = new MyStack();

        ms.push(2);
        ms.push(4);
        ms.push(5);
        ms.push(6);
        ms.push(7);
        ms.push(9);

        ms.peek();
        ms.pop();
        ms.pop();
        ms.pop();

        ms.peek();
    }
}
