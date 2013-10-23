import java.io.IOException;


public class ScholarPubMVC {


	static ScholarPubModel model = new ScholarPubModel();
	static ScholarPubView view = new ScholarPubView();
	static ScholarPubController controller = new ScholarPubController();
	
	static ScholarPubInputWindow i = new ScholarPubInputWindow();
	
	public static void main(String[] args) throws IOException{

		controller.setModel(model);
		controller.setInputWindow(i);
	
		
	}

}
