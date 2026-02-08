import java.util.*;
// The runtime system guarantees that static initialization blocks are called in the order that they appear in the source code.
class student{ 
 String name;
 int totalmarks;
 static int standard;
 {
System.out.println("in the initializer block in the class lets see if it is executed or not ");
//this initializer block will be executed whenever the object of the class will be created means if you create 3 object of this class it will be executed 3 time just like a constructure but it will always execute before the constructure the precedenece is static block > initializer block > constructure 
 }
 student(){
 name="";
// standard=9;//here the standard veriable is initializing every time when i create and obejct this is not good for the memory management perspective 
 totalmarks=96;
 System.out.println("in the constructre of the class !!!!");
 }
 static//we can create more than one static block in a class but its useless maybe in some case it will be usefull
 {
 standard=9;
 System.out.println("in the static block of code !!!!");
 }
}
class staticblock{
 public static void main(String args[])
  {

 // Class.forName("student");//here the only problem is it throws an exeption error ignore it 
  student obj=new student();
  obj.name="mohammadalihanfi";
  student.standard=9;
  obj.totalmarks=79;

  System.out.println(obj.name);
  System.out.println(obj.standard);
  System.out.println(obj.totalmarks);
  
  //here the student constructure will auto called when the object of the class will be created hence it will be initialize the default values which are in the constructer and by calling those values by obj1 it will refer to the default values if every student if of class 9 we can initailize it to static method which have its own 
  student obj1=new student();
  System.out.println(obj1.name);
  System.out.println(student.standard);
  System.out.println(obj1.totalmarks);

  }
//what happens when i dont create a object of the class the class will not be loaded and hence the static block will not be executed then what can we do to load a class we can use a class class the name of the class is class and the method which we are going to use is forname methode

}
// we created two obejct so the constructure is called two times and printed the text in it and initialized the default values 
//notice that static block was first to execute even after we take that below the constructure why is this happenning bcz there are two things which are done when we create and execute a object of a class 1st the class will come in existence means class will be loaded in a portion of jvm where every class we made or create and every class we use as a library will be loaded there so whenever class is loaded the static block will also be loaded and the constructre loads when the object of that class is created means when we call it so every time the static block will be loaded first but if we dont create an obejct the class will not load by creating the object the class will comen in existence to its like do whatever you want the static block will be loaded first the static block will only execute once no matter how much the object is it will be executed only once in the lifetime of the class 
