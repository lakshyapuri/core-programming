class Earth{
 public static void main(String args[]){
 double radius =6378;
 double volume = (4.0/3.0)*3.14*radius*radius*radius;
 double radiusMiles = radius*0.621371;
 double volumeMiles = (4.0/3.0)*3.14*radiusMiles*radiusMiles*radiusMiles;
 System.out.println("The volume of earth in cubic kilometers is"+volume+ "and cubic miles is"+volumeMiles);
 }
}
