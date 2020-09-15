import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
    int pennies,nickels,dimes,quaters;
  final double pennie = 0.01,nickel = 0.05,dime = 0.10 , quater = 0.25;
  double total;
  Scanner keyboard = new Scanner(System.in);
  System.out.println("|MONEY GAMES|");
  System.out.println("Enter Number Of Pennies");
  pennies=keyboard.nextInt();
  System.out.println("Enter Number Of Nickles");
  nickels=keyboard.nextInt();
  System.out.println("Enter Number Of Dimes");
  dimes=keyboard.nextInt();
  System.out.println("Enter Number Of Quaters");
  quaters=keyboard.nextInt();
  total = pennies*pennie + nickel*nickels + dimes*dime + quater*quaters;
  total = Math.round(total * 100.0) / 100.0;
  System.out.println("you have " + total);
  System.out.println("Would you like to buy:");
  System.out.println("1.icream -3.50");
  System.out.println("2.panckes - 0.41 ");
  System.out.println("3.Candy - 0.50 ");
 int playerchoice = keyboard.nextInt();
  if(playerchoice == 1)
  {
    if(total>3.50  || total ==3.50)
   {
     System.out.println("YOu win");

   }
   else if(total<3.50)
   {
     System.out.println("You lose");
 
   }
   
  }
    else if(playerchoice == 2)
  {
    if(total>0.41 || total ==0.41)
   {
     System.out.println("YOu win");

   }
   else if(total<0.41)
   {
     System.out.println("You lose");
   }
 
   
 
    else if(playerchoice == 3)
  {
    if(total>0.50 || total ==0.50)
   {
     System.out.println("YOu win");

   }
   else if(total<0.50)
   {
     System.out.println("You lose");
   }
  
  }  




  



    
  }
}
}