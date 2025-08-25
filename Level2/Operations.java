import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fee: ");
        double fee = input.nextDouble();
        System.out.print("Enter Discount Percent: ");
        double discountPercent = input.nextDouble();

      
        double result1 = fee - (fee * discountPercent / 100);  
        double result2 = fee % discountPercent;                
        double result3 = fee / discountPercent;                
        System.out.println("The results of Double Operations are "  + result1 + ", " + result2 + ", and " + result3);
    }
}
