import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/** Class to use ArrayList to
* search a text file.
*/
public class StorySearcher {
  /** Main method to use if statements
  * and while loops for searching.
  */
  public static void main (String [] args) {
    File inputFile = null;
    Scanner input = null;

    try {
      inputFile = new File("story.txt");
      input = new Scanner (inputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to find the file");
    }

    ArrayList<String> wordList = new ArrayList<String>();
    // reading from the file until the end
    // saving the words in the wordList
    while(input.hasNext()) {
      String word = input.next();
      wordList.add(word);
    }
    System.out.println("Number of words is: " + wordList.size());

    int index = 0;
    int count = 0;
    while(index < wordList.size()) {
      String word = wordList.get(index);
      if(word.equalsIgnoreCase("democrat")) {
        count++;
      }
      index++;
    }
    System.out.println("count is: " + count);

  }
}
