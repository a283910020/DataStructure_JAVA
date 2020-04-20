package chapter_2;

public class MyStack {

    int[] elements;
    public MyStack(){

        elements = new int[0];

    }

    public void push(int element){
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i ++){
            newArray[i] = elements[i];
        }
        newArray[elements.length] = element;
        elements = newArray;
    }

    public int pop(){
        if (elements.length == 0){
            throw new RuntimeException("stack is empty.");
        }

        int element = elements[elements.length - 1];

        int[] newArray = new int[elements.length - 1];
        for (int i = 0; i < newArray.length; i ++){
            newArray[i] = elements[i];
        }

        elements = newArray;

        return element;

    }

    public void peek(){

        System.out.println(elements[elements.length - 1]);

    }



}
