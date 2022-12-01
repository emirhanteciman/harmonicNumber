import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value for n: ");
        int n = scan.nextInt();
        double result = 0.0;
        for (double i = 1; i <= n; i++) {
            result += (1/i);
        }
        System.out.println(result);
    }
}