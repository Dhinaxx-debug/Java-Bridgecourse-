import java.util.Scanner;
public class Dheenax
	{
		public static void main(String[] args)
		{
			Scanner dhina=new Scanner(System.in);
			
			System.out.print("Your name:");
			String name=dhina.nextLine();
			

			System.out.print("Your age:");
			int num=dhina.nextInt();
			
			
			System.out.print("Your RTC NUM:");
			dhina.nextLine();
			String RTCNUM = dhina.nextLine();
			System.out.println(RTCNUM);
			System.out.println(num);
			System.out.println(name);

		}
		
	}