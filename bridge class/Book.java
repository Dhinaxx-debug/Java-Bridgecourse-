import java.util.Scanner;
class Book
	{
		public static void main(String[] args){
		Scanner Dheena = new Scanner(System.in);

		System.out.print("Enter A =");
		int a = Dheena.nextInt();

                System.out.print("Enter B =");
		int b = Dheena.nextInt();
		
		if(a>b){
				System.out.println(a +"  is greater than B");

			}
		else{
				System.out.println(b + "  is greater than A");

			 } 	

}

}