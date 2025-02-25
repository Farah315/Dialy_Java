package calculator_program;
import java.util.Scanner;

public class Calculator_Program {

    public static void main(String[] args) {
  Scanner keyboard = new Scanner(System.in);
  System.out.println ("Hello!,Iam your simple Calculator :) ") ; 
  
//The only way to make the cycle continue is positive  *boolean x = true * 

boolean KeepGoing = true;

while(KeepGoing){
 //we here make a menu of an operation 
   System.out.println("Please choose an operation:"); 
   System.out.println("1. Addition (+)");
   System.out.println("2. Subtraction (-)");
   System.out.println("3. Multiplication (*)");
   System.out.println("4. Division (/)");
   System.out.println("5. Exit");
 // We must avoid any unwanted entrance
 // we should select exit to finish the program, 

 if (!keyboard.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                keyboard.next(); // Clear the invalid input
    continue;
            }

   
 int choice = keyboard.nextInt();

 if (choice < 1 || choice > 5) 
   {
     System.out.println("Invalid choice. Please try again."); 
    continue;
  
   }

   
   if (choice==5)
   { 
    KeepGoing = false;
    System.out.println("Exiting the calculator." + "See You letter,Professor ");
    break;
   }
   
   
 // Prompt the user to enter two numbers
System.out.println("Enter the first number:");
            boolean isFirstNumberValid = keyboard.hasNextDouble();
            if (!isFirstNumberValid) {
                System.out.println("The entry is invalid,please enter a number");
                keyboard.next();
                continue;
            }
            double num_1 = keyboard.nextDouble();

            System.out.println("Enter the second number:");
            boolean isSecondNumberValid = keyboard.hasNextDouble();
            if (!isSecondNumberValid) {
                System.out.println("The entry is invalid,please enter a number");
                keyboard.next();
                continue;
            }

            double num_2 = keyboard.nextDouble();

// now we should put the switch
switch (choice) 
{
    case 1: 
        System.out.println("Result: " + (num_1 + num_2)); 
        
        break;
    case 2: 
        System.out.println("Result: " + (num_1 - num_2));
         break; 
    case 3:
        System.out.println("Result: " + (num_1 * num_2)); 
        break; 
    case 4:
        
        if (num_2 != 0) {
            System.out.println("Result: " + (num_1 / num_2)); 
        } 
          
    
    
    else { System.out.println("Error: Division by zero is not allowed!."); } 
    
            break; 
    
    
    
    default:
        System.out.println("Invalid choice. Please select a valid option.");
}


} 

    }
    
}
