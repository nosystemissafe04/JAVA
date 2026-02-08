class A{
 
 public A()
 {
 System.out.println("in class A");
 }

}
class B extends A

{
 public B()
 {
 super();
 System.out.println("in class B");//if we call the constructor of class B the constructor of class A will also be called this is bcz in every constructor there is a method even if you dont specify it .it will always be there the method is called super which will refer to the super class which is A in over case 
 }
public B(int n)
{
 super();
 System.out.println("in parametrized constructor of B");
}
}
class superkey{

public static void main(String args[])
 {
   B obj=new B(5);//creating parameterized constructor
 }

}
