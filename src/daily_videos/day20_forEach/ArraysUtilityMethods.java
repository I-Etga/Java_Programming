package daily_videos.day20_forEach;

import java.util.Arrays;

public class ArraysUtilityMethods {


    public static void main(String[] args) {

        int score[] = {70,100,80,90,65};

        System.out.println(Arrays.toString(score));

        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }

        System.out.println("---------");

        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3,4,5};

        boolean r1 = Arrays.equals(a1,a2); // same element same order then true !!
        System.out.println(r1);

        System.out.println("--------");

        char [] ch1 = {'A', 'B', 'C'};
        char [] ch2 = {'A', 'C', 'B'};

        boolean r2 = Arrays.equals(ch1,ch2);
        System.out.println(r2); // same elements but in different ORDER. so false !!

        System.out.println("---------");

        String[] s1 = {"A","B","C"};
        String[] s2 = {"A","C","B"};

        boolean r3 = Arrays.equals(s1,s2);
        System.out.println(r3);

        System.out.println("---------");

        int[] nums = {100,80,90,75,88,99,0,5,4,1000,500};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums); // print and see the difference of order
        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum Number: " + nums[0]);
        System.out.println("Maximum Number: " + nums[nums.length-1]);

        System.out.println("---------");

        String[] b1 = {"C","A","B"};
        String[] b2 = {"B","C","A"};

        Arrays.sort(b1); // {"A","B","C"};
        Arrays.sort(b2); // {"A","B","C"};


        System.out.println(Arrays.equals(b1,b2));

        System.out.println("--------");

        String[] students = { "Yavier" , "Madivar","Ali", "Abidullah","Alena"};

        Arrays.sort(students); // put the elements of array like a dictionary. [checks char to char]

        System.out.println(Arrays.toString(students)); //[Abidullah, Alena, Ali, Madivar, Yavier]

        int [] array = {10,20,30,40,50,60,70};
        int [] array2 = Arrays.copyOf(array,3); //enter how many elements you want to copy

        System.out.println(Arrays.toString(array2));

        //if you enter a newLength longer than the copied Array, the rest elements will be 0(default value).
        int[] array3 = Arrays.copyOf(array,10);

        System.out.println(Arrays.toString(array3));

        System.out.println("------------");

        int[] n1 = {1,2,3,4,5};
        int[] n2= {6,7,8,9,10};

        int[] n3 = Arrays.copyOf(n1,n1.length+n2.length);

        System.out.println(Arrays.toString(n3));


        for (int i = n1.length, k = 0; i < n3.length; i++,k++) {
            n3[i] = n2[k];
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("--------");

        char[] ch = {'A','B','C','D','E','F','G'};

        char[] result1 = Arrays.copyOf(ch,20);

        System.out.println(Arrays.toString(result1)); // after 'G' , we'll have   value !! default value of char
                                                        // excludes ending index!!
        char [] result2 = Arrays.copyOfRange(ch,2,5);

        System.out.println(Arrays.toString(result2));

        char [] result3 = Arrays.copyOfRange(ch,2,ch.length);
        System.out.println(Arrays.toString(result3));

    }
}
