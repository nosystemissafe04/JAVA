import java.util.*;
class proarray{
 public static void main(String args[])
  {
  Scanner input=new Scanner(System.in);

  int arr[][]=new int[4][4];
  for(int i=0;i<4;i++)
   {
   System.out.printf("enter the %dth elemets value\n",i);
 	for(int j=0;j<4;j++)
	 {
         arr[i][j]=input.nextInt();
               
	 }
    }
    System.out.println("value of array is =");
  for(int i=0;i<4;i++)
   {
 	for(int j=0;j<4;j++)
	 {
         System.out.print(arr[i][j]+" ");        
               
	 }
      System.out.println();
    }


  }
}
