
//use switch case for greeting
import java.util.Scanner;

public class conditions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter button");
        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("Namaste");
                break;

            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Radhe-Radhe");
                break;
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
