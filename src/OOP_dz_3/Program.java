package OOP_dz_3;

import java.util.Arrays;
import java.util.Random;

public class Program {
    private static final Random random = new Random();

    static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен"};
        String[] surNames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков"};

        String surName = surNames[(random.nextInt(surNames.length))];
        String name = names[(random.nextInt(names.length))];

        int salary = random.nextInt(50000, 120000);
        int hourlyRate = random.nextInt(1000, 50000);

        int age = random.nextInt(25, 40);

        int employeeType = random.nextInt(2);

        if (employeeType == 0) {
            return new Freelancer(surName, name, hourlyRate, age);
        } else {
            return new Worker(surName, name, salary, age);
        }

    }

    static Employee[] generateEmployees() {
        Employee[] array = new Employee[15];
        for (int i = 0; i < array.length; i++)
            array[i] = generateEmployee();
        return array;
    }

    public static void main(String[] args) {

        Employee[] employees = generateEmployees();

        Arrays.sort(employees, new AgeComparator(SortType.Ascending));


        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println();

    }
}