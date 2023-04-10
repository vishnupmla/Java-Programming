import java.util.Scanner;
 public class Marks{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [50],s,i,ttl,ttl_marks=0,mk2;
		double perc;
		System.out.println("Enter the total no.of subjects");
		s = sc.nextInt();
		System.out.println("Enter the mark out of which each subject is evaluated");
		ttl= sc.nextInt();

		System.out.println("Enter the marks of each subject");
		for(i=0;i<s;i++)
		{
   			int mk=sc.nextInt();
			if (mk > ttl)
			{
				System.out.println("Enter a valid data, Mark out of "+ttl);
				i--;
			}
			else
			{
				arr[i] =mk;
			}
		}

		for(i=0;i<s;i++)
		{
			ttl_marks = ttl_marks+arr[i];
		}
		mk2 = ttl*s;
		perc = (ttl_marks*100)/mk2;
		System.out.println("Total marks = "+ttl_marks+" Percentage obtained = "+perc);
		
	}
}
