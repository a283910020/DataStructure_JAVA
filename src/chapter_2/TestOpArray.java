package chapter_2;

import java.util.Arrays;

public class TestOpArray {

    public static void main(String[] args) {

        int[] arr1 = new int[] {1,2,3,4,5};


        // add element into array
        System.out.println(Arrays.toString(arr1));
        int[] newArray = new int[arr1.length + 1];
        for(int i = 0; i < arr1.length; i ++){
            newArray[i] = arr1[i];
        }
        newArray[newArray.length - 1] = 6;
        System.out.println(Arrays.toString(newArray));

        // delete element into array
        int[] newArray2 = new int[arr1.length - 1];
        int ele_to_del = 3;
        for (int i = 0; i < newArray2.length; i ++){
            if (arr1[i]  < ele_to_del){
                newArray2[i] = arr1[i];
            }
            else {
                newArray2[i] = arr1[i + 1]  ;
            }
        }
        System.out.println(Arrays.toString(newArray2));
    }



}
