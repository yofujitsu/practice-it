import java.util.Scanner;

public class SumOfDigits {
    static int sumOfDigits(int n) {
        if(n==0) return 0;
        else return n % 10 + sumOfDigits(n/10);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; ++i) {
            int x = scan.nextInt();
            System.out.println(sumOfDigits(x));
        }
    }
}
