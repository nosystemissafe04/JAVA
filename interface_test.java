interface t1
 {
  void i1();
 } 
interface t2
{
  void i2();
}
class b
{
  void b_show()
  {
  System.out.println("i am in class b which is a super class of class `a`");
  }
}
class a extends b implements t1,t2
{
  void a_show()
  {
  System.out.println("this class implements the interface t1 and t2 so here it is compulsary to define those methods which are declared in interface t1 and t2 ");
  }
  //there is an error the error is that by default the interface methods are public abstract and when i define it in here i dont specify the access modifier so it 
  //is generating an error 
  public void i1()
  {
  System.out.println("i am saying from the i1 method");
  }
  public void i2()
  {
  System.out.println("i am saying form the i2 method");
  }
}
class interface_test
{
 public static void main(String args[])
 {
  t1 obj=new a();
  obj.a_show();
  obj.i1();
  //obj.i2();
 }
}
