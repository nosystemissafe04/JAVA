import java.util.Arrays;
class copyarr{
 public static void main(String[] args)
  {
   char distribution[]={'U','B','U','N','T','U'};
   Arrays.fill(distribution,'o');
   char copyofarray[]=distribution; 
   System.out.println(Arrays.toString(distribution));
   System.out.println(Arrays.toString(copyofarray));
   System.out.println(distribution.hashCode());   
//here the we copyied distribution array to copyofarray but when we changed the distribution array to something else copyofarray was also changed this proves that there is no copy of distribution array the copyofarray was pointing to the same address in the memory as distribution its like they both have a same address 
   System.out.println(copyofarray.hashCode());   
   }
 }
