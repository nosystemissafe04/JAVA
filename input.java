import java.util.Scanner;
class input{
 public static void main(String[] args)
  { 
  Scanner input = new Scanner(System.in);
  System.out.printf("what is your name \n >");
  String name = input.nextLine();
  name=name.toUpperCase();
  System.out.printf("what is you age ?");
  int age=Integer.parseInt(input.nextLine());
 // input.nextLine();
  System.out.printf("ok %d is a good age to prepare for the bug bounties ",age);
  System.out.printf("ok then tell me now whatis you fav8 food that you eat alot %s \n >",name);
  String food = input.nextLine();
  //the input of this nextline is not take the above nextint will store the value of an integer in the
  //but it also stored the enter we press after input and understand it as the next input should already 
  //given this glitch can be solved by the adding one nextline input to clear the memory
  System.out.printf("ok %s is good i ate that when i was at india haha! ",food);
  input.close(); 
  }
}
