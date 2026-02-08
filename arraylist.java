//array list are dynamic in nature we can add delete fetch and insert any number of elements to it .add to insert .remove to delet the element .get to fetch the element   .toString method used to print it 
import java.util.ArrayList;
import java.util.Comparator;
class arraylist{
 public static void main(String args[]){
   ArrayList<Integer> numbers = new ArrayList<Integer>();
   
   numbers.add(1);
   numbers.add(2);
   numbers.add(3);
   numbers.add(4);
  numbers.add(5);
   numbers.add(6);
   for(int i=0;i<5;i++)
   {
    System.out.println(numbers.get(i));
 }
 System.out.println(numbers.toString());
 numbers.remove(4);//this 4 is a primitive type of value so it will be considered as index to delet the value by giving it we have to use wrapper class
 System.out.println(numbers.toString());
 numbers.remove(Integer.valueOf(6));//passing a reference type value will point to the actual value not the index of the array list in the program
 System.out.println(numbers.toString());
 numbers.clear();//this will clear every thing in the array list 
 System.out.println(numbers.toString());
 //umbers.set(Integer.valueOf())
   numbers.add(1);
   numbers.add(5);
   numbers.add(3);
   numbers.add(0);
   System.out.println(numbers.toString());
   //updating the array list with .set method
   numbers.set(3,Integer.valueOf(0));//just remember the .valueOf method used in arrays when we are studing array it is used to convert any data like int double char to its string representatino by creating a new string object we can also use value of to convert a char array to a string or asubarray of a char array to a string
   System.out.println(numbers.toString());
   numbers.sort(Comparator.naturalOrder());//to use sort methode in arraylist we have to use comparator class and in that class natural order is present to sort the arraylist in assending or alphabetical order 
   System.out.println(numbers.toString());
   numbers.sort(Comparator.reverseOrder());//its another methode to reverser the elements on the arraylist   
   System.out.println(numbers.toString());
   System.out.println(numbers.size());//usedto print the size of the arraylist as .length property is in array but in arraylist size methode is used 
   System.out.println(numbers.contains(Integer.valueOf(5)));//another methode to search the elements in the arraylist 
   System.out.println(numbers.isEmpty());//another methode to find the arraylist is empty or not 
 }
}
