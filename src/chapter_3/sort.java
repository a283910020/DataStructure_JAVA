package chapter_3;

import java.util.Arrays;

public class sort {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 7, 2, 9, 4, 1, 0, 5, 7};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void selectionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
//            System.out.println(Arrays.toString(arr));
        }

    }


    public static void insertionSort(int[] arr){

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]){
                int temp = arr[i];
                int j;
                for (j = i - 1; j >= 0 && arr[j] > temp ; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }
    }


}
