package chapter_2;

import java.util.Arrays;

public class MyArray {

    private int[] elements;

    public MyArray() {
        elements = new int[0];
    }

    public int size(){
        return elements.length;
    }

    public void add(int element){
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i ++){
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }

    public void delete(int index){
        if (index < 0 || index > elements.length - 1){
            throw new RuntimeException("index out of range");
        }

        int[] newArray = new int[elements.length - 1];


        for (int i = 0; i < newArray.length; i ++){
            if (elements[i] < index){
                newArray[i] = elements[i];
            }
            else {
                newArray[i] = elements[i + 1]  ;
            }
        }

        elements = newArray;
    }

    public void show_array(){
        System.out.println(Arrays.toString(elements));
    }


    public int get_element(int index){
        System.out.println(elements[index]);
        return elements[index];
    }
    public void set_element(int index, int element){
        elements[index] = element;
    }

    public void insert_element(int index, int element){
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i ++){
            if (i < index){
                newArray[i] = elements[i];
            }
            else {
                newArray[i + 1] = elements[i];
            }
        }
        newArray[index] = element;
        elements = newArray;

    }



}
