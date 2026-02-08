import java.util.Arrays;
class arrayp1{
 public static void main(String[] args)
  { 
 char os[]={'L','N','I','U','X'};
 int start=1;
 int end=4;
 //here in the case of end the last element index is written as the array is ended to that index hence the last or end index will not be included
   int age[]={1,9};
   age[1]=8;
  // Arrays.sort(os);
   System.out.println("the os i use is ="+Arrays.toString(os));
   System.out.println("my age ="+Arrays.toString(age));
   System.out.println("legth of the array ="+os.length);
   System.out.println("to sort the array we have to use a methode called .sort="+Arrays.toString(os));
   System.out.println("Arrays is the class for array so the Arrays we are executing the obejct followed by .methode_name this is happening bcz everything in java is a treated a object ");
   Arrays.sort(os,start,end);
   System.out.println("sorting is on some elements of the array="+Arrays.toString(os));
   char key='Z';
   int search=Arrays.binarySearch(os,start,end,key);
 //here in binary search if the char is not there in the array it will give negative value if the positive value is given by the methode its the right ans
  System.out.println("the array searched was="+search);   
//here we saw the .length method in strings but in arrays .length is a property not an methode of the array class 
  Arrays.fill(os,'o');
  System.out.println(Arrays.toString(os));
  Arrays.fill(os,start,end,'x');
  System.out.println(Arrays.toString(os));
   }
 
}
