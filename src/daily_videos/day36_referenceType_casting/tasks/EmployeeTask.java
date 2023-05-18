package daily_videos.day36_referenceType_casting.tasks;

import daily_videos.day33_abstraction.employeeTask.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTask {
    public static void main(String[] args) {
        Employee[] employees = {

                new Tester("Hamza", 32, 'M', "A01", "QA", 110000),
                new Developer("Lucy", 27, 'F', "A02", "Java Developer", 128000, "Java"),
                new Tester("George", 28, 'M', "A03", "SDET", 120000),
                new Developer("Yulia", 23, 'F', "A04", "Software Developer", 135000, "Python"),
                new Tester("Cihad", 30, 'M', "A05", "SDET", 105000),
                new Developer("Gulistan", 26, 'F', "A06", "Web Developer", 130000, "Python"),
                new Tester("Nora", 28, 'F', "A07", "QE", 120000),
                new Driver("Aaron", 48, 'M', "D1", "Truck Driver", 90000),
                new Driver("Bella", 32, 'F', "D12", "Truck Driver", 95000),
                new Developer("Diana", 29, 'F', "A08", "Front-end Developer", 140000, "C#"),
                new Tester("Tatiana", 25, 'F', "A09", "SDET", 130000),
                new Developer("Alena", 26, 'F', "A10", "Back-end Developer", 150000, "Java"),
                new Tester("Timur", 29, 'M', "A11", "SDET", 115000),
                new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000),
                new Developer("Hasan", 26, 'F', "A12", "Full Stack Developer", 142000, "Java"),
                new Tester("Nataliia", 24, 'F', "A13", "QE", 125000),
                new Developer("Ermek", 26, 'M', "A14", "Full Stack Developer", 142000, "Java"),
                new Tester("Khashayar", 30, 'M', "A15", "SDET", 105000),
                new Teacher("Conor", 35, 'M', "B2", "Physics Teacher", 85000),
        };

        System.out.println("****** 2.1 *****");
        List<Employee> scrumMembers = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee instanceof Tester || employee instanceof Developer) {
                scrumMembers.add(employee);
            }
        }
        System.out.println(scrumMembers);


        System.out.println("****** 2.2 *****");

        List<Tester> testers = new ArrayList<>();

        for (Employee employee : employees) {
            if (employee instanceof Tester) {
                testers.add((Tester) employee);
            }
        }
        System.out.println(testers);

        System.out.println("****** 2.3 *****");

        List<Developer> developers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee instanceof Developer) {
                developers.add((Developer) employee);
            }
        }
        System.out.println(developers);

        System.out.println("****** 2.4 *****");

        Tester chefTester = testers.get(0);

        for (Tester tester : testers) {

            if (tester.getSalary() > chefTester.getSalary()) {
                chefTester = tester;
            }
        }
        System.out.println(chefTester);

        System.out.println("****** 2.5 *****");

        Developer chefDeveloper = developers.get(0);

        for (Developer developer : developers) {
            if (developer.getSalary() > chefDeveloper.getSalary()) {
                chefDeveloper = developer;
            }
        }
        System.out.println(chefDeveloper);
    }


}
