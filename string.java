class string{
  public static void main(String[] args){
   String myname ="mohammadalihanfi"; System.out.println(myname); String 
   Myname=new String("mohammadalihanfi"); 
   System.out.println(Myname); 
   System.out.println(myname==Myname);
   System.out.println("here you can see both the string are same but there are two different methodes are used for the creation of the string hence the 1st methode is mostly used as JVM java vertual machine compiles the string and put them in a string pool so the same string implemented twice will be considerd as sharing same memory means it will point to a same address of the memory and other methode will create an object of that string and it will create a new one even if the content of it is same hence it will take more memory than the first one so its wise to implement string from the first method  ");
  }
 }
