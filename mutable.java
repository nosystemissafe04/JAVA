class mutable{
 public static void main(String args[])
 {
 StringBuffer sb=new StringBuffer("mohammadali");
 System.out.println(sb.capacity());//by default the string buffer will allocate 16 , now the string buffer is of size 27 and those 16 were left 
 System.out.println(sb.length());
 sb.append(" hanfi");//this is mutable string so we can change it it is not a constant anymore so to append this method is used 
 System.out.println(sb);
 String str=sb.toString();//convert string buffer to stirn with help of toString method in java
 System.out.println(str);
 sb.deleteCharAt(12);
 System.out.println(sb);//used to delete the char in a string 
 sb.delete(8,11);
 sb.insert(8,"ali");
 sb.insert(12,"h");
 System.out.println(sb);
 sb.replace(12,17,"attari");
 System.out.println(sb);
 sb.reverse();
 System.out.println(sb);
/*
 Methods	Action Performed
append()	Used to add text at the end of the existing text.
length()	The length of a StringBuffer can be found by the length( ) method
capacity()	the total allocated capacity can be found by the capacity( ) method
charAt()	This method returns the char value in this sequence at the specified index.
delete()	Deletes a sequence of characters from the invoking object
deleteCharAt()	Deletes the character at the index specified by loc
ensureCapacity()	Ensures capacity is at least equals to the given minimum.
insert()	Inserts text at the specified index position
length()	Returns length of the string  
reverse()	Reverse the characters within a StringBuffer object
replace()	Replace one set of characters with another set inside a StringBuffer object
 */
 }
}
