package OOP_dz_3;

/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {

    protected String name; //Имя

    protected String surName; //Фамилия

    protected int age; //Возраст

    protected double salary; //Ставка заработной платы

    public abstract double calculateSalary(); //Расчет среднемесячной заработной платы сотрудника

    public Employee(String surName, String name, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {

        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0) {
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    public int getAge() {
        return age;
    }
}