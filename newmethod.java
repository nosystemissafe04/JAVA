import java.util.*;//this will import all the .util classes with the help of a wildcard *
class store{
 public String icecreame(int price)//getting a parameter from newmethod class 
 {
  if(price>=20)
  return "your ice creame";//if this return statement will execute the program pointer will go back where this method is called so the return statement after this return will not be executed 

  return "not in this price and this shop doesnt have any bargaining schemes... \nand have a good day boy!!!!.....";//take a loop \n is also allowed in return statements 
  }
}
class newmethod{
 public static void main(String args[])
 {
 Scanner input=new Scanner(System.in);
 System.out.printf("give the amount for purchasing icecream\n>");
 int amount =input.nextInt();
 store str=new store();//creating a obejct of class store 
 String product=str.icecreame(amount);//calling .icecreame method of class store and initializing the return value in product 
 System.out.println(product);
 }
}
