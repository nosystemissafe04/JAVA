import java.util.Arrays;
class arraycopy{
 public static void main(String[] args)
  {
   char distribution[]=new char[6];
  distribution[0]='U';
  distribution[1]='B';
  distribution[2]='U';
  distribution[3]='N';
  distribution[4]='T';
  distribution[5]='U';
  int start=1;
  int end=5;
//    char copyofarray[]=new char[6];
// copyofarray[0]='U';
// copyofarray[1]='B';
// copyofarray[2]='U';
// copyofarray[3]='N';
// copyofarray[4]='T';
// copyofarray[5]='U'; 
// char copyofarray[]=Arrays.copyOf(distribution,10);//when using copyof method of array class will create another object of copyofarray now it will not point to the memory  address of the distribution and if we change the distribution the copyofarray will not be changed the hashcode will be the proof that its a new object as everything in the java is a object and hash value was changed we can resize the value of copyofarray by specifing the an length in second argument
char copyofarray[]=Arrays.copyOfRange(distribution,start,end);//with this methode we can copy array which specifying the starting and ending endex which will copy it of the specified range notice that there is not arguments for specifing the total length so if you want to resize it how would you do that that is possible if you ending index is larger than the actual array then it will resize it  
Arrays.fill(distribution,start,end,'o');//this is the proof that it was pointing to the same address as distribution
   System.out.println(Arrays.toString(distribution));
   System.out.println(Arrays.toString(copyofarray));
   System.out.println(distribution.hashCode());   
   System.out.println(copyofarray.hashCode());   
   System.out.println(distribution.equals(copyofarray));   
   //here we created two arrays by creating there object and passing values in them the hashcode methode is in obejct class which is default superclass of every userdefine class as we can use this methode to get the hashvalue of the obeject every object have a hash value which can be seen by this method we if the value of those integer was same then they both are equal and have same memory address .equals methode is also used to get if object are equal or not in this program we prove that both distribution and copyofarray have same values but internally they both have different memory address that is why they both are not equal but if you initialize distribution with copyofarray they will share the same memory and then they are equal lets experiment more !!

   }
  }
