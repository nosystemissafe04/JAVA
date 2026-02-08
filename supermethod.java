//every constructor will have super method in it 
//super method will envoke the constructor of super class 
//super methods are of two types parametrized or default
//if the super method is default it will envoke the default constructor of the super class 
// if the super method is parametrized it will envoke the constructor having arguments in it 
// it will be the part of polymorphism single entity having difference behaviours 
//the super will also have the same method is there constructor super() therefore there is no super class for a super class but in java there is always a super class of the top level class that is object class so ultimately we are calling super class which is object class and executing the constructor of object class the object class constructor is empty
class wrong extends Object
{

 public wrong()
  {
   System.out.println("in wrong method");
  }
  
  public wrong(int value)
  {
   System.out.println("in wrong method"+value);
  }
}

class right extends wrong
{
  
  public right()
   {
    System.out.println("in right method ");
   }
  
  public right(int value)
   {
    this();
    System.out.println("in right method "+value);
   }
}

class supermethod
{
  
  public static void main (String args[])
   {
    right obj=new right(3);
   }
}
