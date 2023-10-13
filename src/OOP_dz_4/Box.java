package OOP_dz_4;


import java.util.ArrayList;

public class Box<T extends Fruct> {

    ArrayList<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) { //добавление фрукта в коробку
        fruits.add(fruit);
    }

    public float getWeight() { //вычисление общего веса фруктов в коробке
        if (this.fruits.size() == 0) return 0.0F;
        return this.fruits.size() * this.fruits.get(0).getWeight();
    }


    public boolean compare(Box<?> anotherBox) { //сравнение веса текущей коробки с другой коробкой
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruits(Box<T> anotherBox) { //пересыпание фруктов
        if (this == anotherBox) {
            return;
        }

        anotherBox.fruits.addAll(fruits);
        fruits.clear();
    }
}