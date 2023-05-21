package daily_videos.day40_collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue1 = new PriorityQueue<>();
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue1.addAll(Arrays.asList(null, null, null)); // PriorityQueue doesn't accept null !![NullPointerException]

        System.out.println(queue1); // [10, 10, 10, 40, 40, 200, 40, 300, 200, 90, 90, 300, 300, 200, 90]
        // If you look at the Queue, order is very random.

        int num1 = queue1.poll();//==> FIFO [first in , first out]. {remember pop method of Stack--> LIFO => Last in, first out}
        //poll returns Integer. It returns the first element BUT at the same time removes that element.
        System.out.println(queue1);

        System.out.println(queue1.poll()); // returns 10 and removes 10
        System.out.println(queue1.poll());// returns 10 and removes 10
        queue1.poll(); // returns 10 and removes 10
        // That's means first three elements will be removed.
        System.out.println(queue1);

        // Only List and subclasses has get method. There is an alternative way for non-list collection member.
        // By converting queue to ArrayList !![Because ArrayList constructor accepts collection !!]
        System.out.println("get ->"+ new ArrayList<>(queue1).get(3));

        System.out.println("***** ArrayDeque *****");

        Queue<Integer> queue2 = new ArrayDeque<>();
        // It keeps the insertion order. So if I care the order, I should use ArrayDeque !!

        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));//  [10, 200, 300, 40,90] !!
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90)); // [10, 200, 300, 40, 90, 10, 200, 300, 40, 90]!!
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90)); // [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]!!
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90)); // [10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]
        //queue2.addAll(Arrays.asList(null, null, null));   ArrayDeque doesn't accept null !![NullPointerException]

        System.out.println(queue2);

        System.out.println(queue2.poll());// it returns 10 and removes it
        System.out.println(queue2.poll());// it returns 200 and removes it
        System.out.println(queue2.poll());// it returns 300 and removes it
        System.out.println(queue2.poll());// it returns 40 and removes it
        System.out.println(queue2.poll());// it returns 90 and removes it
        System.out.println(queue2.poll());// it returns 10 and removes it
        System.out.println(queue2.poll());// it returns 200 and removes it
        System.out.println(queue2.poll());// it returns 300 and removes it
        System.out.println(queue2.poll());// it returns 40 and removes it
        System.out.println(queue2.poll());// it returns 90 and removes it
        /*
               As you can see above, poll method return the first element and removes it at the same time from queue !!
               poll() method is queue interface method and child classes like PriorityQueue, ArrayDeque, LinkedList can also have that method !!
               Just a reminder: pop() method[LIFO] belongs to Stack Class. List can access that method through downcasting.
                                                                                            //((Stack)list).pop();
                        */

        System.out.println(queue2);



        System.out.println("***** LinkedList *****");

        Queue<Integer> queue3 = new LinkedList<>(); // It implements also List. So it's a list as well.


        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));//  [10, 200, 300, 40,90] !!
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90)); // [10, 200, 300, 40, 90, 10, 200, 300, 40, 90]!!
        queue3.addAll(Arrays.asList(null, null, null));

        System.out.println(queue3);
        queue3.poll();
        System.out.println(queue3);

        System.out.println( ( (LinkedList)queue3) . get (4) );

        System.out.println(((LinkedList<Integer>) queue3).pop()); // returns 200 and removes it at the same time.
        // So, Stack and LinkedList has pop method !!

        System.out.println(queue3);

        System.out.println("*****");

        List<Integer> list = new LinkedList<>(); // list can also reference to LinkedList

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list.get(1));
        System.out.println(list);

        ((LinkedList) list).poll(); // FIFO

        System.out.println(list);

        //((Stack)list).pop(); // ClassCastException [no relationship between LinkedList and stack]

        ((LinkedList) list).pop();

        System.out.println(list);

    }
}
