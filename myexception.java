class myexception
{
  public static void main (String args[])
  {
  try {
    System.out.println(4/0);//here the exception will arise that is why it is in the try block . if the exception occurs the next statement does not execute in the try block and it is must to have a catch block or a finally block after the try block we can create as much catch mechanish in the program but the finally is created only once in the program  
  } catch (ArithmeticException e) {
    System.out.println("the exception is:"+e.getMessage());
    System.err.println(e.toString());
  }
  System.out.println("the program is executed ");
  }
}

