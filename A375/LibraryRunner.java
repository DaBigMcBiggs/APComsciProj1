package A375;
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    String authorToFind = "L. Frank Baum";
    ArrayList<Book> childrensBooks = library.getChildrensBooks();
    for (Book x: childrensBooks) {
      if (x.getAuthor().equals(authorToFind)) {
        System.out.println(x.getTitle());
      }
    }
    String bookToFind = "Sky Island";
    double minimumRating = 0.0;
    for (Book x: childrensBooks) {
      if (x.getTitle().equals(bookToFind)) {
        System.out.println(x.getTitle());
        System.out.
      }
    }
  }
}