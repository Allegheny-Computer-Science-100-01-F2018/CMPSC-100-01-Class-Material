import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/** Class to read the crime data, save it
* and locate specific information.new Scanner(new File(filename))
*/
public class CrimeFileReader {
  private final String filename = "SacramentocrimJanuary2006.csv";
  private ArrayList<String> list;

  public CrimeFileReader() {
    list = new ArrayList<String>();
  }

  public void readFile() throws IOException {
    Scanner fileScanner = new Scanner(new File(filename));

    // iterate the file and save it into the ArrayList
    while(fileScanner.hasNext()) {
      String line = fileScanner.nextLine();
      list.add(line);
    }
  }
}
