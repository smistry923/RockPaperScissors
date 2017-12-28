import java.util.*;
public class Rock {
  public static void main (String[] args) 
  {
    while(true)
    {
      int a = (int) Math.random()*3;
      
      String [] options = {"Rock", "Paper", "Scissors"};
      String b = options[a];
      
      System.out.println("Please make a selection: 1 for Rock, 2 for Paper, and 3 for Scissors");
      
      Scanner scan = new Scanner(System.in);
      
      
      int c = scan.nextInt();
      
      while (c != 0 && c != 1 && c != 2)
      {
        System.out.println("You have entered an invalid value.");
        System.out.println("Please make a selection: 1 for Rock, 2 for Paper, and 3 for Scissors");
        c = scan.nextInt();
      }
      
      
      String d = options[c];
      
      
      System.out.println("You choose: " + b);
      System.out.println("The computer choose: " + d);
      
      if (a == c) 
      {
        System.out.println("It's a tie! You and the computer both chose: " + b); 
      }
      
      if(a == 0 && c == 1)
      {
        System.out.println("Computer Wins!"); 
      }
      
      if(a == 0 && c == 2)
      {
        System.out.println("You Win!"); 
      }
      
      if(a == 1 && c == 0)
      {
        System.out.println("You Win!"); 
      }
      
      if(a == 1 && c == 2)
      {
        System.out.println("Computer Wins!"); 
      }
      
      if(a == 2 && c == 0)
      {
        System.out.println("Computer Wins!"); 
      }
      
      if(a == 2 && c == 1)
      {
        System.out.println("You Win!"); 
      }
      
    }
  }
}
