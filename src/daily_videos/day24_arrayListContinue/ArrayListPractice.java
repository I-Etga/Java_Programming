package daily_videos.day24_arrayListContinue;

import java.util.ArrayList;
import java.util.Arrays;

import daily_videos.day17_customClass.practice.Employee;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));

        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");


        System.out.println("\n*** #1 print name and job-title of each employee ***\n");
        for (Employee employee : employees) {
            System.out.println(employee.name + " " + employee.jobTitle);
        }

        System.out.println("\n*** #2 print names of employee whose job-title is Java Developer ***\n");
        for (Employee employee : employees) {
            if (employee.jobTitle.equals("Java Developer")) {
                System.out.println(employee.name);
            }
        }

        System.out.println("\n*** #3 print min and max salary ***\n");
        double min = Double.MAX_VALUE; // employees.get(0).salary (alternative)
        double max = Double.MIN_VALUE; // employees.get(0).salary (alternative)

        for (Employee employee : employees) {
            if (employee.salary > max) {
                max = employee.salary;
            }

            if (employee.salary < min) {
                min = employee.salary;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("\n*** #4 create female- and male employees ArrayList and add employees according to gender to lists and print ***\n");
        ArrayList<Employee> femaleEmployees = new ArrayList<>();
        ArrayList<Employee> maleEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee.gender == 'M') {
                maleEmployees.add(employee);
            }
            if (employee.gender == 'F') {
                femaleEmployees.add(employee);
            }
        }

        System.out.println("maleEmployees = " + maleEmployees);
        System.out.println("Total number of male employees: " + maleEmployees.size());
        System.out.println();
        System.out.println("femaleEmployees = " + femaleEmployees);
        System.out.println("Total number of female employees: " + femaleEmployees.size());

    }
}
