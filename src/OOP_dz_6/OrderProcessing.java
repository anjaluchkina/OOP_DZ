package OOP_dz_6;

import java.util.Scanner;

public class OrderProcessing {
    private Scanner scanner;

    public OrderProcessing() {
        scanner = new Scanner(System.in);
    }

    public String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}