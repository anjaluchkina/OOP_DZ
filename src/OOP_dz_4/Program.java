package OOP_dz_4;

public class Program {

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>(); // создали коробку с яблоками
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        Box<Orange> orangeBox = new Box<>(); // создали коробку с апельсинами
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        Box<Apple> anotherAppleBox = new Box<>(); // доп коробка с яблоками
        anotherAppleBox.addFruit(new Apple());
        anotherAppleBox.addFruit(new Apple());

        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());

        System.out.println("Сравнение коробки с яблоками и с коробкой для апельсинов: " + appleBox.compare(orangeBox));
        System.out.println("Сравнение 2-х коробок с яблоками: " + appleBox.compare(anotherAppleBox));

        appleBox.transferFruits(anotherAppleBox);

        System.out.println("Вес 1-ой коробки с яблоками после пересыпания: " + appleBox.getWeight());
        System.out.println("Вес 2-ой коробки с яблоками после пересыпания: " + anotherAppleBox.getWeight());
    }
}