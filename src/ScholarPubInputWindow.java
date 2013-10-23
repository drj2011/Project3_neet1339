import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ScholarPubInputWindow extends JFrame{

	JPanel inputWindow = new javax.swing.JPanel();
	JTextField fileText = new javax.swing.JTextField();
	JLabel fileLocation = new javax.swing.JLabel();
	
	
	
	
	public ScholarPubInputWindow(){
		setLayout(new GridLayout(0, 1, 5, 5));
		add(fileText);
	}
	
	
	
}
