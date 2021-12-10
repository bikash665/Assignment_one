import java.util.Scanner;
public class Ans_7Floating {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input first floating point number: ");
        double num1 = sc.nextDouble();
        System.out.print("Input second floating point number: ");
        double num2 = sc.nextDouble();
        sc.close();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        } else {
            System.out.println("These numbers are different.");
        }
    }
}
