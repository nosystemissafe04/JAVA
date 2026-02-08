import java.util.*;//this will import all the .util classes with the help of a wildcard *
class store{
 public String goods(int price)//getting a parameter from newmethod class 
 {
  if(price>=20)
   return "your ice creame";

   return "the price is not sufficient to buy this product ";
    }
  public String goods(int exp,int tilldate,int price)
  {
   return exp<tilldate?"this product have been expired sorry for inconvineance":price>=20?"here is your icecream":"the price is not sufficient to buy an icecream";
  }
}
class overloading{
 public static void main(String args[])
 {
 Scanner input=new Scanner(System.in);
 System.out.printf("enter the amount of prize \n>");
 int price=input.nextInt();
  store obj=new store();
  String purchase=obj.goods(price);
  System.out.println(purchase);
  int exp=2024;
  System.out.printf("enter todays date \n>");
  int tilldate=input.nextInt();
  purchase=obj.goods(exp,tilldate,price);
  System.out.println(purchase);
 }
}
