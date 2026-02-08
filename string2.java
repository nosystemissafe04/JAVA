class string2{
  public static void main(String[] args)
  {
   String university=new String("devi ahilya bai vishva vidhyalaya");
   String collegeaff=new String("Devi Ahilya Bai Vishva Vidhyalaya");
   System.out.println(university==collegeaff);
   System.out.println(university.equals(collegeaff));
   System.out.println("the value is not equals when the following is compared with comparsion operator but using equals method it will be false now bcz the value is not same anymore ");
   System.out.println(university.equalsIgnoreCase(collegeaff));
   //System.out.println(university.replace("devi","DEVI"));
   String updated= university.replace("devi","DEVI");
   System.out.println(university);
   System.out.println(updated);
   System.out.println(updated.contains("vishva"));
   }

 }
