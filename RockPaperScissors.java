import java.util.Scanner;

class GameRockPaperScissors
{
    public static void main(String[] args) 
    {
    	//user input & computer move
		Scanner scan = new Scanner(System.in);
        String comMove = ""; 
        System.out.println("Let's play rock, paper, scissors");
        System.out.print("Enter rock, paper, or scissors.");
       

        String userMove = scan.nextLine(); 
         if(!userMove.equals("rock") && !userMove.equals("paper") && !userMove.equals("scissors")) {
        	System.out.println("input is invalid, type rock, paper or scissors");
        } 
         
        int rand = (int)(Math.random()* 3);
        if(rand == 0) {
        	comMove = "rock";
        } 
        else if(rand == 1){
        	comMove ="paper"; 
        } 
        if(rand == 2) {
        	comMove = "scissors";
        }
        
        else {
        	System.out.println("Computer chose " + comMove);
        
        	if(userMove.equals(comMove)) {
        		System.out.println("it's a tie!");
        		
        	} 
        	else if((comMove.equals("rock") && userMove.equals("paper")) || (comMove.equals("paper") && userMove.equals("scissors")) || (comMove.equals("scissors") && userMove.equals("rock"))) {
        		System.out.println("you won!");
        		
        	} 
        	else if((comMove.equals("rock") && userMove.equals("scissors")) || (comMove.equals("paper") && userMove.equals("rock")) || (comMove.equals("scissors") && userMove.equals("paper"))) {
        		System.out.println("you lost!");
        		
        	}  
    }
}
}