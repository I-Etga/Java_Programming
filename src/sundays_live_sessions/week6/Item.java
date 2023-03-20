package sundays_live_sessions.week6;

public class Item {
    public String name ;
    public int quantity;
    public double unitPrice;

    public void setInfo(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public void sellItem(int numberOfOrderedItem){
        if(quantity > numberOfOrderedItem){
            System.out.println("Selling: "+ numberOfOrderedItem +" "+ name+ " for $"+ unitPrice*numberOfOrderedItem);
            quantity-= numberOfOrderedItem;
        }
    }


    public String toString() {
        return  "ITEM: " + name + " | " + quantity+ " | " + unitPrice;
    }
}
