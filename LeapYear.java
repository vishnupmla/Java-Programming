import java.util.Scanner;
public class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Enter the starting range");
		int s1 = sc.nextInt();
		System.out.println("Enter the ending range");
		int s2 = sc.nextInt();

		System.out.println("The Leap Years are:");
		for(i=s1;i<=s2;i++)
		{
			if(i%4 == 0 && i%100!=0 || i%400==0) 
			{
				System.out.println(i);
			}
		}		
	}
}
