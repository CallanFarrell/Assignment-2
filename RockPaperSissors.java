import java.util.*;

/***************************
* Created by: Callan Farrell.
* This program runs a game of rock paper sissors  
* Created on: March 2020
****************************/
  
public class RockPaperSissors {
  /*******
  *Rock paper scissors.
  ****/

  public static void main(String[] args) {
    Scanner consol = new Scanner(System.in);
    Random generator = new Random();
    
    final int ROCK = 1;
    final int PAPER = 2;
    final int SCISSORS = 3;
    
    int userChoice, computerChoice;
    
    do{
        System.out.println("1: Rock\n2: Paper\n3: Scissors\n-1 to quit:");
        userChoice = consol.nextInt();
        computerChoice = generator.nextInt(3) + 1;
        
        if(userChoice == ROCK){
            if(computerChoice == ROCK){
              System.out.println("Rock vs rock: Tie game");
            }
            else if(computerChoice == PAPER){
              System.out.println("Rock vs Paper: You lose");
            }
           else if(computerChoice == SCISSORS){
              System.out.println("Rock vs Scissors: You win");
           }
        }
        if(userChoice == PAPER){
            if(computerChoice == ROCK){
              System.out.println("Paper vs Paper: Tie game");
            }
            else if(computerChoice == PAPER){
              System.out.println("Paper vs Scissors: You lose");
            }
           else if(computerChoice == SCISSORS){
              System.out.println("Paper vs Rock: You win");
           }
        }
        if(userChoice == SCISSORS){
            if(computerChoice == ROCK){
              System.out.println("Scissors vs Scissors: Tie game");
            }
            else if(computerChoice == PAPER){
              System.out.println("Scissors vs Rock: You lose");
            }
            else if(computerChoice == SCISSORS){
               System.out.println("Scissors vs Paper: You win");
           }
        }
    
      
      
    }while(userChoice > 0);
    
    System.out.println("Thanks for playing");
    
    
    System.out.println("Rock Paper Scissors");
  }
}
    