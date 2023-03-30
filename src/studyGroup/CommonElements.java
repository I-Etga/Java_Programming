package studyGroup;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        //String commonElements = ""; // 4 5
        for (int number : arr1) {

            for (int num : arr2) {
                /*
                if (number == num && !commonElements.contains(""+ number)) {
                    commonElements+= num+ " ";
                }*/
                if(num == number){
                    System.out.print(num + " ");
                }
            }
        }
       // System.out.println("commonElements = " + commonElements);
    }
}