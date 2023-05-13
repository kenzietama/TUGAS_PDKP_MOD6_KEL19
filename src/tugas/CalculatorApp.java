package tugas;
import java.util.Scanner;

public class CalculatorApp {
    static BasicCalculator basicmodule = new BasicCalculator();
    static ScientificCalculator scimodule = new ScientificCalculator();
    static void start() {
        System.out.println("Calculator available: \n1. Basic Calculator\n2. Scientific Calculator\n3. Exit");
        Scanner input = new Scanner(System.in);
        String option = input.next();
        if (option.equals("1")) {
            basicmodule.open();
        } else if (option.equals("2")) {
            scimodule.open();
        } else if (!"3".equals(option)) {
            System.out.println("Invalid input");
            start();
        }
    }
    public static void main(String[] args) {
        start();
        System.out.println("Thankyou for using this app.");
    }
}
