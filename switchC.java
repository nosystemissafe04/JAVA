import java.util.Scanner;
class switchC{
 public static void main(String[] args)
  {
 Scanner input=new Scanner(System.in);
  System.out.println("enter the first number >");
  double number=Double.parseDouble(input.nextLine());
  System.out.println("enter the second number");
  double number2=Double.parseDouble(input.nextLine());
  System.out.println("enter the operation to be performed");
  String operation=input.nextLine();
  switch(operation)
  {
  case "addition":
   System.out.printf("%f+%f=%f",number,number2,number+number2);
   break;
   case "substraction":
   System.out.printf("%f-%f=%f",number,number2,number-number2);
   break;
 case "multiplication":
   System.out.printf("%f*%f=%f",number,number2,number*number2);
   break;
 case "division":
   if(number2==0)
  {
   System.out.println("0 in the dinominator is not allowed");
   break;
   }
  else
   System.out.printf("%f+%f=%f",number,number2,number+number2);
   break;
   default:
   System.out.println("following is not an operation please take a look at the manual");
   }
    }
}
