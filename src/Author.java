import java.util.ArrayList;

public class Author {

	public Author(){
		
	}
	/**
	 * Stores an Author's first name
	 */
	private String firstName;

	/**
	 * Stores an Author's last name
	 */
	private String lastName;

	/**
	 * Stores the list of an author's publications 
	 */
	private ArrayList<Paper> publications = new ArrayList<Paper>();

	/**
	 * @return The author's full name 
	 */
	public String getFullName() {
		return null;
	}

	/**
	 * @return The list of publications associated with the author
	 */
	public ArrayList<Paper> getPublications() {
		return publications;
	}
	
	public void addPublication(Paper p){
		publications.add(p);
	}
	
	public void setName(String[] names){
		firstName = names[1];
		lastName = names[0];
	}
}