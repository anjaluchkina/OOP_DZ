package OOP_dz_3;
/**
 * Фрилансер
 */

public class Freelancer extends Employee {
    private double hourlyRate;

    public Freelancer(String surName, String name, double hourlyRate, int age) {
        super(surName, name, hourlyRate, age);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {

        return 20.8 * 8 * hourlyRate;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Заработная плата (почасовая): %.2f (руб.), %d",
                surName, name, calculateSalary(), age);
    }

}