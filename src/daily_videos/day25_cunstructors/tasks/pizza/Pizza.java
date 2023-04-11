package daily_videos.day25_cunstructors.tasks.pizza;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public double calcCost(){
        double price = 0;
        if(size== 'S'){
            price+= 10+ 2* (numberOfCheeseTopping + numberOfPepperoniTopping);
        } else if (size == 'M') {
            price+= 12+ 2* (numberOfCheeseTopping + numberOfPepperoniTopping);
        }else if(size == 'L'){
            price+= 14+ 2* (numberOfCheeseTopping + numberOfPepperoniTopping);
        }
        /* ** We can use ternary if as well.
        double statingPrice = (size.equalsIgnoreCase("small")) ? 10 :(size.equalsIgnoreCase("medium"))? 12 : 14;
        double totalPrice = statingPrice + 2 * (numberOfCheeseTopping+numberOfPepperoniTopping);
         */
        return price;
    }
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", pizza cost=" + calcCost() +
                '}';
    }
}

