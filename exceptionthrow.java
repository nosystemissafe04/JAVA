import java.util.*;
class exceptionthrow
{

  public static void main(String argsp[])
  {
    int num;
    boolean con=true;
    while(con)
    {
    Scanner input=new Scanner(System.in);
  System.err.println("enter the any even number");
  num=input.nextInt();
  try {
    if(num%2==0)
    {
      System.err.println("the even number is ="+num);
      con=false;
    }
      else
      throw new ArithmeticException("please enter an even number which is divisible by 2 \n try again");
    }
    catch(ArithmeticException e)
    {
      System.out.println(e.getMessage());
    } 
   }
  }
}
