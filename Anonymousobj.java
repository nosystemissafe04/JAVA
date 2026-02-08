class Demo
{
 public Demo()
 {
 System.out.println("my name is ali hanfi");
 }
 public void show()
 {
 System.out.println("in show() method ");
 }
}
class Anonymousobj
{
 public static void main(String args[])
  {
  new Demo();//anonymouse object in java 
  //to call a method is the class demo 
  new Demo().show();
  } 
}
