class emp{
 String name;//these are instance veriable or global veriable 
 int salary;
 String gender;
}
class enhancedloop{
 public static void main(String args[])
 {
 emp obj=new emp();//creating objects 
 obj.name="mohammadalihanfi";//passing value to instance veriable
 obj.salary=12000;
 obj.gender="male";

 emp obj1=new emp();
 obj1.name="sunita gupta";
 obj1.salary=10000;
 obj1.gender="female";

 emp obj2=new emp();
 obj2.name="ashwin raikwar";
 obj2.salary=300;
 obj2.gender="custom";
 
 emp arr[]=new emp[3];//creating an array In Java, the class is also a user-defined data type
 arr[0]=obj;//initializing the obj to array
 arr[1]=obj1;//it is not the object itself that is stored in the array but the reference of the object.
 arr[2]=obj2;

 for(emp e : arr)//it says give me one value at a time array of objects can store the refreneced of the objects those object can be accessed by this new variable e and with objects we can access enstance veriable of the class
 {
 System.out.println(e.name);
 System.out.println(e.salary);
 System.out.println(e.gender);
 }
// System.out.println(obj);
 }
}
