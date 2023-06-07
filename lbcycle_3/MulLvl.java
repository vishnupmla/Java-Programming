package lbcycle_3;
import java.util.Scanner;
class Person{
    String name;
    String gender;
    String addr;
    int age;

    Person(String name,String gender,String addr,int age)
    {
        this.name=name;
        this.gender=gender;
        this.addr=addr;
        this.age=age;
    }
}

class Employee extends Person{
    int emp_id;
    String comp_name;
    String qualf;
    int salary;

    Employee(String name,String gender,String addr,int age,int emp_id,String comp_name,String qualf,int salary)
    {
        super(name,gender,addr,age);
        this.emp_id=emp_id;
        this.comp_name=comp_name;
        this.qualf=qualf;
        this.salary=salary;
    }
}

class Teacher extends Employee{
    String sub;
    String dept;
    int teach_id;

    Teacher(String name,String gender,String addr,int age,int emp_id,String comp_name,String qualf,int salary,String sub,String dept,int teach_id)
    {
        super(name, gender, addr, age, emp_id, comp_name, qualf, salary);
        this.sub=sub;
        this.dept=dept;
        this.teach_id=teach_id;
    }

    void display()
    {
        System.out.println("Employee name :"+name);
        System.out.println("Gender : "+gender);
        System.out.println("Address : "+addr);
        System.out.println("Age : "+age);
        System.out.println("Employee ID : "+emp_id);
        System.out.println("Company Name : "+comp_name);
        System.out.println("Qualification : "+qualf);
        System.out.println("Salary : "+salary);
        System.out.println("Subject : "+sub);
        System.out.println("Department : "+dept);
        System.out.println("Teacher ID : "+teach_id);
        
    }
}
public class MulLvl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int n = sc.nextInt();
        sc.nextLine();
        Teacher ob[] = new Teacher[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter details of Employee "+(i+1));
            System.out.print("\n Enter Name : ");
            String name = sc.nextLine();
            System.out.print("\nEnter Gender :");
            String gender = sc.nextLine();
            System.out.print("\nEnter address : ");
            String addr = sc.nextLine();
            System.out.print("\nEnter age : ");
            int age = sc.nextInt();
            
            System.out.print("\nEnter employee ID :");
            int emp_id = sc.nextInt();
            sc.nextLine();
            System.out.print("\nEnter company name :");
            String comp_name = sc.nextLine();
            System.out.print("\nEnter Qualification");
            String qualf = sc.nextLine();
            System.out.print("\nEnter salary :");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.print("\nEnter subject :");
            String sub = sc.nextLine();
            System.out.print("\nEnter department :");
            String dept = sc.nextLine();
            System.out.print("\nEnter Teacher ID");
            int teach_id = sc.nextInt();
            
            ob[i] = new Teacher(name,gender,addr,age,emp_id,comp_name,qualf,salary,sub,dept,teach_id);
        }

        for(int i=0;i<n;i++)
        {
            ob[i].display();
        }

        sc.close();
    }
}
