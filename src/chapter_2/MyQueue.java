package chapter_2;

import java.util.Arrays;

public class MyQueue {


    int[] elements;
    public MyQueue(){

        elements = new int[0];

    }

    public void add(int element){
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i ++){
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }

    public int pull(){
        if (elements.length == 0){
            throw new RuntimeException("stack is empty.");
        }

        int element = elements[0];

        int[] newArray = new int[elements.length - 1];

        for (int i = 0; i < newArray.length; i ++){
            newArray[i] = elements[i + 1];
        }

        elements = newArray;

        return element;

    }

    public void show_queue(){
        System.out.println(Arrays.toString(elements));
    }

    public boolean isEmpty(){

        return elements.length == 0;

    }





}
