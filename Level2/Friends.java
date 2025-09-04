import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int ageA = sc.nextInt(), heightA = sc.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int ageB = sc.nextInt(), heightB = sc.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int ageC = sc.nextInt(), heightC = sc.nextInt();

        if (ageA < ageB && ageA < ageC)
            System.out.println("Youngest: Amar");
        else if (ageB < ageC)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        if (heightA > heightB && heightA > heightC)
            System.out.println("Tallest: Amar");
        else if (heightB > heightC)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}