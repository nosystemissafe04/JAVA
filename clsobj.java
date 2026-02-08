class name{
 public String myname(String fname,String lname)
 {
  String age="19";
  System.out.println("mynameis ="+fname+lname);
  return age;
   }
}
class clsobj{
 public static void main(String args[])
  {
  String first_name="mohammadali";
  String last_name="hanfi";
  name obj=new name();
  String age=obj.myname(first_name,last_name);
   System.out.println("my age is ="+age);
    }
}
