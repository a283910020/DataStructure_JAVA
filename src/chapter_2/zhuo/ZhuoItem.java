package chapter_2.zhuo;

//public class ZhuoItem implements Comparable {

public class ZhuoItem {

    private double price;
    private double comments;

    public ZhuoItem(double price, double comments) {
        this.comments = comments;
        this.price = price;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getComments() {
        return comments;
    }

    public void setComments(double comments) {
        this.comments = comments;
    }

//    @Override
//    public int compareTo(Object o) {
//        if (o instanceof ZhuoItem){
//            ZhuoItem item2  = (ZhuoItem) o;  //一定要重新一个变量
//            int priceCompare =  Double.compare(this.comments, item2.comments);  //或者在这里直接用((Item) o).price
//            if(priceCompare != 0) {
//                return priceCompare;
//            }
//            return Double.compare(this.price, item2.price);  // 二级排序
//        }
//        else{
//            throw new RuntimeException("Wrong compare Class");
//        }
//    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Zhuo Items:{").append(" price: ").
                append(price).append(" comments: ").append(comments).append(" }");
        return stringBuilder.toString();
    }

}
