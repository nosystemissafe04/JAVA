/*final*/ class A//connot inherit from final A now the class A which is created by final keyword cannot be inherited by other classes it will become constant
{
 final void show()
 {
 System.out.println("mohammadalihanfi");
 }//final method will not be overriden by any other method by using this feature no class can override this show() method 
}
class B extends A
{
 void show()
 {
 System.out.println("i am good today");
 }
}
class Final
{
 public static void main(String args[])
 {
 final int marks=40;
   System.out.println(marks);//final keyword is used to make the veriable contant it wll not change anymore
   B obj=new B();
   obj.show(); 
   }
}
