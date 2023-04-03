package studyGroup;

public class day21Task2 {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        // #1
        for (String[] item : items) {
            for (String i : item) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        System.out.println("*** #2 ***");

        for (String[] item : items) {
            for (int i = item.length - 1; i >= 0; i--) {
                System.out.print(item[i] + "\t");
            }
            System.out.println();
        }

        System.out.println("*** #3 ***");

        for (int i = items.length - 1; i >= 0; i--) {
            String[] item = items[i];//2 1 0
            for (String s : item) {
                System.out.print(s + "\t");
            }
            System.out.println();
        }
    }
}

