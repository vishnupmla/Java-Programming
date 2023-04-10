import java.util.*;
public class SortChar{
	public static void main(String args[])
	{
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to be sorted");
		s = sc.nextLine();
		char str[] = s.toCharArray();
		Arrays.sort(str);
		System.out.println("Sorted string ="+ new String(str));
	}
}
