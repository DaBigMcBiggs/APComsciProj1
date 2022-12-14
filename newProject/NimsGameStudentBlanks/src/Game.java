import java.util.Scanner;
public class Game {
    private int pieces;
    private Player p1;
    private Player p2;
    private Player currentPlayer;
    private Scanner sc = new Scanner(System.in);

    //Sets up the game with a random amount of pieces between 10 and 50
    //Sets up the players so they can be accessed
    public Game(Player p1, Player p2){
        pieces = (int) (Math.random() * 41 + 10);//To Do: Grab a random value between 10 and 50
        this.p1 = p1;
        this.p2 = p2;
    }
    public int getPieces() {
        return pieces;
    }
    //Allows a player to take a specific amount of pieces.
    //Adds the amount of pieces taken to the user's score.
    public int takePiece(){
        int take = sc.nextInt();
        //System.out.println("There are "+ pieces+" remaining!");
       //TO DO: Grab the user amount of pieces and repeat if it not allowed.
        while (!isLegal(take)){
            p1.getScore();
            System.out.println("Please enter the proper integer value.");
            take = sc.nextInt();
            }
        pieces -= take;
        //TO DO: Adjust the pieces

        System.out.println("There are "+ pieces+" remaining!");
        System.out.println("-----------------------");

        return pieces;
    }

    
    //**TO DO**//
    public Player getNextPlayer(){
    //Changes which players turn it is and returns the current player.
       if (p1 == currentPlayer){
            currentPlayer = p2;
        return currentPlayer;
    } else {
        currentPlayer = p1;
        return currentPlayer;
    }
    }
    //Checks whether or not the user's requested move is allowed or not.
    public boolean isLegal(int x){
        return ((x <= pieces/2 && x > 0) || x == 1);// Change appropriately
    }


    //DO NOT CHANGE
    public boolean isComplete(){

        if (pieces == 0){ return true;}
        return false;
    }

    //DO NOT CHANGE
    public void setFirstPlayer(Player p){
        currentPlayer = p;
    }
}
