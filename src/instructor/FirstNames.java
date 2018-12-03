import java.io.IOException;
import java.io.File;
import java.util.Scanner;

/** Read the text file and search using array.
*/
public class FirstNames {
  public static void main (String args[]) throws IOException {

    String names[] = new String[38];

    File file = new File("names.txt");
    Scanner input = new Scanner (file);

    // read from the file and save the values into an array
    int index = 0;
    while(input.hasNext()) {
      String name = input.next();
      names[index] = name;
      index++;
    }

    // iterate through the array and output all names that begin with 'A'
    for(int i = 0; i < names.length; i++) {
      if(names[i].startsWith("A")) {
        System.out.println(names[i]);
      }
    }
  }
}
