package OOP_dz_2;

public class Cat {
    private String name;
    private int appetite;
    private boolean fed;

    public Cat(String name, int appetite, boolean fed) {
        this.name = name;
        this.appetite = appetite;
        this.fed = fed;

    }

    public Cat(String name, int appetite) {
        this(name, appetite, false);
    }


    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean eat(Plate plate) {
        int foods = plate.getFood() - this.getAppetite();

        if (foods >= 0) {
            plate.setFood(foods);
            System.out.printf("Кот %s стал сытым. \n", name);
            return true;
        }

        System.out.printf("Коту по имени %s не хватает еды, в тарелке осталось %d еды," +
                " а ему нужно %d. \n", name, plate.getFood(), appetite);
        return false;
    }

}