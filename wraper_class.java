class wraper_class{
  public static void main(String args[])
  {
    int a=12;
    Integer a1=new Integer(13);//this syntax is depricated but this will work fine we are assigning a primitive value to a reference veriable which is a object in this case and this method is called boxing because we are boxing a primitive veriable in a object veriable like we are placing a object in a box 
    Integer a2=a;//this syntax is not deprivated hence no warning is shown here 
                 //here the primitive value is converted into object autometically hence this method is called autoboxing 
    System.out.println(a2);
    System.out.println(a1);
    A obj=new A();
    System.out.println("value of the veraibale b ="+A.func(20));
    obj.demo();
    //A obj1=new A();
    System.out.println(obj);
    //System.out.println(obj1);
   //boolean doit=obj.equals(obj1)?true:false;
   //System.out.println(doit);
  }
}
class A{
  int b;
  public static int func(int b)
  {
    return b;
  }
  
  public void demo()
  {
  int a=10;
   System.out.println(a);
  }
}
