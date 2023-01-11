package proj;

import java.util.ArrayList;

/*
 * Activity 3.7.3
 */
public class HorseBarnRunner {
  public static void main(String[] args) {
    HorseBarn barn = new HorseBarn();
    ArrayList<Horse> horse = barn.getSpaces();
    int[] rand = RandomPermutation.next(horse);
    int x = 0;
    int y = 0;
    while (x < horse.size() / 2 - 1) {
      System.out.println(horse.get(rand[y] - 1) + " and " + horse.get(rand[y + 1] - 1));
      x++;
      if (x < horse.size() / 2 - 1) {
        y += 2;
      }
      if (x == horse.size() / 2 - 1) {
        y++;
        System.out.println(horse.get(rand[y + 1] - 1) + " is a lonely mug");
      }
    }
  }
}