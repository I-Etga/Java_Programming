package daily_videos.day40_collections;


import java.util.*;

public class IterableExample {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

       /*
            for (Integer each : list) {
            if (each < 5) {
                list.remove(each); //(that remove method takes obj.)
                - ConcurrentModificationException[remember ArrayList removeIf method !!]
                - Everytime we remove element, size of List will change[reduce] as well. Because it's dynamic !!
                - Once we remove one element, the next elements will shift to the right,
                                        which means index of element will change immediately.
                }
            }
                */

        // These two different remove methods !!

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 5) {
                list.remove(i); // (that remove method takes index number)
            }
        }

        System.out.println("***** Iterator w While loop*****");

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        Iterator<Integer> it = list2.iterator();
        // Number of iteration is equal number of elements.


        while (it.hasNext()) { // returns true as long as it can get an element !!
            Integer each = it.next(); // return method. It's going to get me Integer -Iterator<Integer>-.
            if (each < 5) {
                it.remove();
            }
        }
        System.out.println(list2);


        System.out.println("***** Iterator w For loop*****");
        // When it comes to iterate a collection, while loop is easier to use and read !!

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        // Before create while loop, I have to create iterator
        // !! But I don't have to do it for forLoop.

        //      # iterator of this list                     # condition
        for (Iterator<Integer> i = list3.listIterator(); i.hasNext(); ) {

            Integer each = i.next();
            if (each < 5) {
                i.remove();
            }
        }

        System.out.println(list3);

        System.out.println("***** removeIf(p->)*****");

        /*
        It applies implicitly what we've done above in for or while loop.
        It has iterator,hasNext,next inside.
        It's kind of shortcut !!
        Btw, If we use lambda expression like removeIf , we better use one letter variable name  !!
         */


        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list4.removeIf(each -> each < 5);

        System.out.println(list4);


        System.out.println("***** removeIf(p->) on LinkedList *****");

        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        list5.removeIf(p -> p < 5);

        System.out.println(list5);

    }
}
