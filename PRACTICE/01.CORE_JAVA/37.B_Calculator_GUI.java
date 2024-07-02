package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class B_Calculator implements ActionListener{
	
	JFrame frame;
	JLabel label1, label2, label3, label4, label5, label6;
	JTextField textField1, textField2, textField3, textField4, textField5;
	JButton btn1, btn2, btn3;
	
	public B_Calculator() {
		// TODO Auto-generated constructor stub
		
		frame = new JFrame();
		
		//LABEL
		label1 = new JLabel("CALCULATOR");
		label1.setBounds(200, 20, 85, 20);
		
		label2 = new JLabel("VALUE 1");
		label2.setBounds(80, 70, 85, 20);
		
		label3 = new JLabel("VALUE 2");
		label3.setBounds(80, 110, 85, 20);
		
		label4 = new JLabel("ADDITION");
		label4.setBounds(80, 150, 105, 20);
		
		label5 = new JLabel("SUBTRACTION");
		label5.setBounds(80, 190, 105, 20);
	
		label6 = new JLabel("MULTIPLICATION");
		label6.setBounds(80, 230, 105, 20);
		
		//TEXT FIELDS
		textField1 = new JTextField();
		textField1.setBounds(250, 70, 150, 20);
		
		textField2 = new JTextField();
		textField2.setBounds(250, 110, 150, 20);
		
		textField3 = new JTextField();
		textField3.setBounds(250, 150, 150, 20);
		
		textField4 = new JTextField();
		textField4.setBounds(250, 190, 150, 20);
		
		textField5 = new JTextField();
		textField5.setBounds(250, 230, 150, 20);
		
		//BUTTONS
		btn1 = new JButton("ADDITION");
		btn1.setBounds(50, 300, 95, 20);
		
		btn2 = new JButton("SUBTRACTION");
		btn2.setBounds(150, 300, 125, 20);
		
		btn3 = new JButton("MULTIPLICATION");
		btn3.setBounds(280, 300, 140, 20);
		
		//ACTION_LISTENER
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		
		
		
		frame.setSize(500, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		
		//LABEL
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		
		//TEXTFIELDS
		frame.add(textField1);
		frame.add(textField2);
		frame.add(textField3);
		frame.add(textField4);
		frame.add(textField5);
		
		//BUTTONS
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		
	}
	
	public static void main(String[] args) {
		
		new B_Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String One = textField1.getText().toString();
		String Two = textField2.getText().toString();
		int c = 0;
		
		if(e.getSource() == btn1)
		{
			c = Integer.parseInt(One) + Integer.parseInt(Two);
			textField3.setText(String.valueOf(c));
		}
		if(e.getSource() == btn2)
		{
			c = Integer.parseInt(One) - Integer.parseInt(Two);
			textField4.setText(String.valueOf(c));
		}
		if(e.getSource() == btn3)
		{
			c = Integer.parseInt(One) * Integer.parseInt(Two);
			textField5.setText(String.valueOf(c));
		}
		
	}

}