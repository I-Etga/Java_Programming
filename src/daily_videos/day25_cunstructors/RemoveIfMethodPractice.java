package daily_videos.day25_cunstructors;

import daily_videos.day17_customClass.practice.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethodPractice {
    public static void main(String[] args) {

        Dog[] dogs = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};

        dogs[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        System.out.println("** #1 Small Dogs***");
        ArrayList<Dog> smallDogs = new ArrayList<>(Arrays.asList(dogs));
        System.out.println(smallDogs); // we assign dogs to new arrayList.

        // p is here each also dog objects !!
        smallDogs.removeIf(p -> !p.size.equalsIgnoreCase("small"));
        //                  removes the objects whose size is not small

      /*
      #1 with loop [youngDogs list must be empty]
      [ according to the requirement I am not allowed to use any loop--> so removeIf !!]
        for (Dog dog : dogs) {
            if(dog.size.equalsIgnoreCase("small")){
                smallDogs.add(dog);
            }
        }
        */
        System.out.println(smallDogs);

        System.out.println("** #2 Young Dogs***");

        ArrayList<Dog> youngDogs = new ArrayList<>(Arrays.asList(dogs));// contains all dogs
        youngDogs.removeIf(p -> p.age > 4);// removes dogs which are older than 4 .

        System.out.println(youngDogs);

        System.out.println("** #3 Female Dogs***");

        ArrayList<Dog> femaleDogs = new ArrayList<>(Arrays.asList(dogs));// contains all dogs
        femaleDogs.removeIf(p -> p.gender != 'F');// removes dogs which are not female .

        System.out.println(femaleDogs);


        System.out.println("*** #4 Male Dogs***");

        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));// contains all dogs

        maleDogs.removeIf(p -> p.gender != 'M');// removes dogs which are not male .

        System.out.println(maleDogs);

        System.out.println("---------");

        Dog[] dogs2 = {new Dog(), new Dog(), new Dog(), new Dog(), new Dog(), new Dog()};

        dogs2[0].setInfo("Max", "Husky", 'M', 4, "Medium", "Gray");
        dogs2[1].setInfo("Chloe", "Golden Retriever", 'F', 8, "Large", "Gold");
        dogs2[2].setInfo("Molly", "Beagle", 'F', 5, "Small", "White");
        dogs2[3].setInfo("Oliver", "Bulldog", 'M', 2, "Small", "Black");
        dogs2[4].setInfo("Bella", "Bichon Frise", 'F', 3, "Small", "White");
        dogs2[5].setInfo("Loki", "Chow Chow", 'M', 7, "Medium", "Gold");

        System.out.println(Arrays.toString(dogs2));

        ArrayList<Dog> list = new ArrayList<>(Arrays.asList(dogs2));

        list.removeIf(p -> p.size.equalsIgnoreCase("small"));

        // list to array

        dogs2 = list.toArray(new Dog[10]);

    /*   the size does not affect anything if it's less than size of list.
         But it's grater than size of list, then elements of list will be assigned and the rest will be null !
         In this case list has 3 element so size is 3 and if we pass 10 we get 7 null after 3 elements of list !
                                 But if we pass 0,1,2,3 there will be whether problem nor null.*/

        System.out.println(Arrays.toString(dogs2));






    }
}
