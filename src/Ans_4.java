import java.util.Scanner;
public class Ans_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter any number:");
        int num = sc.nextInt();
        for (int i = num; i >=0; --i) {
            int rem = num % 10;
            num = num/ 10;
            sum = rem + sum;
        }
        System.out.println("" + sum);
    }
}