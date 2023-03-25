package daily_videos.day20_forEach.tasks;

public class UniqueElements {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 2, 4, 6, 7, 9};


        for (int number : numbers) {
            int count = 0;
            for (int i : numbers) {
                if (number == i) {
                    count++;
                }
            }
            if (count == 2) {
                continue;
            } else if (count == 1) {
                System.out.print(number + " ");
            }
        }
    }
}
/*
4. Write a program that can display the unique elements of an array

MUST use for each loops
 */