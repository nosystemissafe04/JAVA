class test{
public void testing()
 {
 int age=19;//this is a local veriable so the obj cant access it from outside the class bcz the scope of this veriable is only inside the method 
 System.out.println(age);
 }
 public void testing1()
 {
 this.testing();
 System.out.println(this);
 }
}

class thiskey{
public static void main(String args[])
 {
 test obj=new test();
// System.out.println(obj.age);
 obj.testing1();
 System.out.println(obj);//by the help of this program you will understand that this keyword contains the reference of the object so you will think that what happends if we dont create the object well if you dont create an object the class will not be loaded and it will not be executed 
 }
}
