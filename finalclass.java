class B
{
 void show()
  {
  System.out.println("this is a superclass of a final class ");
  }
}
final class A extends B
{
  void no_name()
  {
  System.out.println("this is a final subclass of a super class ");
  }
}
class finalclass
{
 public static void main(String args[])
  {
  A obj=new A();
  obj.show();
   }
}
