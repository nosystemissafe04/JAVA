class dowhile{
public static void main(String args[])
 {
  int number,multi;
  number=1;
  multi=1;
  do
  {
  do
  {
   System.out.printf("%d*%d=%d\n",number,multi,number*multi);
    multi++;
     }while(multi<=10);
      number++;
     }while(number<=10);
  }

  }
