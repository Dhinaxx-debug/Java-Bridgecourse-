import java.util.Scanner;
public class Arraynew 
{
	public static void main(String[] args)
	{
		int i;
		System.out.print("Enter number of values");
		Scanner Dheena = new Scanner(System.in);
		int n = Dheena.nextInt();
		int arr[]=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=Dheena.nextInt();
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
			
	}
}