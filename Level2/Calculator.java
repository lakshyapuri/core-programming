import java.util.Scanner;
class Calculator{
 public static void main(String args[]){
  Scanner input = new Scanner(System.in);
  System.out.println("Enter num1:");
  float num1 = input.nextFloat();
  System.out.println("Enter num2:");
  float num2 =  input.nextFloat();
  float add = num1+num2;
  float sub = num1-num2;
  float mul = num1*num2;
  float div = num1/num2;
  System.out.println("The addition of " + num1 + " and " + num2 + " is " + add);
  System.out.println("The subtraction of " + num1 + " and " + num2 + " is " + sub);
  System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + mul);
  System.out.println("The division of " + num1 + " and " + num2 + " is " + div);
 }
}