class newtypecastint
{
  public static void main (String args[])
  {
    int x=10;
    float y=x;/** here we converted a int type of veriable to a float type and this conversion is possible becsouse we are widening the size of a data type and java supports widenning of the datatype but now narrowing the datatype bcz it will lead to data loss */
    System.out.println(y);
  }
}
