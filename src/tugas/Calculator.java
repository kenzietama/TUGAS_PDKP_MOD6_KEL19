package tugas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public abstract class Calculator {
    private Integer[] number;
    public abstract void open();
    protected void setNumber(Integer[] input) {
        number = input;
    }
    protected Integer[] getNumber() {
        return number;
    }
    protected void clear() {
        number = new Integer[0];
    }
}

class BasicCalculator extends Calculator {
    static Scanner input = new Scanner(System.in);
    static boolean reload = false;
    private static final ArrayList<Integer> list = new ArrayList<>();
    private int add() {
        int sum = 0;
        Integer[] arraynum = getNumber();
        for (int j : arraynum) {
            sum = sum + j;
        }
        return sum;
    }
    private int substract() {
        Integer[] arraynum = getNumber();
        int substract = arraynum[0];
        for (int i = 1; i < arraynum.length; i++) {
            substract = substract - arraynum[i];
        }
        return substract;
    }
    private int multiply() {
        Integer[] arraynum = getNumber();
        int multiplied = arraynum[0];
        for (int i = 1; i < arraynum.length; i++) {
            multiplied = multiplied * arraynum[i];
        }
        return multiplied;
    }
    private double divide() {
        Integer[] arraynum = getNumber();
        double divided = arraynum[0];
        for (int i = 1; i < arraynum.length; i++) {
            divided = divided / arraynum[i];
        }
        return divided;
    }
    private void enternumber() {
        list.clear();
        boolean cancel = false;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number, type F to Finish, type C to cancel: ");
            String number = input.next();
            if (number.equals("f") || number.equals("F")) {
                break;
            } else if (number.equals("c") || number.equals("C")) {
                cancel = true;
                break;
            } else {
                list.add(Integer.parseInt(number));
            }
        }
        setNumber(list.toArray(new Integer[0]));
        if (cancel) {
            open();
        }
    }
    private void output(String operator, double result) {
        ArrayList<Integer> arlist = new ArrayList<>(Arrays.asList(getNumber()));
        for (int i = 0; i < getNumber().length; i++) {
            if (i == arlist.size()-1) {
                System.out.print(getNumber()[i]);
                break;
            }
            System.out.print(getNumber()[i] + " " + operator + " ");
        }
        System.out.println(" = "+ result +"\n");
        reload = false;
    }
    public void open() {
        boolean goback = false;
        System.out.println("Basic Calculator");
        System.out.println("1. Add\n2. Substract\n3. Multiply\n4. Divide\n5. Return to menu");
        do {
            System.out.print("Select operation: ");
            String option = input.next();
            switch (option) {
                case "1" -> {
                    enternumber();
                    output("+",add());
                    clear();
                    CalculatorApp.start();
                }
                case "2" -> {
                    enternumber();
                    output("-",substract());
                    clear();
                    CalculatorApp.start();
                }
                case "3" -> {
                    enternumber();
                    output("*", multiply());
                    clear();
                    CalculatorApp.start();
                }
                case "4" -> {
                    enternumber();
                    output("/", divide());
                    clear();
                    CalculatorApp.start();
                }
                case "5" -> goback = true;
                default -> {
                    System.out.println("Invalid input");
                    reload = true;
                }
            }
        } while (reload);
        if (goback) {
            CalculatorApp.start();
        }
    }
}

class ScientificCalculator extends Calculator {
    static Scanner input = new Scanner(System.in);
    static boolean reload = false;
    private double squareRoot() {
        double inputnum = getNumber()[0];
        return Math.sqrt(inputnum);
    }
    private void exponentiation() {
        System.out.print("Enter base number: ");
        enternumber();
        int basenumber = getNumber()[0];
        System.out.print("Enter power number: ");
        enternumber();
        int power = getNumber()[0];
        System.out.println(basenumber + "^" + power);
        System.out.println("Output = " + Math.pow(basenumber, power) + "/n");
    }
    private int factoial() {
        ArrayList<Integer> arraynum = new ArrayList<>();
        for (int i = 0; i < getNumber()[0]; i++) {
            arraynum.add(getNumber()[0]-i);
        }
        Integer[] array = arraynum.toArray(new Integer[0]);
        int fact = array[0];
        for (int i = 1; i < array.length; i++) {
            fact = fact * array[i];
        }
        return fact;
    }
    private double sin() {
        int inputnum = getNumber()[0];
        return Math.sin(Math.toRadians(inputnum));
    }
    private double cos() {
        int inputnum = getNumber()[0];
        return Math.cos(Math.toRadians(inputnum));
    }
    private double tan() {
        int inputnum = getNumber()[0];
        return Math.tan(Math.toRadians(inputnum));
    }
    private void enternumber() {
        boolean cancel = false;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter number, type C to cancel: ");
        String number = input.next();
        if (number.equals("c") || number.equals("C")) {
            cancel = true;
        } else {
            list.add(Integer.parseInt(number));
        }
        setNumber(list.toArray(new Integer[0]));
        if (cancel) {
            open();
        }
    }
    public void open() {
        boolean goback = false;
        System.out.println("Scientific Calculator");
        System.out.println("1. Square Root\n2. Exponentiate\n3. Factorial\n4. Sin\n5. Cos\n6. Tan\n7. Return to menu");
        do {
            System.out.print("Select operation: ");
            String option = input.next();
            switch (option) {
                case "1" -> {
                    enternumber();
                    System.out.println("√" + getNumber()[0] + " = " + squareRoot() + "\n");
                    clear();
                    CalculatorApp.start();
                }
                case "2" -> {
                    exponentiation();
                    clear();
                    CalculatorApp.start();
                }
                case "3" -> {
                    enternumber();
                    System.out.println(getNumber()[0] + "! = " + factoial() + "\n");
                    clear();
                    CalculatorApp.start();
                }
                case "4" -> {
                    enternumber();
                    System.out.println("sin " + getNumber()[0] + " = " + sin() + "\n");
                    clear();
                    CalculatorApp.start();
                }
                case "5" -> {
                    enternumber();
                    System.out.println("cos " + getNumber()[0] + " = " + cos() + "\n");
                    clear();
                    CalculatorApp.start();
                }
                case "6" -> {
                    enternumber();
                    System.out.println("tan " + getNumber()[0] + " = " + tan() + "\n");
                    clear();
                    CalculatorApp.start();
                }
                case "7" -> goback = true;
                default -> {
                    System.out.println("Invalid input");
                    reload = true;
                }
            }
        } while (reload);
        if (goback) {
            CalculatorApp.start();
        }
    }
}
