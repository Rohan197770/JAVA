
class Pen 
{
    String color;
    String type;

  public  void print()
  {
      System.out.println("Something Write");
  }
  public void printColor()
  {
      System.out.println(this.color);
  }
  void write()
  {
      System.out.println("Rohan");
  }
}
class Pencil extends Pen{

    public void print()
    {
        
    }
}
public class OOPS {

    static int solve(int x)
    {
        return x+3;
    }
    static int fib(int n)
    {
        if(n<=1)
        {
            return n;
        }

        return fib(n-1)+fib(n-2);
    }

    public static void main(String args[])
    {
         Pen p1= new Pen();
         p1.color="Red";
         p1.type="Ball";

         p1.print();
         p1.printColor();
         Pen p2= new Pen();
         p2.printColor();

         System.out.println(solve(5));
         System.out.println(fib(5));

         p1.write();

    }
    
}
