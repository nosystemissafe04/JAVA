class hashstring{
 public static void main(String args[])
 {
 String myname=new String("mohammadalihanfi");
 myname=myname+"attari";
 System.out.println(myname);//here we are not changing the string we are creating a new string with a new address stored in stack and that addres will point us to a heap memory where over string resides there is a area in jvm in heap called string contant pool where all the string values are stored when we create a new string it will check the pool whether the new string is there or not if not it will create a new one or if that string is already present in the string constant pool it will just share the memory address of that string to the newly created string veriable string are constant we cannot change them we connot modify them there are two types of string mutable string or immutable string mutable string which can be changed immutable string which cannot be changed 
 String age="19";//string is a class in java  you have to create an object in  the program to run it  if we specify this  like this it will autometically create an object of it 
 System.out.println(myname);
 System.out.println(myname.hashCode());//hashcode prints integer value based on the value of the veribale it does not print the memory address 
 System.out.println(myname.capacity());

/* for(int i=0;i<myname.length();i++){
 System.out.println(myname.charAt(i));
 
 }*/
 }
}
