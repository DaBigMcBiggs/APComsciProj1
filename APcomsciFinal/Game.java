package APcomsciFinal;

import java.util.Scanner;
public class Game {

String question[] = new String[6];
String answer[] = new String[6];

public Game(Player player){
    question[0] = "What is the proper way to initialize the array b1";
    answer[0] = "";

    question[1] = "What is the index of the array: {null, null, null, null}?";
    answer[1] = "";

    question[2] = "if an array of a constructed variable b1[1], assuming that the .getName accessor exists and 'name' is constructed, what would be the proper way to print the name variable?";
    answer[2] = "";
}

    //ROUNDS
    public void roundOne(Player player){
        System.out.println("\033[H\033[2J");
        System.out.println(player.getName() + " your score is " + player.getScore());
        System.out.println("");
    }
}