package ahahaha.phrases;
public class Player 
{   //player class 
    // intialized variables
    
    private boolean turn;

    //constructor
    public Player(String name) {
    }
    //accessor
    public boolean currentTurn() {
        return turn;
    }
    //modifiers
    public void playerTurn() {
        turn = true;
    }
    public void endTurn() {
        turn = false;
    }
}