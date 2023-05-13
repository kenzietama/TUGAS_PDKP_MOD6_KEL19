package test;
import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your id: ");
        int id = scanner.nextInt();

        System.out.println("---------------------------------------------------------");

        Company vicePresident = new VicePresident(name);
        vicePresident.id = id;
        vicePresident.details();

        System.out.println("---------------------------------------------------------");

        Company manager = new Manager(name);
        manager.id = id;
        manager.details();
    }
}
