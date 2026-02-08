import java.util.Scanner;
class conditional{
 public static void main(String[] args)
  {
   Scanner input = new Scanner(System.in);
   System.out.println("enter the number of your wish");
  // byte number=Integer.parseInt(input.nextLine());
   //  byte number=input.nextByte();
    // short number1=input.nextShort();
     // System.out.println(number1);
     double number=Double.parseDouble(input.nextLine());
     System.out.println("enter the second number ");
     double number2=Double.parseDouble(input.nextLine());
      System.out.println(number);
      System.out.println(number2);
     System.out.printf("choose the operation to perform :-\n 1> '+' \n 2> '-' \n 3> '/' \n 4> '*' \n >");
   String choice=input.nextLine();
   if(choice.equals("+"))
  System.out.printf("%.2f + %.2f =%.2f",number,number2,number+number2);
   else if(choice.equals("-"))
  System.out.printf("%.2f - %.2f =%.2f",number,number2,number-number2);
   else if(choice.equals("*"))
 System.out.printf("%.2f * %.2f =%.2f",number,number2,number*number2);
   else if(choice.equals("/"))
  {
   if(number2==0)
   System.out.println("0 is denominator is not allowed");
   else
   System.out.printf("%.2f / %.2f =%.2f",number,number2,number/number2);
     } 
  }
}
