//two dimentional jagged array
import java.util.Scanner;
class jaggedarray{
 public static void main(String args[])
  {
  Scanner input=new Scanner(System.in);
  int array[][]=new int[3][];
  array[0]=new int[2];
  array[1]=new int[4];
  array[2]=new int[3];
  for(int i=0;i<array.length;i++)
   {
   System.out.printf("Enter the elements of array on the index %d\n",i);
   for(int j=0;j<array[i].length;j++)
     {
    array[i][j]=input.nextInt();
     }

   }

   for(int i=0;i<array.length;i++)
    {
    for(int j=0;j<array[i].length;j++)
     {
     System.out.print(array[i][j]+" ");
     }
     System.out.println();
    }

    for(int i=0;i<array.length;i++)
    {
     for(int j=0;j<array[i].length;j++)
      {
      array[i][j]=(int)(Math.random()*10);
      }
    }

   /* for(int i=0;i<array.length;i++)
    {
    for(int j=0;j<array[i].length;j++)
     {
     System.out.print(array[i][j]+" ");
     }
     System.out.println();
    }*/
    int i=0;
    int j=0;
    String space=" ";
    while(true)
     {
     while(true)
      {
       System.out.print(array[i][j]+space);
       j++;
      }
     System.out.println();
      i++;
     }
   }
   
}
