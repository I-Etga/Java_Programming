package wednesdays_office_hours.week7;

public class ObjectTester {
    public static void main(String[] args) {
        Recipe salmon = new Recipe();
        salmon.setInfo("Salmon", "Salmon, Lemons, Salt", 2, 19.99);

        System.out.println(salmon);
        System.out.println(salmon.costPerPerson());

        Recipe eggs = new Recipe();
        eggs.setInfo("Fired Egg", "Eggs, oil, salt, pepper", 4, 34.80);
        System.out.println(eggs);
        System.out.println(eggs.costPerPerson());

        System.out.println("-----------------------");

        SportsTeam bulls = new SportsTeam();
        bulls.setInfo("Chicago Bulls", 25, "Billy Donovan", "15:10", "US", 1000000);
        System.out.println(bulls);

        SportsTeam united = new SportsTeam();
        united.setInfo("Manchester United", 25, "Eric Ten Hag", "20:10", "UK", 10000000);

        System.out.println(united);

        for(int i = 0; i < 10; i++){
            united.joinFanClub();
        }

        System.out.println(united);

        System.out.println("-----------------------");

        MusicPlaylist lofi = new MusicPlaylist();
        lofi.setInfo("Lofi to Study", 5, 3.5);
        System.out.println(lofi);

        lofi.next();
        System.out.println(lofi);

        lofi.removeSong();
        System.out.println(lofi);


    }
}
