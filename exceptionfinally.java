import java.util.*;
class exceptionfinally
{
  public static void main(String args[])
  {
    int x,y;
  try {
    Scanner input=new Scanner(System.in);
    System.out.println("please enter a number");
    x=input.nextInt();
    System.out.println("please enter a number");
    y=input.nextInt();
    System.out.println(x/y);
  } catch (ArithmeticException e) {
    System.out.println(e.getMessage());
  }
  finally
  {
    System.out.println("this is finally block which is executing ");
  }
  }
}
