package assignment_module_3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class Question_2 implements ActionListener {
	
	JFrame frame;
	Font font;
	JLabel label1, label2, label3, label4, label5, label6;
	JTextField tf1, tf2, tf3, tf4;
	JRadioButton radiobutton1, radiobutton2;
	ButtonGroup btnGroup;
	JButton btn1, btn2, btn3, btn4, btn5, btn6; 
	JTable table;
	JScrollPane scrollpane;
	DefaultTableModel model;
	
	public Question_2() {
		// TODO Auto-generated constructor stub
		
		//initialization of frame
		frame = new JFrame();
		
		//initialization of font
		font = new Font("arial", Font.BOLD, 16);
		
		//initialization of label
		label1 = new JLabel("Registration Form");
		label1.setBounds(300, 20, 140, 20);
		label1.setFont(font);
		
		label2 = new JLabel("Id");
		label2.setBounds(20, 50, 65, 20);
		label2.setFont(font);
		
		label3 = new JLabel("Name");
		label3.setBounds(20, 80, 65, 20);
		label3.setFont(font);
		
		label4 = new JLabel("Gender");
		label4.setBounds(20, 110, 65, 20);
		label4.setFont(font);
		
		label5 = new JLabel("Address");
		label5.setBounds(20, 140, 65, 20);
		label5.setFont(font);
		
		label6 = new JLabel("Contact");
		label6.setBounds(20, 170, 65, 20);
		label6.setFont(font);
		
		//initialization of text field
		tf1 = new JTextField();
		tf1.setBounds(95, 50, 150, 20);
		
		tf2 = new JTextField();
		tf2.setBounds(95, 80, 150, 20);
		
		//initialization of radio button
		radiobutton1 = new JRadioButton("Male");
		radiobutton1.setBounds(95, 110, 60, 20);
		radiobutton1.setFont(font);
				
		radiobutton2 = new JRadioButton("Female");
		radiobutton2.setBounds(160, 110, 100, 20);
		radiobutton2.setFont(font);
		
		btnGroup = new ButtonGroup();
		btnGroup.add(radiobutton1);
		btnGroup.add(radiobutton2);
		
		tf3 = new JTextField();
		tf3.setBounds(95, 140, 150, 20);
		
		tf4 = new JTextField();
		tf4.setBounds(95, 170, 150, 20);
		
		//initialization of button
		btn1 = new JButton("Exit");
		btn1.setBounds(30, 250, 85, 20);
		
		btn2 = new JButton("Register");
		btn2.setBounds(130, 250, 85, 20);
		
		btn3 = new JButton("Delete");
		btn3.setBounds(30, 275, 85, 20);
		
		btn4 = new JButton("Update");
		btn4.setBounds(130, 275, 85, 20);
		
		btn5 = new JButton("Reset");
		btn5.setBounds(75, 300, 85, 20);
		
		btn6 = new JButton("Refresh");
		btn6.setBounds(480, 380, 85, 20);
		
		String column[] = {"Id", "Name", "Gender", "Address", "Contact"};
		
		//initialization of model
		model = new DefaultTableModel(column, 0);
		
		//initialization of table
		table = new JTable(model);
		table.setBounds(270,50,520,310);
		
		//initialization of scroll pane
		scrollpane = new JScrollPane(table);
		scrollpane.setBounds(270,50,520,310);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		
		
		
		
		
		//set the properties to frame
		frame.setSize(830, 450);
		frame.setLayout(null);
		frame.setVisible(true);;
		
		//add labels to frame
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		
		//add text fields to frame
		frame.add(tf1);		
		frame.add(tf2);		
		frame.add(tf3);		
		frame.add(tf4);	
		
		//add radio buttons to frame
		frame.add(radiobutton1);
		frame.add(radiobutton2);
		
		//add buttons to frame
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		
		//add table to frame
		frame.add(scrollpane);
		
	}
	
	public static void main(String[] args) {
		
		new Question_2();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		//exit
		if(e.getSource() == btn1)
		{
			frame.setVisible(false);
		}
		
		//register
		if(e.getSource() == btn2)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment", "root", "");
				
				//id
				String id = tf1.getText().toString();
				int id2 = Integer.parseInt(id);
				
				//name
				String name = tf2.getText().toString();
				
				//gender
				String gender = null;
				
				//address
				String address = tf3.getText().toString();
				
				//contact
				String contact = tf4.getText().toString();
				
				if(radiobutton1.isSelected())
				{
					 gender = radiobutton1.getText().toString();
				}
				else if(radiobutton2.isSelected())
				{
					 gender = radiobutton2.getText().toString();
				}
				
				String sql = "insert into registration values ('"+id2+"','"+name+"','"+gender+"','"+address+"','"+contact+"')";
				
				Statement statement = connect.createStatement();
				int data = statement.executeUpdate(sql);
				
				if(data>0)
				{
					frame.setVisible(false);
				}
				else
				{
					System.out.println("Error");
				}				
				
			}
			catch (Exception e1) 
			{
				// TODO: handle exception
				 e1.printStackTrace();
			}
		}
		
		//delete
		if(e.getSource() == btn3)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root","");
				
				String id = tf1.getText().toString();
				int id2 = Integer.parseInt(id);
				
				String sql = "delete from registration where Id='"+id2+"'";
				
				Statement stmt = con.createStatement();
				
				int data = stmt.executeUpdate(sql);
				
				if(data>0)
				{
					frame.setVisible(false);
				}
				else
				{
					System.out.println("Error");
				}
			}
			catch (Exception e1) 
			{
				// TODO: handle exception				
				e1.printStackTrace();
			}
		}
		
		//update
		if(e.getSource() == btn4)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root", "");
				
				//id
				String id = tf1.getText().toString();
				int id2 = Integer.parseInt(id);
				
				//name
				String name = tf2.getText().toString();
				
				//gender
				String gender = null;
				
				//address
				String address = tf3.getText().toString();
				
				//contact
				String contact = tf4.getText().toString();
				
				if(radiobutton1.isSelected())
				{
					 gender = radiobutton1.getText().toString();
				}
				else if(radiobutton2.isSelected())
				{
					 gender = radiobutton2.getText().toString();
				}
				
				String sql = "update registration set Name = '"+name+"',Gender = '"+gender+"', Address = '"+address+"', Contact = '"+contact+"' where Id = '"+id2+"'";
				
				Statement stmt = connect.createStatement();
				int set = stmt.executeUpdate(sql);	
				
				if(set>0)
				{
					frame.setVisible(false);
				}
				else
				{
					System.out.println("Error");
				}
				
			} 
			catch (Exception e1) 
			{
				// TODO: handle exception
				e1.printStackTrace();
			}
		}
		
		//reset
		if(e.getSource() == btn5)
		{
			tf1.setText("");
			tf2.setText("");
			btnGroup.clearSelection();
			tf3.setText("");
			tf4.setText("");
		}
		
		if(e.getSource() == btn6)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver"); 
				Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment","root", "");
				String sql = "select * from registration";
				Statement stmt = connect.createStatement();

				ResultSet set = stmt.executeQuery(sql);



				model.setRowCount(0);
							
				while(set.next())
				{
					model.addRow(new Object[] {set.getInt(1), set.getString(2),set.getString(3),set.getString(4),set.getLong(5)});
								
				}
			}
			catch (Exception e1) 
			{
				System.out.println(e1);
			}
		}
		
	}

}