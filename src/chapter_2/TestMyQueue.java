package chapter_2;

public class TestMyQueue {

    public static void main(String[] args) {
        MyQueue mq = new MyQueue();

        mq.add(1);
        mq.add(2);
        mq.add(3);
        mq.add(4);
        mq.add(5);
        mq.show_queue();

        mq.pull();
        mq.show_queue();

        mq.pull();
        mq.pull();
        mq.show_queue();

    }

}
