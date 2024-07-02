package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class Form implements ActionListener{
	
	JFrame firstFrame;
	JLabel Label1, Label2, Label3, Label4, Label5, Label6;
	JTextArea textArea1,textArea2,textArea3, textArea4; 
	JPasswordField password;
	JButton btn;
	
	public Form()
	{
		firstFrame = new JFrame();
		
		//LABELS
		Label1 = new JLabel("-: FORM VALIDATION :-");
		//Label1.setBounds(int x, int y, int width, int height);
		Label1.setBounds(230, 10, 140, 20);
		
		Label2 = new JLabel("Enter Your First Name : ");
		Label2.setBounds(100, 50, 155, 20);
		
		Label3 = new JLabel("Enter Your Second Name : ");
		Label3.setBounds(100, 90, 155, 20);
		
		Label4 = new JLabel("Phone Number : ");
		Label4.setBounds(100, 130, 155, 20);
		
		Label5 = new JLabel("Email : ");
		Label5.setBounds(100, 170, 155, 20);
		
		Label6 = new JLabel("Password : ");
		Label6.setBounds(100, 210, 155, 20);
		
		//TEXT AREA
		textArea1 = new JTextArea();
		textArea1.setBounds(270, 50, 200, 20);
		
		textArea2 = new JTextArea();
		textArea2.setBounds(270, 90, 200, 20);
		
		textArea3 = new JTextArea();
		textArea3.setBounds(270, 130, 200, 20);
		
		textArea4 = new JTextArea();
		textArea4.setBounds(270, 170, 200, 20);
		
		//PASSWORD
		password = new JPasswordField();
		password.setBounds(270, 210, 200, 20);
		
		//BUTTON
		btn = new JButton("SUBMIT");
		btn.setBounds(250, 270, 100, 20);
		
		btn.addActionListener(this);
		
		
		
		//firstFrame.setSize(int width, int height);
		firstFrame.setSize(600, 400);
		firstFrame.setLayout(null);
		firstFrame.setVisible(true);
		
		//LABELS
		firstFrame.add(Label1);
		firstFrame.add(Label2);
		firstFrame.add(Label3);
		firstFrame.add(Label4);
		firstFrame.add(Label5);
		firstFrame.add(Label6);
		
		//TEXTAREA
		firstFrame.add(textArea1);
		firstFrame.add(textArea2);
		firstFrame.add(textArea3);
		firstFrame.add(textArea4);
		
		//PASSWORD
		firstFrame.add(password);
		
		//BUTTON
		firstFrame.add(btn);
	}
	
	public static void main(String[] args) {
		
		new Form();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == btn)
		{
			new SuccessFull();
		}		
	}

}