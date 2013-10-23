import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class PaperDatabaseTester {

	@Test
	public void test() {
		ArrayList<String> a = new ArrayList<String>(){{
			add("type");
			add("Joel Maupin");
			add("Serialization");
			add("java");
			add("blank");
			add("date");
		}};
	
		Paper p = new Paper(a);
		ArrayList<Paper> testList = new ArrayList<Paper>();
		testList.add(p);
		PaperUtilities paperUtils = new PaperUtilities();
		paperUtils.textOutput(testList);
		assertEquals(testList, paperUtils.textInput("testFile")); //tests text input and output
		paperUtils.serialOutput(testList, "testFile");
		assertEquals(testList, paperUtils.serialInput("testFile")); //tests serial input and output
		
		
	}

}
