package OOP_dz_2;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Луна", 10);
        Cat cat2 = new Cat("Багира", 15);
        Cat cat3 = new Cat("Веснушка", 20);
        Cat cat4 = new Cat("Фортуна", 25);
        Cat cat5 = new Cat("Дымка", 30);
        Cat cat6 = new Cat("Куся", 35);
        Cat cat7 = new Cat("Ласка", 40);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        cats.add(cat6);
        cats.add(cat7);

        Plate plate = new Plate(100);

        if (plate.getFood() < 10) {
            plate.addFood(100);
        }
        for (Cat cat : cats) {
            boolean isEaten = cat.eat(plate);
            if (!isEaten) {
                cat.eat(plate);
            }
        }
        plate.info();
    }

}
