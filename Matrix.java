import java.util.Scanner;

public class Matrix
{
	public static void main(String args[])
	{
		int[][] a1 = new int[10][10];
		int[][] a2 = new int[10][10];
		int[][] a3 = new int[10][10];
		int i,j,s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of matrix: ");
		s = sc.nextInt();
		
		System.out.println("Enter the first matrix: ");
		for(i=1;i<=s;i++)
		{
			for(j=1;j<=s;j++)
			{
				a1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the Second matrix: ");
		for(i=1;i<=s;i++)
		{
			for(j=1;j<=s;j++)
			{
				a2[i][j] = sc.nextInt();
			}
		}
		
		
		for(i=1;i<=s;i++)
		{
			for(j=1;j<=s;j++)
			{
				a3[i][j] = a1[i][j] + a2[i][j];
			}
		}
		
		System.out.println("The sum of Matrix is: ");
		for(i=1;i<=s;i++)
		{
			for(j=1;j<=s;j++)
			{
				System.out.println(a3[i][j] +"\t");
			}
			System.out.println();
		}
	}
}
