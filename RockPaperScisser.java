import java.util.Random;
import java.util.Scanner;
import java.lang.System;


public class RockPaperScisser{
    private Object out;

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);     
        Random random = new Random();

        // creating one string array for storing the rock paper scisser 
        String [] option={"Rock","Paper","Scisser"};

        //creating one boolean varaible for setting for play again commond
        boolean WantToPlay=true;RockPaperScisser

        System.out.println("Welcome to ROCK-PAPER-SCISSER Game!............ ");

        System.out.println("---------------------------------------------------------------");

        while(WantToPlay){
            System.out.println("Enter your choise in the given three option (Rock ,Paper,Scisser)!..");

            String YouEnter=sc.nextLine().trim();// for trim the witespacse

            if(!isValidString(YouEnter,option)){
                System.out.println("Plese enter the correct string which is mentiond above !.....");
                continue;
            }

            int optionOfComputer=random.nextInt(3);

            String ComputerEntered=option[optionOfComputer];

            System.out.println("Computer choise is:"+ComputerEntered);

            String result=determineWinner(YouEnter,ComputerEntered);

            System.out.println(result);

            System.out.println("Do you want to play again say (yes/no)!..");

            String PlayAgain=sc.nextLine().trim();

            WantToPlay=PlayAgain.equalsIgnoreCase("yes");

            System.out.println("----------------------------------");
        }

        ((Object) System.out).println("Thanks for playing !.....");
        sc.close();
    }

    //checking the string eneterd is in the string array or not 

    public static boolean isValidString(String YouEnter,String[] option){
  
        for(String op:option){
            if(op.equalsIgnoreCase(YouEnter)){
                return true;
            }
        }
return false;
    }

    // dteremine the wine method 

    public static String determineWinner(String usereter,String computerChoice){
     if(usereter.equalsIgnoreCase(computerChoice)){
        return "OooNooo its tie !.....";
     }
     switch (usereter.toLowerCase()) {
        case "rock":
                return (computerChoice.equalsIgnoreCase("Scissors")) ? "You win!" : "You lose!";
            case "paper":
                return (computerChoice.equalsIgnoreCase("Rock")) ? "You win!" : "You lose!";
            case "scissors":
                return (computerChoice.equalsIgnoreCase("Paper")) ? "You win!" : "You lose!";
            default:
                return "Unexpected error.";
    }
}
}
