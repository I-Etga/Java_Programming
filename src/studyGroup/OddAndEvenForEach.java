package studyGroup;

public class OddAndEvenForEach {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 24, 28, 43};

        int even = 0; //+1
        String evenN = "";//2, 4,
        int sumEven = 0; //+2

        int odd = 0; //+1 +1
        String oddN = "";// 1, 3,
        int sumOdd = 0; //+1 +3

        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
                sumEven += number; // sum of the all even numbers
                evenN += number + " ";
            } else {
                odd++;
                sumOdd += number;
                oddN += number + " ";
            }
        }
        System.out.println("Even numbers in array: " + evenN + " numbers of even numbers= " +even + " sum of even numbers= " +sumEven  );
        System.out.println("Odd numbers in array: " + oddN + " numbers of odd numbers= " +odd + " sum of odd numbers= " +sumOdd  );
    }
}