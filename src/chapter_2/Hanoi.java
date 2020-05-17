package chapter_2;

public class Hanoi {
    public static void main(String[] args) {
        hanoi(3, "a", "b", "c");
    }



    public static void hanoi(int n, String from, String in, String to){
        if (n == 1) {
            System.out.println("plant 1 from " + from + " to " + to);
        }
        else {
            hanoi(n-1, from, to, in);
            System.out.println("plant " + n + " from " + from + " to " + to);
            hanoi(n-1, in, from, to);
        }
    }

}
