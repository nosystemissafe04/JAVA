import project.table;
class packages
{
 public static void main(String args[])
 {
  table obj=new table();
  obj.printtable();
  System.out.println(obj.myname);//default access modifiers are only be accessed by same package it cnnot be accessed by outside the package 
 }
}
