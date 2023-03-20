import java.util.Scanner;

public class Complex{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a1,a2,b1,b2;
		System.out.println("Enter the first complex number (Integer part and complex part)");
		a1 = sc.nextInt();
		a2 = sc.nextInt();
		System.out.println("The number is: "+a1+"+"+a2+"i");
		
		
		System.out.println("Enter the second complex number (Integer part and complex number part)");
		b1 = sc.nextInt();
		b2 = sc.nextInt();
		System.out.println("The number is: "+b1+"+"+b2+"i");
		
		System.out.println("The Sum of complex number = "+ (a1+b1) + " + "+ (a2+b2) +"i");
		

	}
}
