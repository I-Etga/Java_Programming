package daily_videos.day20_forEach.tasks;

public class CommonElements {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 5};
        int[] arr2 = {4, 5, 6, 7, 8, 5};

        String commonElements = "";
        for (int i : arr1) {
            for (int j : arr2) {
                if (!commonElements.contains("" + j) && j == i) {
                    commonElements += j + " ";
                }
            }
        }
        System.out.println(commonElements);
    }
}
