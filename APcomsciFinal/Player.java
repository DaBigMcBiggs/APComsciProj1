package APcomsciFinal;
import java.util.Scanner;
//constructors, accessors, and modifiers

public class Player {
    private int score = 0;
    private String name;
    public Player() {
        int s = score;
        name = "Po";
    }
    public int getScore() {
        return score;
    }
    public String getName() {
        return name;
    }
    public void scoreModify() {
        score +=1;
    }
}