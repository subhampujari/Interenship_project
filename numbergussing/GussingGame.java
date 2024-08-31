import java.util.Random;
import java.util.Scanner;

public class GussingGame {
public static void main(String[] args) {
    //this program is  to number gussing in between 1 to 100...
    Scanner sc=new Scanner(System.in);

    //radnom class for the gussing the number
    Random random =new Random();

    int targetNumber=random.nextInt(100)+1;//the number in between 1 to 100
    
    boolean hasgussCorrectly=false;

    int numberoftries=0;// for visilising the number of tries you did for gussing the number..

    //exact code for the number gussing code..
    
    System.out.println("Welcome to the  NumberGussinggame!...");

    System.out.println("--------------------------------------------------");
    System.out.println();


    System.out.println("I have choose one Number in between 1 to 100 can you guss it!...");
    System.out.println();


    //ecat code of the number gussing game..
    while(!hasgussCorrectly){
        System.out.println("Entere your guss!....");

        int userGuss=sc.nextInt();

        numberoftries++;//increment the numbe rof tries..
        if(userGuss<targetNumber){
            System.out.println("You are too low try again !..");
            System.out.println();
        }else if(userGuss> targetNumber){
            System.out.println("You are too High try again!...");
            System.out.println();
        }else{
            System.out.println("Congratulation!.. You gussed the number ...");
            System.out.println();
            System.out.println("The number of trie you did :"+numberoftries);
            hasgussCorrectly=true;
        }
    }
   sc.close();
}
}
