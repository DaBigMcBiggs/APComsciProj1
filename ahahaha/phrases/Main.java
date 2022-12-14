package ahahaha.phrases;

import java.util.Scanner;
// the running class
public class Main {
    public static void main(String args[]) {
        //initiallizing instances
        Board board = new Board();
        Scanner sc = new Scanner(System.in);
        //welcome messages and places for players to choose their name
        System.out.println("Welcome to hang man");
        
        System.out.println("Player one please state your name");
        String nameOne = sc.nextLine();
        Player playerOne = new Player(nameOne);

        System.out.println("Player two please state your name");
        String nameTwo = sc.nextLine();
        Player playerTwo = new Player(nameTwo);
        // runs the phraseReplacer
        board.phraseReplacer();
        //player one always begins first
        playerOne.playerTurn();
        //initialized variable i
        int i = 0;
        //actual game, ten rounds, players alternate turns, players may continue to guess letters if they guess a letter correct
        //if they do not guess correctly, they will be forced to alternate their turn to the next player
        // if both players fail to guess the word within 10 rounds there is no winner
        // game loop
        while (i != 10) {
            //conditionals
            if (playerOne.currentTurn()) {
                System.out.println(nameOne + " it is your turn, please guess a letter");
                board.guessPhrase(playerOne, playerTwo);
                if (!playerOne.currentTurn()) {
                    i++;
                }
            } else if (playerTwo.currentTurn()) {
                System.out.println(nameTwo + " it is your turn, please guess a letter");
                board.guessPhrase(playerTwo, playerOne);
                if (!playerTwo.currentTurn()){
                    i++;
                }
            }
            //more conditionals that determine whether they guessed the phrase within 10 rounds
            if (board.fullyGuessed()){
                System.out.println("you guessed the phrase!");
                System.exit(0);
            } else if (i == 10 && !board.fullyGuessed()) {
                System.out.println("bummer! you guys suck at guessing :(" + "\nBetter luck next time!");
                System.exit(0);
            }
        }
        sc.close();
    }
}
