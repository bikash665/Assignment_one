import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,f;
        System.out.println("\nEnter n value:  ");
        n=sc.nextInt();
        System.out.println("\nPrime numbers are : ");
        for(int i=2;i<=n;i++)
        {
            f=0;
            for(int j=2;j<=i/2;j++)
                if((i%j)==0)
                {
                    f=1;
                    break;
                }
            if(f==0)
                System.out.print(i+"   ");
        }
    }
}
