import java.io.IOException;


public class ScholarPubMVC {


	
	
	public static void main(String[] args) throws IOException{

		ScholarPubInputWindow inputWindow = new ScholarPubInputWindow();

		ScholarPubModel model = new ScholarPubModel();
		ScholarPubView view = new ScholarPubView(model);
		ScholarPubController controller = new ScholarPubController(model, view);
		
		

	}

}
