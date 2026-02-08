import java.util.Scanner;
class testing{
int num=10;
public int test(int number,int number1)
 {
  return number*number1;
  }
}

class objtest{
public static void main(String args[])
{
  Scanner input =new Scanner(System.in);
  
  System.out.printf("enter the number \n>");
  
  int n=input.nextInt();
  
  System.out.printf("enter the number \n>");
  
  int n1=input.nextInt();
  
  testing obj=new testing();
  
  int result=obj.test(n,n1);
  
 System.out.printf("addition of the following =%d\n",result);
  
  testing obj1=new testing();
  
  result=obj.test(n,n1);
  
  System.out.printf("multiplication of the following =%d\n",result);
  
  obj.num=50;
  
  System.out.printf("value of num=%d\n",obj.num);
  
  System.out.printf("value of num of obj1=%d\n",obj1.num);
  System.out.println(obj.test());
}
 }

//   |()*>
