import java.util.ArrayList;

public class PaperUtilities {

	/**
	 * The temporary ArrayList that the read and write objects will be stored in.
	 */
	private ArrayList<Paper> tempList;

	/**
	 * Reads the input through the given filename, and returns an arraylist of type paper
	 * @param fileName	The filename that the user inputs
	 * @return	ArrayList of type paper is returned
	 */
	public ArrayList<Paper> textInput(String fileName) {
		return tempList;
	}
	/**
	 * Outputs a text file of strings that have the values of of Paper objects 
	 * @param list
	 */
	public void textOutput(ArrayList<Paper> list) {

	}

	/**
	 * Reads the serial input through the given filename, and returns an arraylist of type paper
	 * @param fileName The filename that the user inputs
	 * @return	ArrayList of type paper is returned
	 */
	public ArrayList<Paper> serialInput(String fileName) {
		return tempList;
	}
	/**
	 * Outputs a serial file that corresponds to the ArrayList of Paper objects
	 * @param list	The ArrayList of paper objects that the user wants to output.
	 * @param fileName	The file that the serial data will be written to.
	 */
	public void serialOutput( ArrayList<Paper> list, String fileName) {
	}

}