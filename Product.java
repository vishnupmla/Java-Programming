public class Product {
    int Pcde,Price;
    String Pnm;
    Product(int Pcode, String Pname, int price)
    {
        Pcde = Pcode;
        Pnm = Pname;
        Price = price;

    }

    public static void main(String args[]) {
        Product pd1 = new Product(101, "Book1", 120);
        Product pd2 = new Product(102,"Book2",160);
        Product pd3 = new Product(103, "Book3", 130);

        if(pd1.Price > pd2.Price && pd1.Price>pd3.Price)
        {
            System.out.println("Price of Product 1 is greater");
        }
        else if(pd1.Price < pd2.Price && pd2.Price>pd3.Price)
        {
            System.out.println("The price of Product 2 is greater");
        }
        else if(pd1.Price<pd2.Price && pd2.Price<pd3.Price)
        {
            System.out.println("The price of Product 3 is greater");
        }
    }
}
