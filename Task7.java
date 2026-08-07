import java.util.Scanner;
public class Task7{
    public static int add(int a, int b){
        return a + b;
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Sum: " + add(num1, num2));
        System.out.println("Difference: " + subtract(num1, num2));
        System.out.println("Product: " + multiply(num1, num2));

        if (num2 == 0){
            System.out.println("Quotient: Cannot divide by zero");
        } else {
            System.out.println("Quotient: " + divide(num1, num2));
        }

        input.close();

    }
}