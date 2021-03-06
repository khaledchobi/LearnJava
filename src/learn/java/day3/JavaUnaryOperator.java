package learn.java.day3;
//Java Unary Operator Example: ++ and --
public class JavaUnaryOperator {
    public static void main(String args[]) { //

      int x=10;
      System.out.println(x++);//10 (11); shows x=10 (it should be x=11)
      System.out.println(x++);//11 (12); shows x=11 (it should be x=12)
      System.out.println(++x);//13 ;shows x=13 (it should be x=13)
      System.out.println(x--);//13 (12); shows x=13 (it should be x=12)
      System.out.println(--x);//11 ; shows x=11 (it should be x=11)
      System.out.println(x--);//11 (10); shows x=11 (it should be x=10)
      System.out.println(x--);//10 (09); shows x=10 (it should be x=09)
      System.out.println(x++);//09 (10); shows x=09 (it should be x=10)
      System.out.println(--x);//09 (09); shows x=09 (it should be x=09)
      System.out.println(++x);//10 (10); shows x=10 (it should be x=10)


      int a=10;
      int b=10;
      System.out.println(a++ + ++a);//10+12=22
      System.out.println(a++ + ++a);//12+14=26
      System.out.println(b++ + b++);//10+11=21
      System.out.println(b++ + b++);//12+13=25
      System.out.println(a++ + ++a);//14+16=30
      System.out.println(b++ + b++);//14+15=29

      // Java Unary Operator Example: ~ and !
      int c=10;
      int d=-10;

      boolean e=true;
      boolean f=false;

      System.out.println(~c);//-11 (minus of total positive value which starts from 0)
      System.out.println(~d);//9 (positive of total minus, positive starts from 0)
      System.out.println(!e);//false (opposite of boolean value)
      System.out.println(!f);//true
      }

}
