package daily_videos.day19_Arrays.tasks;

public class StudentsGrade {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];
        grades[0] = 'A';
        grades[1] = 'B';
        grades[2] = 'C';

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "'s score is " + scores[i] + ", and grade is " + grades[i] );
        }

    }
}
