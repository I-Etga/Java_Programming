package daily_videos.day24_arrayListContinue;

import daily_videos.day17_customClass.practice.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLessThan4 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

      /*  System.out.println(list); // [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7]
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){
                list.remove(i); // logically it should work, but it does not.
            }

        Size of arraylist is dynamic, and we remove an element of arrayList ;
        elements will be shifted to left, so are index number of elements.
        That's why the remove method in for loop in line 14 does NOT work properly.
        // [2, 4, 5, 6, 7, 2, 4, 5, 6, 7] as we can see , some of the numbers which are less than 4 aren't removed !

        That's the one of the disadvantages that size of ArrayList is dynamic !!
        In order to remove element from ArrayList through loop , We have to have iterable, but we've not learnt that yet.

        long story short : DO NOT USE list.remove() method in loop !
         */

        System.out.println("#2 solution");

        System.out.println("*******");

        ArrayList<Integer> moreThan4 = new ArrayList<>();
        for (Integer integer : list) {
            if (integer >= 4) {
                moreThan4.add(integer);
            }
        }
        list = moreThan4; // assign !!
        System.out.println(list); // [2, 4, 5, 6, 7, 2, 4, 5, 6, 7]

        System.out.println("#3 solution list.removeIf() method");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        /*
        if the elements are unknown, we can NOT USE removeAll() / remove() method.
        I have to specify which elements I want to remove.

        If elements will be removed are unknown, I have to use list.removeIf();
        for example : remove less than four(unknown !!)

         */

        System.out.println(list2); // [1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7]

        list2.removeIf(p -> p < 4); // work with any sort of collection of any object

        System.out.println(list2); // [4, 5, 6, 7, 4, 5, 6, 7]


        System.out.println("*******");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java", "Python", "C#", "Java", "Ruby"));

        // removeIf() use it implicitly iterable !!

        names.removeIf(each -> each.equals("Java"));// [Python, C#, Ruby]

        /*
        Variable name is preferred one letter. ex: p
        It works just like for each loop. Every turn our variable will be next element of ArrayList.
                each --> element of arrayList
        removeIf(each(variable) -> condition ){
                code block}
         */

        System.out.println(names);

        System.out.println("*******");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(new Employee(), new Employee(), new Employee(), new Employee(), new Employee()));


        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        employees.removeIf(p -> p.salary > 100000); // removes employees  earn more than 100000 from list

        for (Employee employee : employees) {
            System.out.println(employee.name);
        }
    }
}

/*
 2. Write a program that can remove the elements that are less than 4, from an ArrayList of integer

            Ex:
                list = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7};

            output:
                [4, 5, 6, 7, 4, 5, 6, 7]

 */