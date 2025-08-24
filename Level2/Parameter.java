import java.util.Scanner;
public class Parameter{
 public static void main(String args[]){
 Scanner input = new Scanner(System.in);
 System.out.println("Enter your side");
 double side  = input.nextDouble();
 double perimeter = 4*side;
 System.out.println("The length of side is " + side + " whose perimeter is " + perimeter);
 }
}