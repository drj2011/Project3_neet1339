
public class ScholarPubMVC {


	static ScholarPubInputWindow inputWindow = new ScholarPubInputWindow();

	static ScholarPubModel model = new ScholarPubModel();
	static ScholarPubView view = new ScholarPubView(model);
	static ScholarPubController controller = new ScholarPubController(model, view);
	
	public static void main(String[] args){

		
		inputWindow.setVisible(true);
		inputWindow.isVisible();

	}

}
