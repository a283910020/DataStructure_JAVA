package chapter_2;

public class TestArray {

    public static void main(String[] args){
        int [] arr1 = new int[3];

        int length_1 = arr1.length;
        System.out.println(length_1);

        int [] arr2 = new int[] {1,2,3,4,5};

        for(int i = 0; i < 5; i ++){
            System.out.println(i + " " + arr2[i]);
        }
    }
}
