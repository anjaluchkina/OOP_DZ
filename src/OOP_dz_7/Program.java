package OOP_dz_7;

public class Program {

    public static void main(String[] args) {


        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 110000);
        Company yandex = new Company("Yandex", jobAgency, 70000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 90000);

        Student student1 = new Student("Студент №1");
        Master master1 = new Master("Мастер №1");
        Master master2 = new Master("Мастер №2");
        Specialist specialist1 = new Specialist("Специалист №1");
        Specialist specialist2 = new Specialist("Специалист №2");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(specialist1);
        jobAgency.registerObserver(specialist2);

        System.out.println("Вакансии готовы к рассылке:");
        System.out.println("Все соискатели:");
        jobAgency.allObservers();
        System.out.println("\n\nВсе активные вакансии:");
        jobAgency.allActiveVacancies();

        for (int i = 0; i < 5; i++){
            google.needEmployee(Vacancy.Type.Specialist);
            yandex.needEmployee(Vacancy.Type.Master);
            geekBrains.needEmployee(Vacancy.Type.Student);
        }

    }
}