import java.util.*;
import java.text.*;
import java.util.Scanner;

public class OregonTrailMathGame {
  static void oregonTrail(){
    Scanner newScanner = new Scanner(System.in);
    System.out.println("\nWelcome to the Trail! Take your time and think through your answers as you embark on your journey. An incorrect answer can send you to your doom! (Answer all questions as integers.)\n\n");
    System.out.println("Question 1: \n\nDave has 5 apples. If he gives 3 apples to Jane and 2 apples to Emmett, but receives 5 apples from Laura, how many apples does Dave have?");
    String questionOne = newScanner.nextLine();
    if(questionOne.equals("5"))
    {
     secondQuestion();
    }
    else{
      wrongAnswer();
    }
  }
  static void secondQuestion(){
    Scanner newScanner = new Scanner(System.in);
    System.out.println("\n\nQuestion 2: \n\nIt takes 3 cups of flour to make a pie. Amy has 10 cups of flour. How many pies can she make? (Round your answer to the nearest integer)");
    String questionTwo = newScanner.nextLine();
    if(questionTwo.equals("3"))
    {
     thirdQuestion();
    }
    else{
      wrongAnswer();
    }
  }
  static void thirdQuestion(){
    Scanner newScanner = new Scanner(System.in);
    System.out.println("\n\nQuestion 3: \n\nJane's scores for the first three science tests were 80, 93, and 100. What score does Jane need to get on the fourth test to have an average test score of 93?");
    String questionThree = newScanner.nextLine();
    if(questionThree.equals("99"))
    {
     fourthQuestion();
    }
    else{
      wrongAnswer();
    }
  }
  static void fourthQuestion(){
    Scanner newScanner = new Scanner(System.in);
    System.out.println("\n\nQuestion 4: \n\nSolve for x: \nx = 10 + 4 - 6 + (7*5)");
    String questionFour = newScanner.nextLine();
    if(questionFour.equals("43"))
    {
     fifthQuestion();
    }
    else{
      wrongAnswer();
    }
  }
  static void fifthQuestion(){
    Scanner newScanner = new Scanner(System.in);
    System.out.println("\n\nQuestion 5: \n\nWhat is the sum of the first three Perfect Numbers?");
    String questionFive = newScanner.nextLine();
    if(questionFive.equals("530"))
    {
     rightAnswer();
    }
    else{
      wrongAnswer();
    }
  }
  static void exitMessage(){
    System.out.println("\nThank you for playing! Goodbye!");
  }
  static void mortalityDecision(int age, String mortality){
    System.out.println("\nTraveler, at the age of " + age + " you have " + mortality + " the Oregon Trail.");
  }
  static void rightAnswer(){
    Scanner newScanner = new Scanner(System.in);
    mortalityDecision(12, "survived");
    System.out.println("Congratulations! You made it across the trail alive!");
    System.out.println("Would you like to play again? Enter YES or NO.");
    String playAgain = newScanner.nextLine();
    if(playAgain.equals("YES"))
    {
      oregonTrail();
    }
    else if(playAgain.equals("Yes"))
    {
      oregonTrail();
    }
    else if(playAgain.equals("yes"))
    {
      oregonTrail();
    }
    else 
    {
      exitMessage();
    }
  }
  static void wrongAnswer(){
    Scanner newScanner = new Scanner(System.in);
    System.out.println("\nYou have died of dysentery!");
    mortalityDecision(14, "failed to complete");
    System.out.println("Would you like to try again? Type YES or NO.");
    String tryAgain = newScanner.nextLine();
    if(tryAgain.equals("YES"))
    {
      oregonTrail();
    }
    else if(tryAgain.equals("Yes"))
    {
      oregonTrail();
    }
    else if(tryAgain.equals("yes"))
    {
      oregonTrail();
    }
    else
    {
      exitMessage();
    }
    
  }
  
  public static void main(String[] args) {  
    Scanner newScanner = new Scanner(System.in);
    System.out.println("\n\nEnter your name:");

    String name = newScanner.nextLine();
    System.out.println("\n\nTraveler " + name + ":\n\nWelcome to the Oregon Trail Math Trivia Game!");

    System.out.println("\nWould you like to play? Enter YES or NO.");
    String playGame = newScanner.nextLine();
    if(playGame.equals("YES"))
    {
      oregonTrail();
    }
    else if(playGame.equals("Yes"))
    {
      oregonTrail();
    }
    else if(playGame.equals("yes"))
    {
      oregonTrail();
    }
    else
    {
      exitMessage();
    }

  }
}
