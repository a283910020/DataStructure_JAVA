package chapter_2.zhuo;


import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: Elijah
 * @createAt:2020-04-22-18:05
 */
public class ForZhuo {
    public static void main(String[] args) {
        ZhuoItem[] items = new ZhuoItem[]{new ZhuoItem(65, 70),
                new ZhuoItem(45, 7),new ZhuoItem(98, 89),
                new ZhuoItem(23, 56),new ZhuoItem(78, 90),
                new ZhuoItem(78, 96)};
        System.out.println("排序前" + Arrays.toString(items));
        Arrays.sort(items, new ZhuoComparator());
//        Arrays.sort(items);

        System.out.println("排序后" + Arrays.toString(items));

    }
}



