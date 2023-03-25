package daily_videos.day18_garbageCollection.tasks;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public double calcCost(){
        double price = (width*length)*unitPrice;
        if(isPersian){
            price+=200;
        }
        return  price;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price of carpet= " + calcCost()+
                '}';
    }
}
