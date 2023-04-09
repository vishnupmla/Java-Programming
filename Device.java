import java.util.Scanner;
class Cpu{
	int price;
	Scanner sc = new Scanner(System.in);
	Processor p1 = new Processor();
	
	Cpu(int price)
	{
		this.price=price;
	}
	void display()
	{
		p1.read();
		p1.display();
		System.out.println("The price of CPU: "+price);
	}

	class Processor{
		int coreno;
		String manf;
		
		void read()
		{
			System.out.println("Enter the No of cores of CPU");
			coreno = sc.nextInt();
			System.out.println("Enter the manufacturer");
			manf = sc.next();
		}
		void display()
		{
			
			System.out.println("CPU cores : "+coreno);
			System.out.println("CPU Manufacture : "+manf);

		}
	}
	static class Ram{
		int mem;
		String manf;
		Ram(int memory, String manufacture)
		{
			this.mem=memory;
			this.manf=manufacture;
		}

		void display1()
		{
			System.out.println("Memory size : "+mem+"GB");
			System.out.println("CPU Manufacture : "+manf);
		}
	}

	
}

public class Device{
	public static void main(String rgs[])
	{
		
		Scanner sc = new Scanner(System.in);
		int price,mem;
		String manf;
		System.out.println("Enter the Price: ");
		price = sc.nextInt();
		System.out.println("Enter the Memory size: ");
		mem = sc.nextInt();
		System.out.println("Enter the Manufacturer details: ");
		manf=sc.next();
		Cpu o1 = new Cpu(price);
		Cpu.Ram o2 = new Cpu.Ram(mem, manf);
		o1.display();
		o2.display1();
	}
}