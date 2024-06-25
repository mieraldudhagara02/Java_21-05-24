package frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SuccessFull {
	
	JFrame frame;
	JLabel label;
	
	public SuccessFull() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		//LABEL
		label = new JLabel("SUCCESSFULLY SUBMITED!");
		label.setBounds(165, 115, 170, 20);
		
		frame.setSize(500, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		
		//LABEL
		frame.add(label);
	}

}