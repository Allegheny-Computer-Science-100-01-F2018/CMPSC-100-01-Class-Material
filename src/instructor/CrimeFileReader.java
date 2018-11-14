import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/** Class to read the crime data file
* and locate information based on user's keyword.
*/
public class CrimeFileReader {

	private static final String FILENAME = "SacramentocrimeJanuary2006.csv";
	private ArrayList<String> list;

	/** Constructor to initialize the list.
	*/
	public CrimeFileReader() {
		list = new ArrayList<String>();
	}

	/** Method to read the data file and
	* save the information into an ArrayList.
	*/
	public void readFile() throws IOException {

		Scanner fileScanner = new Scanner(new File(FILENAME));

		while (fileScanner.hasNext()) {
			String line = fileScanner.nextLine();
			//System.out.println(line);
			list.add(line);
		}
	}

	/** Method to isolate information from the list
	* that only contains the user's keyword.
	*/
	public ArrayList<String> find (String word) {
		Iterator<String> listIterator = list.iterator();
		ArrayList<String> searchList = new ArrayList<String>();
		while (listIterator.hasNext()) {
			String line = listIterator.next();
			if(line.toLowerCase().contains(word)) {
				searchList.add(line);
			}
		}
		return searchList;
	}

	/** Method to return the list only
	* with the searched keyword information.
	*/
	public ArrayList<String> getSearchList() {
		return list;
	}
}
