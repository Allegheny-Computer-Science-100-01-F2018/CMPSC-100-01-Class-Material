import java.util.ArrayList;
import java.util.Iterator;

/** Class to search and analyze for specific
* information in the crime data.
*/
public class CrimeAnalyzer {
  private ArrayList<String> districtList;
  private int count;

  /** Constructor to initial variables
  * to default values.
  */
  public CrimeAnalyzer() {
    districtList = new ArrayList<String>();
    count = 0;
  }

  /** Method to return the value of the count variable.
  */
  public int getCount() {
    return count;
  }

  /** Method to return the districtList.
  */
  public ArrayList<String> getDistrictList() {
    return districtList;
  }
}
