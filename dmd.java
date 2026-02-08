class A
{
 void show()
 {
  System.out.println("in class A ");
  }
}
class B extends A
{
 void show()
 {
 System.out.println("in class B");
 }
}
class dmd
{
 public static void main(String args[])
 {
 B obj=new A();
 obj.show();
 obj=new B();
 obj.show();
 }
 //this is run time polymorphism where at run time it will decide which show() method will  be executed of which class by creating the obj if class A obj is created the show() method of class A will be called hence object is a blueprint of class so it is obvious that it will call that method if you reallocate or reinitialize the obj to a new class it will call that method of that class inheritance is must in dynamic method dispatch and the reference should be of a parent class or super class  
}
