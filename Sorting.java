import java.util.*;


public class Sorting{
	public static void main(String args[])
	{
	String arr[] = new String[20],temp;
	int i,j;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the no.of strings to be sorted");
	int s = sc.nextInt();
	System.out.println("Enter the strings");
	for(i=0;i<s;i++)
	{
		arr[i] = sc.next();
	}
	
	System.out.println("The words are");
	for(i=0;i<s;i++)
	{
		System.out.println(arr[i]);
	}
	
	for(i=0;i<s;i++)
	{
		for(j=i+1;j<s;j++)
		{
			if(arr[i].compareTo(arr[j])>0)
			{
				temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
			}
		}
	}
	System.out.println("The sorted words are");
	for(i=0;i<s;i++)
	{
		System.out.println(arr[i]);
	}
      }
}
