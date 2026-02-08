class emp{
 String name;//these are instance veriable or global veriable 
 int salary;
 String gender;
}
class objarr{
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

 for(int i=0;i<arr.length;i++)//printing the instance veriable 
  {
  System.out.println(arr[i].name);
  System.out.println(arr[i].salary);
  System.out.println(arr[i].gender);
  System.out.println();
  }
// System.out.println(obj);
 }
}
