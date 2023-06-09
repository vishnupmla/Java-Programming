package lbcycle_3;
import java.util.Scanner;
interface Measure{
    void area();
    void perimeter();
}

class Rectangle implements Measure{
    int area,per;
    int len,bre;
    
    
    Rectangle(int len, int bre)
    {
        this.len = len;
        this.bre = bre;
    }
    public void area()
    {
        area = len*bre;
    }
    public void perimeter()
    {
        per = 2*(len+bre);
    }

    void display()
    {
        System.out.println("Area of rectangle = "+area);
        System.out.println("Perimeter of rectangle = "+per);
    }
}

class Circle implements Measure{
    int rad;
    double area,peri;
    Circle(int radius)
    {
        rad = radius;
    }

    public void area()
    {
        area = Math.PI*rad*rad;
    }

    public void perimeter()
    {
        peri = Math.PI*2*rad;
    }

    void display()
    {
        System.out.println("Area of Circle = "+area);
        System.out.println("Perimeter of Circle = "+peri);
    }
}

public class Interface6 {
    public static void main(String args[])
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\nChoose the operation you want to perform ");
            System.out.println("-------------------------------------------------");
            System.out.println("1. Find area and perimeter of Rectangle");
            System.out.println("2. Find Area and Perimeter of Circle");
            System.out.println("3. Exit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                System.out.println("Enter the Length & breadth of rectangle");
                int len = sc.nextInt();
                int bre = sc.nextInt();
                Rectangle r = new Rectangle(len,bre);
                r.area();
                r.perimeter();
                r.display();
                break;

                case 2:
                System.out.println("ENter the radius of the circle");
                int rad = sc.nextInt();
                Circle ob = new Circle(rad);
                ob.area();
                ob.perimeter();
                ob.display();
                break;

                case 3:
                break;

                default:
                System.out.println("Enter a valid choice");
            }
        }

        while(choice !=3);
        sc.close();

    }
     
}

