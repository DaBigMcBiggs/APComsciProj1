import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Asks the user to input thier name for the player
        System.out.println("What is player1's name?: ");
        //TO DO: Create Player 1: done
        String nameInputOne = sc.nextLine();
        Player p1 = new Player(nameInputOne);

        //Asks the user to input their name for the player.
        System.out.println("What is player2's name?: ");
        //TO DO: Create Player 2: done
        String nameInputTwo = sc.nextLine();
        Player p2 = new Player(nameInputTwo);

        String again = "Literally any string";
        Player currentPlayer = p1;
        
        //Runs the game
        while (!again.equals("q")){
            //Generates the game
            //TO DO: Create "game":done
            
            Game game = new Game(p1, p2);
            //TO DO: Set the a random player as the current player

            game.setFirstPlayer(currentPlayer);
            //This is the loop in which the game will be played
            System.out.println("there are " + game.getPieces() + " pieces");
            while(!game.isComplete()){
               //TO DO
               System.out.println(currentPlayer.getName() + " it is your turn");
               game.takePiece();
               //p1.getScore();
               currentPlayer = game.getNextPlayer();
               }
            
            System.out.println(currentPlayer.getName()+ " Won!!");
            System.out.println(p1.getName() +" had removed "+ p1.getScore()+" pieces!");
            System.out.println(p2.getName() +" had removed "+ p2.getScore()+" pieces!");
            System.out.println("------------------------------------------");
            System.out.println("Enter q to quit, enter anything else to play again.");
            again = sc.nextLine();
        }
        
        System.out.println("Thank you for playing!");
        sc.close();
    }
}
