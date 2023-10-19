package OOP_dz_6;

import java.io.FileWriter;
import java.io.IOException;

public class Order {

    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(OrderProcessing inputHandler) {
        clientName = inputHandler.prompt("Имя клиента: ");
        product = inputHandler.prompt("Продукт: ");
        qnt = Integer.parseInt(inputHandler.prompt("Кол-во: "));
        price = Integer.parseInt(inputHandler.prompt("Цена: "));
    }


    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + clientName + "\",\n");
            writer.write("\"product\":\"" + product + "\",\n");
            writer.write("\"qnt\":" + qnt + ",\n");
            writer.write("\"price\":" + price + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}