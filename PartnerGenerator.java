import java.util.*;
import java.text.*;


public static void main(String[] args)
{ 
    homeScreen();
  

  public static void homeScreen()
  {
    System.out.println("Welcome to the random project partner selector for Ms. Smith's Class!")
    System.out.println("Enter 1 to find a project partner");
    System.out.println("Enter 2 to exit");
    String strEnter=user_input.nextLine();
    int intEnter = Integer.parseInt(strEnter);

    if(intEnter==1)
    {
      partnerGenerator();
      homeScreen();
    }
    
    else if (intEnter==2)
    {
      System.exit(0);
    }
    else
    {
      System.out.println("Oops! You didn't choose a valid option. Please make a selection.");
      homeScreen();
    }
  }  
  
  
  public class partnerGenerator
  {
   static Scanner user_input= new Scanner(System.in);
 
    public static int partnerSelection()
    {
      System.out.println("Choose a number and you will be given the name of your project partner.");
      System.out.println("Pick a number between 0 and 10!");
      String strChosenPartner=user_input.nextLine();
      int chosenPartner = Integer.parseInt(strChosenPartner);
      System.out.println("Your partner is:");

      if (chosenPartner=0)
      {System.out.println(" James");
      }
      else if (chosenPartner=1)
      {System.out.println(" Emma");
      }

      else if (chosenPartner=2)
      {System.out.println(" Damien");
      }

      else if (chosenPartner=3)
      {System.out.println(" Jules");
      }

      else if (chosenPartner=4)
      {System.out.println(" Kari");
      }

      else if (chosenPartner=5)
      {System.out.println(" Paul");
      }

      else if (chosenPartner=6)
      {System.out.println(" Elliot");
      } 

      else if (chosenPartner=7)
      {System.out.println(" Laura");
      }

      else if (chosenPartner=8)
      {System.out.println(" Jose");
      }

      else if (chosenPartner=9)
      {System.out.println(" Nora");
      }

      else if (chosenPartner=10)
      {System.out.println(" Jacquie");
      }

      else if ((chosenPartner<0)||(chosenPartner>10));
      {
      System.out.println("Please pick a number between 0 and 10");
      partnerSelection();
      }
    
      return chosenPartner;
    }
  


    public static int changePartner()
    {
    System.out.println("Is this your own name?");

    System.out.println("Type 1 for YES and 2 for NO.");
    String strChangePartner=user_input.nextLine();
    int changePartner = Integer.parseInt(strChangePartner);

    if ((changePartner<0)||(changePartner>10))
    {
      System.out.println("Please pick a number between 0 and 10");
      partnerSelection();
    }

    return changePartner;
    }
  }  
 
