import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;;

class Rectangle{
    int x,y;
    void calculate() throws IOException
    {
        System.out.println("Enter the length and breadth of Rectangle: \n");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        x=Integer.parseInt(rd.readLine());
        y=Integer.parseInt( rd.readLine());
        System.out.println("The values are "+x+" & "+y);

    }
}

public class Dev extends Rectangle
{
    public static void main(String args[])throws IOException
    {

        Dev ob1  = new Dev();
        ob1.calculate();
    }

}