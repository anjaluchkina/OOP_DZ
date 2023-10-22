package OOP_dz_7;

import java.util.Random;

public class Company {

    private Random random;

    private String nameCompany;

    private int maxSalary;

    private Publisher jobAgency;


    public Company(String nameCompany, Publisher jobAgency, int maxSalary) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        random = new Random();
    }


    public void needEmployee(Vacancy.Type type) {
        int salary = 0;
        switch (type) {
            case Student:
                salary = random.nextInt(3000, maxSalary);
                break;
            case Master:
                salary = random.nextInt(40000, maxSalary);
                break;
            case Specialist:
                salary = random.nextInt(70000, maxSalary);
                break;
            default:
                break;
        }

        Vacancy vacancy = new Vacancy(type, nameCompany, salary);
        jobAgency.sendOffer(vacancy);
    }

}