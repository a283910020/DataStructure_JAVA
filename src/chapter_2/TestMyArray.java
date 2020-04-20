package chapter_2;
import chapter_2.MyArray;

public class TestMyArray {

    public static void main(String[] args){
        MyArray ma = new MyArray();
        int size = ma.size();
        System.out.println(ma.size());

        ma.add(1);
        ma.add(2);
        ma.add(3);
        ma.add(4);
        ma.add(5);

        System.out.println(ma.size());

        ma.show_array();
        ma.delete(3);
        ma.show_array();

        ma.get_element(2);
        ma.set_element(2, 100);
        ma.show_array();
        ma.insert_element(3, 99);
        ma.show_array();
    }



}
