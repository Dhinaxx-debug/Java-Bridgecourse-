import java.util.Scanner;
public class Arraymarks
{
	public static void main(String[] args)
	{ 
		int size,sum=0;
		float average;
		Scanner Dheena = new Scanner(System.in);
		System.out.println("Enter the size ");
		size = Dheena.nextInt();
		int marks[] = new int [size];
		for(int i=0;i<size;i++){
		marks[i]=Dheena.nextInt();
		sum = sum+marks[i];
             }
		System.out.println(sum);
		average = sum/size;
		
		System.out.println(average);

		
	}
}