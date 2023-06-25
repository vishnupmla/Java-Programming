package lbcycle_3;
import java.util.Scanner;
interface Student
{
    void academics(String stname,int rollno, float marks);
}

interface Sports{
    void activities(float score);

}

class Result implements Student,Sports{
    String name;
    int roll;
    float marks;
    float score;

    public void academics(String stname,int rollno,float marks)
    {
        name = stname;
        roll = rollno;
        this.marks = marks;
    }

    public void activities(float score)
    {
        this.score = score;
    }

    void display()
    {
        System.out.println("Student name : "+name);
        System.out.println("Registration number :"+roll);
        System.out.println("Academics marks :"+this.marks);
        System.out.println("Sports marks :"+score);
    }
}

public class Interface5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student name");
        String name = sc.nextLine();
        System.out.println("Enter the Roll no");
        int roll = sc.nextInt();
        System.out.println("Entter the academics marks");
        float marks = sc.nextFloat();
        System.out.println("Enter the sports activity score");
        float score = sc.nextFloat();
        sc.close();

        Result ob = new Result();
        ob.academics(name, roll, marks);
        ob.activities(score);
        ob.display();
    }
}
