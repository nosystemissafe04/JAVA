//this concept of creating things gernalize will so be done withthe simple inheritance 
//but the catch is here we cannot only declare the method in a simple class we have to define it otherwise it will give an error but is abstract class we can only declare it in abstract class and use in a subclass as you want to behave in that perticular class it will increase the code reusability :
class abstraction
{
  abstraction()
  {
  System.out.println("constructor of abstraction class is invoked ");
  }
  void run();

}
class honda extends abstraction
{
  honda()
  {
System.out.println("constructor of honda class in invoked ");
  }
  void run()
   {
   System.out.println("running the honda bike from honda class");
   }
  
}
class maruti extends abstraction
 {
 void car()
   {
 System.out.println("maruti car is running ");
   }
 } 
public class abstraction_run
{
  public static void main(String args[])
  {
  abstraction ab=new honda();
  maruti m=new maruti();
  m.car();
  }
}
