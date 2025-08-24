import java.util.Scanner;

class HeightCalculator {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        int cm = input.nextInt();

        int totalInches = (int)(cm / 2.54);  // convert cm to inches
        int feet = totalInches / 12;         // get feet
        int inches = totalInches % 12;       // remaining inches

        System.out.println("Your Height in cm is " + cm +  " while in feet is " + feet +" and inches is " + inches);
    }
}
