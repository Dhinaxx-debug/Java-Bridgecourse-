import java.util.Scanner;
class Student
	{
		public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		
		  int age = sc.nextInt();
		  int salary = sc.nextInt();
	
		  if(age>18){
		  if (salary>20000){
		 		 System.out.println("Loan is eligible");
				}
		  else{
			System.out.println("Loan is not eligible");
			
			            }
		     }
	  }