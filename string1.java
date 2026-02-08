class string1{
  public static void main(String[] args)
  {
   String first_name="mohammadali";
   String last_name="hanfi";
   int age=19;
   double CGPA=6.5;
   char persent='%';
   boolean truth=false;
   String formatted=String.format("my name is %s %s and i am %d year old my college CGPA is %.2f . all the cliams are %b but i am motivated to achive 100%c of marks this year ",first_name,last_name,age,CGPA,truth,persent);
   System.out.println(formatted);
   //here string.format method is used to format the string in the better way to simple implement the string in the java program 
   System.out.println(formatted.length());
   System.out.println(formatted.isEmpty());
   System.out.println(formatted.toUpperCase());
   System.out.println(\n);
   System.out.println(formatted.toLowerCase());
   }

 }
