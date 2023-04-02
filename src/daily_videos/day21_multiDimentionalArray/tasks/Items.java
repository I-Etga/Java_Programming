package daily_videos.day21_multiDimentionalArray.tasks;

public class Items {
    public static void main(String[] args) {
        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        // #1
        for (String[] item : items) {
            for (String each : item) {
                System.out.print(each + "\t");
            }
        }

        System.out.println(); // Because of .print() line14. Otherwise, cursor stays in the same line and keeps printing.

        // #2
        for (String[] item : items) {
            for (int i = item.length - 1; i >= 0; i--) {
                System.out.print(item[i] + "\t");
            }
        }

        System.out.println(); // Because of .print() line22. Otherwise, cursor stays in the same line and keeps printing .

        // #3

        for (int i = items.length - 1; i >= 0; i--) {

            String[] item = items[i];
            for (String each : item) {
                System.out.print(each + "\t");
            }
        }
    }
}
