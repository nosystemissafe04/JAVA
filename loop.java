import java.util.Scanner;
import java.util.Arrays;
class loop{
public static void main(String[] args)
  {
 Scanner input=new Scanner(System.in);
 String my_name="mohammadalihanfi";
 System.out.println(my_name);
 char my_namearr[]={};
 for(int nu=0;nu<=15;nu++)
  {
   my_namearr.set(my_namearr.indexOf(my_namearr))=my_name.charAt(nu);
   //System.out.println(my_name.charAt(nu));
   }
 System.out.println(my_namearr);
input.close();
    }

 }
