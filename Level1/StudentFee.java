

import java.util.Scanner;
class StudentFee {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the fee amount: ");
        int fee = input.nextInt();

        System.out.print("Enter discount percentage: ");
        int discountPercent = input.nextInt();

        float discount = (fee * discountPercent) / 100.0f;
        float totalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + totalFee);
    }
}