class demo1{
 int age;
 int rolln;
 int standard;
 public static String greeting(){

 System.out.printf("%d\n%d\n%d \n",this.age,this.rolln,this.standard);
 System.out.println("in the static method of the class demo executed without the object of the class bcz it is a static method so we can call it by the class name");
  return "good morning boys!!";
 }
 // the error is non static veriable cannot be refered to a static method 
 //this error is generated when we call a non static veriable in a static method bcz the program cannot differentiate which value to print on that veriable those instance veriable are initialized by the object of the class so by calling them with the object can determise which object have which values in those instance veriable so in static method it connot defferentiate the value of different object so it throws an error if we pass the object in arguments it will work
}
class staticexp{
 public  static void main(String args[])
  {
 demo1 obj=new demo1();
 obj.age=12;
 obj.rolln=12344;
 obj.standard=9;
// demo1.greeting(obj);
 System.out.println(demo1.greeting());
  }
}
//from the starting we see that the main method is always have static keyword in that this is bcz if main is not a static method we have to create an object of it to execute the main method as execution starts from main method of the class we cant create obj of main method so we use static method of main to execute the class but the doubt is that if the main method dont need an obejct so how this class is loaded in the jvm bcz we see earlier that static veriable loaded when the class is loaded and class will be loaded when the object of the class will be created means class will come in existence when the object of it is created but we are not creating any object of main class 
