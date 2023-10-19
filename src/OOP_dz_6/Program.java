package OOP_dz_6;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     *
     * @param args
     */
    public static void main(String[] args) {
        OrderProcessing inputHandler = new OrderProcessing();
        Order order = new Order(inputHandler);
        order.saveToJson();
        System.out.println("Информация по заказу успешно сохранена в файл.");
    }
}