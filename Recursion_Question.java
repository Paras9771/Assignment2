import java.util.Scanner;

public class Recursion_Question {
    public static int fabonacci(int n) {
        if(n == 0 ) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int value1 = fabonacci(n-1);
        int value2 = fabonacci(n-2);
        int fobanaccinumber = value1 + value2;
        return fobanaccinumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at position "+n+ " is "+fabonacci(n));
    }
}
