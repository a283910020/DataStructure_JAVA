package chapter_2;


import java.util.Arrays;

// 线性查找
public class TestSearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int target = 4;
        linerSearch(target, arr);
        binarySearch(target, arr);

    }

    public static void linerSearch(int target, int arr[]) {

        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("index : " + index);
    }

    public static void binarySearch(int target, int arr[]) {

        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        int index = -1;

        while (true){
             if (arr[middle] == target){
                 index = middle;
                 break;
             }
             else if(arr[middle] > target)
                 end = middle - 1;
             else
                 start = middle + 1;

             middle = (start + end) / 2;

        }

        System.out.println("index : " + index);

    }
}