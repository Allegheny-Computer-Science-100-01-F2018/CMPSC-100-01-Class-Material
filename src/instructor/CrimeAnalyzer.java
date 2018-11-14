import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

/** Class to analyze crime data by specific information.
*/
public class CrimeAnalyzer {

	private ArrayList<String> districtList;
	private int count;

	/** Constructor to initialize instance variables.
	*/
	public CrimeAnalyzer() {
		districtList = new ArrayList<String>();
		count = 0;
	}

	/** Method to populate a list of districts that
	* contain the user's keyword.
	*/
	public void findDistricts(ArrayList<String> searchList) {
		count = searchList.size();

		Iterator iterator = searchList.iterator();

		while(iterator.hasNext()) {
			String line = (String) iterator.next();
			Scanner lineScanner = new Scanner(line);
			lineScanner.useDelimiter(",");
			String district;
			lineScanner.next();
			lineScanner.next();
			district = lineScanner.next();
			if(!districtList.contains(district))
			districtList.add(district);
		}
	}

	/** Method to return the number of
	* occurrences of the keyword.
	*/
	public int getCount() {
		return count;
	}

	/** Method to return a list containing all
	* the districts containing the user's keyword.
	*/
	public ArrayList<String> getDistricts() {
		return districtList;
	}
}
