package chapter_2.zhuo;
import java.util.Comparator;

public class ZhuoComparator implements Comparator<ZhuoItem> {
    @Override
    public int compare(ZhuoItem o1, ZhuoItem o2){

        return (int) (o1.getComments() - o2.getComments());

    }

}
