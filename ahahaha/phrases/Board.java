package ahahaha.phrases;

import java.util.Scanner;

import java.io.File;
// class initialization
public class Board {
  //scanner initialization
  Scanner sc = new Scanner(System.in);
  // grabs phrase from phrases.txt
  private String loadPhrase() {
    String tempPhrase = "";

    int numOfLines = 0;
    tempPhrase = "how are you";

    try {

      Scanner sc = new Scanner(new File("/workspace/APComsciProj1/ahahaha/phrases/phrases.txt"));
      while (sc.hasNextLine()) {
        tempPhrase = sc.nextLine().trim();
        numOfLines++;
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing phrases.txt");
    }

    int randomInt = (int) ((Math.random() * numOfLines) + 1);

    try {
      int count = 0;
      Scanner sc = new Scanner(new File("/workspace/APComsciProj1/ahahaha/phrases/phrases.txt"));
      while (sc.hasNextLine()) {
        count++;
        String temp = sc.nextLine().trim();
        if (count == randomInt) {
          tempPhrase = temp;
        }
      }
    } catch (Exception e) {
      System.out.println("Error reading or parsing phrases.txt");
    }
    return tempPhrase;
  }

  // setting up variables
  private String phrase = loadPhrase();
  private String blankPhrase = "";
  private String guessedPhrase;
  // set up String to keep track of guessed letters
  private String guessedLetters = "";
// replaces phrase with underscores 
  public String phraseReplacer() {
    String p = phrase;
    String curP = blankPhrase;
    while (p.length() > 0) {
      String letter = p.substring(0, 1);
      if (letter.equals(" ")) {
        curP = curP.concat(letter);
      } else {
        curP = curP.concat("_");
      }
      p = p.substring(1);
    }
    System.out.println(curP);
    return curP;
  }
// this isnt really ever used
 /* public String getPhrase() {
    return phrase;
  } */

  // method of the player guessing the phrase
  public String guessPhrase(Player playerOne, Player playerTwo) {
    //variables initialized inside of the method
    String s = sc.nextLine();
    String p = phrase;
    String b = ""; 

    // add newly guessed letter to guessed letter string
    guessedLetters = guessedLetters.concat(s);
    // conditional with a loop inside it
    if (p.contains(s)) {
      while (p.length() > 0) {
        String letter = p.substring(0, 1);
        if (guessedLetters.contains(letter)) {
          // fill guessed letter into blank string
          b = b.concat(letter);
        } else if (letter.equals(" ")) {
          b = b.concat(letter);
        } else {
          b = b.concat("_");
        } // tells where the system should begin to analyze the phrase from the beginning to the end of the phrase
        p = p.substring(1);
      }
    } else {
      playerOne.endTurn();
      playerTwo.playerTurn();
    }
    System.out.println(b);
    guessedPhrase = b;
    return b;
  }
  //accessor that tells whether a phrase is fully guessed
  public boolean fullyGuessed() {
    return phrase.equals(guessedPhrase);
  }
}