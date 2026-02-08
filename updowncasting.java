class parent 
{
 public void display()
 {
 System.out.println("message from a parent class");
 }
}
class child extends parent
{
public void display()
 {
System.out.println("message form a child class");
 }
}
class updowncasting
{
 public static void main(String args[])
  {
   parent obj=(parent) new child();
   obj.display();
   parent obj1=(child) new parent();
  }
}
