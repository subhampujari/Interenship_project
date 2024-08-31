import java.util.Scanner;

public class calulator {
public static void main(String[] args) {
    //ThisProject is all about the basic calulator in which we can perform basic arithmatic operations....
    Scanner sc =new Scanner(System.in);

    System.out.println("Welcome to the Basic calulator!");
    System.out.println("----------------------------------------");

    System.out.println("Enter your First Number to perform operation:");
    double num1=sc.nextDouble();

    System.out.println("Enter your Second Number to perform operation:");
    double num2=sc.nextDouble();

    System.out.println("Enter Your choise for Operation of you entered  the numbers:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication ");
    System.out.println("4. Division");
   //for giving the choise to the user...
    int choise=sc.nextInt();
    //for sttoring the result
    double result;
    
    //performing the operations ...
    switch(choise){
            case 1://for addittion 
            result=add(num1,num2);
            System.out.println("The result of the addition is :" +result);
            break;
           //for subtraction
            case 2:
            result=subtract(num1,num2);
            System.out.println("the subtraction of two number is :"+result);
            break;
          //for multiplication 
            case 3:
            result=multiply(num1,num2);
            System.out.println("The multiplication of two number is :"+result);
            break;
           //for division
            case 4:
            if(num2!=0){
                result=division(num1 ,num2);
             
                   System.out.println("The division of two number is :"+result);
            }//if  any invalid number is entered so exception is throwing....
            else{
                System.out.println("Error: Division by Zero is not alloowed!....  ");
            }
            break;
            // if any invalid input is enterd then default will be exicute...
            default:
            System.out.println("please give valid input!......");
            break;
    }
    sc.close();
}
      //Implemeintng the methods for addition , subtration , multiplication,division 
       public static double add(double a,double b){
          return a+b;
       }

       public static double subtract(double a,double b){
        return a-b;
       }

       public static double multiply(double a, double b){
        return a*b;
       }

       public static double division(double a,double b){
        return a / b;
       }
}
