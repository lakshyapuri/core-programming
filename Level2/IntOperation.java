import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter value of a: ");
        a = input.nextInt();
        System.out.print("Enter value of b: ");
        b = input.nextInt();
        System.out.print("Enter value of c: ");
        c = input.nextInt();

        int result1 = a + b * c;   // * before +
        int result2 = a * b + c;   // * before +
        int result3 = c + a / b;   // / before +
        int result4 = a % b + c;   // % before +

        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
    }
}
