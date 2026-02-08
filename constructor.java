class laptop{
 String processor;
 int ram;
 double display;
 laptop()
 {
 processor="i5";
 ram=4;
 display=16.5;
 }
 laptop(String p,int r,double d)
 {
 this.processor=p;
 this.ram=r;
 this.display=d;
 }
 public void showSpecs()
 {
 System.out.println("processor "+this.processor);
 System.out.println("RAM "+this.ram);
 System.out.println("display "+this.display);
 }
}

class constructor{
 public static void main(String args[])
  {
  laptop obj=new laptop();//here every time you create an obejct the constructor will be called and if you dont specify the constructor in the class java will autometically create its own one which is blank those constructor which have arguments in them are called parameterized constructor 
  obj.showSpecs();
  laptop obj1=new laptop("i7",8,21.5);
  obj1.showSpecs();
  }
}
