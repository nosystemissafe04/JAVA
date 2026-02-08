class febonacci
{
 public static void main(String argsp[])
 {
  int n=-1;
  int n1=1;
  int r=n+n1;
  for(int i=1;i<15;i++)
  {
  System.out.println(r);
  n=n1;
  n1=r;
  r=n+n1;
  
  }
 }
}
