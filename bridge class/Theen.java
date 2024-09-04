import java .util.Scanner;
class Theen
	{
		public static void main(String[] args){
		Scanner Dheena = new Scanner(System.in);

		System.out.print("Enter one=");
		int one = Dheena.nextInt();

		System.out.print("Enter two=");
		int two = Dheena.nextInt();

		System.out.print("Enter three=");
		int three = Dheena.nextInt();
			
		if(one>two && one>three){
				System.out.println("one is greater");
			}
		else if(two>one && two>three){
				System.out.println("two is greater");

			}
		else{
			System.out.println("three is greater");
}

}
}
