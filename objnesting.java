class A
{

}
class B
{
 B(A A_obj)
 {
 System.out.println("class B constructor invoked");
  }
 void show_B()
  {
  System.out.println("method of class B invoked ");
   }
}
class C
{
 C(B B_obj)
 {
 System.out.println("class C constructor invoked ");
  }
// B_obj.show_B();
}
class objnesting
{
 public static void main(String asdf[])
  {
  C obj=new C(new B(new A()));
  obj.show_B();
  }
}
