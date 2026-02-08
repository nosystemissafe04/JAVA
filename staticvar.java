class pc{
 String motherboard;
 String ram;
 static int totalcores;
 public void display(){
  System.out.print("motherboard ="+motherboard+"\n"+"ram ="+ram+"\n"+"totalcores ="+totalcores+"\n");
 }
}
class staticvar{
 public static void main(String args[])
  {
  pc obj=new pc();
  obj.motherboard="gigabyte";
  obj.ram="4GB";
  pc.totalcores=6;

  pc obj1=new pc();
  obj1.motherboard="ASUS";
  obj1.ram="8GB";
  pc.totalcores=8;//the static keyword is used when we want to something to be common in object means every object creted of class pc will share the same memory of totalcores as it is static member of class now it is member of class so we can call it by directly by class there is a area in heap memory where static variables are stored in and every obejct will point to that address so if i change the value of totalcores it will be changed to whole program globally hence compiler will compile the code line by line so if the value of totalcores were different before and after the value of it will be overwritten by the after statement that comes later in the code same as main method it is also a static method 
  pc.totalcores=10;

  obj.display();
  obj1.display();
  }
}
