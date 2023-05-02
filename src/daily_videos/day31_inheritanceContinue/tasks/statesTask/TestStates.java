package daily_videos.day31_inheritanceContinue.tasks.statesTask;

public class TestStates {

    public static void main(String[] args) {
        California california = new California("California","CA","Democrat","Gavin Christopher Newsom ","Dianne Feinstein",39.24,7.25);

        Florida florida = new Florida("Florida","FL","Republican","Ron DeSantis","Rick Scott",21.78,6);

        Texas texas = new Texas("Texas","TX","Republican","Greg Abbott","John Cornyn",29.53,6.25);

        Virginia virginia = new Virginia("Virginia","VA","Republican","Glenn Youngkin","Mark Warner",8.642,5.3);

        System.out.println(california);
        System.out.println(florida);
        System.out.println(texas);
        System.out.println(virginia);
    }

}
