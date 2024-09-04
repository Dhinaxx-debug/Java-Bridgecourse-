import java.util.Scanner;
class Sampleelse
	{
		public static void main(String[] args){

		Scanner Dheena = new Scanner(System.in);
		int age = Dheena.nextInt();
		if(age >= 18)
			{
				System.out.println("You are eligible");
			}

		else
			{
				System.out.println("You are not eligible");
			}		
	}
}