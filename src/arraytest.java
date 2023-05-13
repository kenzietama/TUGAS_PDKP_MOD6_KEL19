// Code for adding Java arrays to a program
import java.lang.*;
import java.util.*;

class arraytest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> test = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number, type e to exit");
            String number = input.next();
            if (number.equals("e")) {
                break;
            }
            test.add(Integer.parseInt(number));
        }

    }
}