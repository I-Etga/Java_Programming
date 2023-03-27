package studyGroup;

public class Carpet {

    public  String name;
    public double width ;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public void setInfo(String name, double width, double length, double unitPrice, boolean isPersian) {
        this.name = name;
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double  calcCost(){
        double totalPriceOfCarpet = (width*length) * unitPrice;
        if(isPersian){
            totalPriceOfCarpet+=200;
        }
        return totalPriceOfCarpet;
    }
    public String toString() {
        return "Carpet{" +
                "name= " + name +
                ", width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPriceOfCarpet= $" + calcCost()+
                '}';
    }
}