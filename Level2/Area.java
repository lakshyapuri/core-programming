import java.util.Scanner;
public class Area{
 public static void main(String args[]){
 Scanner input = new Scanner(System.in);
 System.out.println("enter base of triangle");
 double base   =  input.nextDouble();
 System.out.println("enter height of triangle");
 double height = input.nextDouble();
 
 double areaOfTriangle = 0.5*base*height;
 double areaIn = areaOfTriangle/6.4516;
 System.out.println("The Area of the triangle in sq in is" +areaIn+ "and sq cm is" +areaOfTriangle);
 }
}

