
class DividePens{
public static void main(String args[]){
 int totalPens =14;
 int totalStudents = 3;
 int penPerStudents = totalPens/totalStudents;
 float nonDistributedPens =totalPens%totalStudents;

 System.out.println("The Pen Per Student is"+penPerStudents+ "and the remaining pen not distributed is"+nonDistributedPens);
 }
}