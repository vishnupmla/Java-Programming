import java.util.*;
class Publisher{
	String p_name;
	Publisher(String pname)
	{
		p_name = pname;
	}
}

class Book extends Publisher{
	String b_name;
	String auth;
	float price;
	Book(String pname,String bname,String aname, float prc)
	{
		super(pname);
		b_name = bname;
		auth = aname;
		price = prc;
	}
}

class Literature extends Book{
	
	Literature(String pname,String bname,String aname,float prc)
	{
		super(pname,bname,aname,prc);
	}
	
	void display()
	{
		System.out.println("---------------Literature book----------");
		System.out.println("Publisher name : "+p_name);
		System.out.println("Book name : "+b_name);
		System.out.println("Author name : "+auth);
		System.out.println("Book Price : "+price);
	}
}

class Fiction extends Book{
	Fiction(String pname,String bname,String aname,float prc)
	{
		super(pname,bname,aname,prc);
	}
	
	void display()
	{
		System.out.println("---------------Fiction book----------");
		System.out.println("Publisher name : "+p_name);
		System.out.println("Book name : "+b_name);
		System.out.println("Author name : "+auth);
		System.out.println("Book Price : "+price);
	}
}

class Heir{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter details of the book(literature): ");
		System.out.println("Name of book: ");
		String b1name=sc.nextLine();
		System.out.println("Name of author: ");
		String a1name=sc.nextLine();
		System.out.println("Publisher name: ");
		String p1name=sc.nextLine();
		System.out.println("Price: ");
		float p1=sc.nextFloat();
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter details of the book(fiction): ");
		System.out.println("Name of book: ");
		String b2name=s.nextLine();
		System.out.println("Name of author: ");
		String a2name=s.nextLine();
		System.out.println("Publisher name: ");
		String p2name=s.nextLine();
		System.out.println("Price: ");
		float p2=s.nextFloat();
		System.out.println(" ");
		
		
		Literature l=new Literature(b1name,a1name,p1name,p1);
		l.display();
		System.out.println(" ");
		
		
		Fiction f=new Fiction(b2name,a2name,p2name,p2);
		f.display();
	}
}
