import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;


/**
 * Project #2
 * CS 2234
 * Sep 24, 2013
 * <P>
 * This class is the main class of the program.  It prompts the user to 
 * provide the file location that contains the information for the paper
 * database, creates the database, then prompts the user to sort or search
 * the database as they please.
 * </P>
 * 
 * @version 1.0
 * 
 */
public class ScholarPub {

	/**
	 * Stores the location of the text file containing the 
	 * Paper database information.
	 */


	/**
	 * Stores the input by the user when asked what task 
	 * to perform.
	 * @throws IOException
	 * @throws ClassNotFoundException 
	 * @throws HeadlessException 
	 */





	public static void main(String[] args) throws IOException, HeadlessException, ClassNotFoundException{

		/**
		 * An instance of the PaperDatabase object.
		 */
		PaperDatabase database = new PaperDatabase();
		database.fillDirectory();

		int userOption = 12;

		BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));


		while(userOption != 0)
		{
			System.out.println("What would you like to do?");
			System.out.println("Enter the corresponding characters for the process you wish to complete."
					+ "\n" +  "BI to sort bibliographically." + "\n" + "AN to sort by author." + "\n" +
					"PT to sort by paper title." + "\n" + "ST to sort by serial title." + "\n" + 
					"CH to sort chronologically." + "\n" + "R to sort randomly." + "\n" + 
					"PS to print to screen." + "\n" + "PF to print to a text file." + "\n" +
					"SV to print to a binary file." + "\n" + "LDB to load from a binary file." + "\n" + "LDT to load from a text file" +  "\n" +
					"S to search the collection." + "\n" + "G to output data to a graph" + "\n" + "E to exit.");

			String userText = inputReader.readLine();

			if(userText.equalsIgnoreCase("E"))
			{
				userOption = 0;
				System.out.println("Exited");
			} else if(userText.equalsIgnoreCase("BI")){
				userOption = 1;
			} else if(userText.equalsIgnoreCase("AN")){
				userOption = 2;
				System.out.println("AN");
			} else if(userText.equalsIgnoreCase("PT")){
				userOption = 3;
				System.out.println("PT");
			} else if(userText.equalsIgnoreCase("ST")){
				userOption = 4;
				System.out.println("ST");
			} else if(userText.equalsIgnoreCase("CH")){
				userOption = 5;
				System.out.println("CH");
			} else if(userText.equalsIgnoreCase("R")){
				userOption = 6;
				System.out.println("R");
			} else if(userText.equalsIgnoreCase("PS")){
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				userOption = 7;
			} else if(userText.equalsIgnoreCase("PF")){
				userOption = 8;
				System.out.println("PF");
			} else if(userText.equalsIgnoreCase("S")){
				userOption = 9;
				System.out.println("S");
			} else if(userText.equalsIgnoreCase("SV")){
				userOption = 10;
				System.out.println("SV");
			} else if(userText.equalsIgnoreCase("LDB")){
				userOption = 11;
				System.out.println("LDB");
			} else if(userText.equalsIgnoreCase("G")){
				userOption = 12;
				System.out.println("G");
			} else if(userText.equalsIgnoreCase("LDT")){
				userOption = 13;
			}else{
				userOption = -1;
				JOptionPane.showMessageDialog(null, "Invalid response, please try again");
			}
			if (userOption > 1 && userOption < 7)
			{ 
				database.sortRouting(userOption);
			} else if (userOption == 7) {
				database.output();
			} else if(userOption == 8){
				System.out.println("What directory would you like to write the file to?");
				database.fileWriter(inputReader.readLine());
			}else if (userOption == 9){

				System.out.println("Enter the corresponding characters for the criteria you would like to search for."
						+ "\n" +  "BI to search bibliographically." + "\n" + "AN to search by author." + "\n" +
						"PT to search by paper title." + "\n" + "ST to search by serial title." + "\n" + 
						"CH to search chronologically." + "\n" + "FA to search by author.");
				String searchType = inputReader.readLine();
				
				if(searchType.equals("PT") || searchType.equals("ST") )
				{	
					if(searchType.equals("PT")){
						database.sortRouting(3);
						System.out.println("List sorted by paper title");
					}else{
						database.sortRouting(4);
						System.out.println("List sorted by serial title");
					}
					System.out.println("What would you like to search for?");
					String searchText = inputReader.readLine();
					database.binarySearch(searchType, searchText);
				} else if(searchType.equals("FA")){
					
					Author a = database.getAuthor(JOptionPane.showInputDialog("Input the name of the author you would like to search, in the format 'Last Name, First Name'"));
					ArrayList<Paper> pubs = a.getPublications();
					for(Paper p : pubs){
						System.out.println(p.getInfo(0) + "\n" + p.getInfo(1) + "\n" + p.getInfo(2) +
								"\n" + p.getInfo(3) + "\n" + p.getInfo(4) + "\n" + p.getInfo(5));
						if(!p.getInfo(6).equals("")){
							System.out.println(p.getInfo(6));
						}
						System.out.println();
					}
				}else{
					System.out.println("What would you like to search for?");
					String searchText = inputReader.readLine();
					database.search(searchText);
				}
			}else if(userOption == 10){
				database.binaryFileWriter(JOptionPane.showInputDialog("Name your output file"));
			}else if(userOption == 11){
				System.out.println("HI");
				database.binaryFileReader(JOptionPane.showInputDialog("What is the file called?"));
			}else if(userOption == 13){
				database.fileWriter(JOptionPane.showInputDialog("Name your output file"));
			}else if(userOption == 12){
				String aName = JOptionPane.showInputDialog("What is the name of the author?");
				String type = JOptionPane.showInputDialog("select 'TP' for type of publication, 'PY' for publications per year, " + "\n" + "'CPY' for conference papers per year, 'JAY' for journal articles per year," + "\n" + " or 'NC' for number of co-authors per publication.");
					database.showGraph(aName, type);
			}

		}




	}

}
























