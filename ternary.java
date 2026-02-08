import java.util.Scanner;
public class ternary{
 public static void main(String args[])
  { 
  Scanner input=new Scanner(System.in);
 
 int a=input.nextInt();
 String b="";
  b=a%2==0 ?"even": "odd";
    System.out.println(b);
   }


}
