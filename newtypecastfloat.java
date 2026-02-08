//incompatible types: possible lossy conversion from float to int
class newtypecastfloat
{
  public static void main(String args[])
  {
    double x=31.33;
    int y=(int)x;/** here it will not convert flaot to int we have to type cast here to veraible this type caste will lead to data loss  */
    System.out.println(y);
 
  }
}
