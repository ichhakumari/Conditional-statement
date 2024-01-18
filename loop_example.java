
// print the sum of first n natural numbers..
import java.util.*;

public class loop_example {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter natural number:");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;

        }
        System.out.println("sum of natural number is: " + sum);

    }
}
