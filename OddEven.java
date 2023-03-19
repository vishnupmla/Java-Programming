import java.util.Scanner;
public class OddEven {
    public static void main(String args[]) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check Odd or Even: ");
        a = sc.nextInt();

        if (a %2 == 0)
        {
            System.out.println("The number is Even");
        }
        else{
            System.out.println("The number is odd");
        }

    }
}
