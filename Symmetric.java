import java.util.Scanner;

public class Symmetric
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[20][20];
		int[][] transpose = new int[20][20];
		int s,i,j,flag=0;
		
		System.out.println("Enter the size of matrix:");
		
		s= sc.nextInt();
		System.out.println("Enter the Matrix");
		for(i=0;i<s;i++)
		{
			for(j=0;j<s;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("The matrix is");
		for(i=0;i<s;i++)
		{
			System.out.println();
			for(j=0;j<s;j++)
			{
				System.out.println(matrix[i][j] +"\t");
			}
			
		}

		for(i=0;i<s;i++)
		{
			for(j=0;j<s;j++)
			{
				transpose[j][i] = matrix[i][j];
			}
		}
		
		for(i=0;i<s;i++)
		{
			for(j=0;j<s;j++)
			{
				if(matrix[i][j] != transpose[i][j])
				{
				flag =1;
				break;
				}
			}
		}
		
		if(flag ==1 )
		{
			System.out.println("The matrix is not symmetric");
		}
		
		else
		{
			System.out.println("The matrix is symmetric");
		}
	}
}
