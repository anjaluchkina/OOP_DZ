package OOP_dz_7;

public class Specialist implements Observer {

    private String name;
    private int salary = 100000;


    public Specialist (String name) {
        this.name = name;
    }

    public void receiveOffer(Vacancy vacancy) {
        if (vacancy.getType() == Vacancy.Type.Specialist) {
            if (this.salary <= vacancy.getSalary()) {
                System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                        name, vacancy, salary);
                this.salary = vacancy.getSalary;
                vacancy.closeVacancy();
            } else {
                System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                        name, vacancy, salary);
            }
        }

    }

    @Override
    public String toString() {
        return String.format("Специалист %s, желаемая заработная плата %d", name,salary);
    }
}