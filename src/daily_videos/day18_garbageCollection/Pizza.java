package daily_videos.day18_garbageCollection;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;
    public double calcCost(){
        double totalPrice = 0;

        switch (size){
            case 'S':
            case 's':
                totalPrice = 10 + 2*numberOfCheeseTopping + numberOfPepperoniTopping;
                break;
            case 'M':
            case 'm':
                totalPrice = 12 + 2*numberOfCheeseTopping + numberOfPepperoniTopping;
                break;
            case 'L':
            case 'l':
                totalPrice = 14 + 2*numberOfCheeseTopping + numberOfPepperoniTopping;
                break;
            default:
                System.out.println("Invalid Size");
        }
        return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalPrice=" + calcCost() +
                '}';
    }


    public void setInfo(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }
}


