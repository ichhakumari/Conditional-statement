
//compare three numbers using if-else statements in java...
import java.util.Scanner;

class FirstClass {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a & b:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("equal number");
        } else if (a < b) {
            System.out.println("a is lesser");
        } else {
            System.out.println("a is greater");
        }

    }
}
