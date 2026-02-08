 abstract class useme
{
  abstract void show();
  abstract void test();
}

 class testing extends useme
{
  void show()
  {
  System.out.println("in the testing class and i will not override the test method in this class lets see what will happen ");
  }
}
public class test_abstraction
{
 public static void main(String args[])
 {
  testing t=new testing();
  t.show();
 }
}
