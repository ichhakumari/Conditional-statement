import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers:");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println("select option\n 1 add \n 2 sub \n 3 mul\n 4 div \n 5 mod");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                int sum = number1 + number2;
                System.out.println("Addition of two numbers is: " + sum);
                break;

            case 2:
                int dif = number1 - number2;
                System.out.println("Subtraction of two numbers is: " + dif);
                break;

            case 3:
                int mul = number1 * number2;
                System.out.println("Multiplication of two numbers is: " + mul);
                break;

            case 4:
                if (number2 == 0) {
                    System.out.println("Invalid division");
                } else {
                    System.out.println(number1 / number2);
                }

                break;

            case 5:
                if (number2 == 0) {
                    System.out.println("Invalid division");
                } else {
                    System.out.println(number1 % number2);

                }
                break;

            default:
                System.out.println("invalid option");
                break;
        }

    }
}
