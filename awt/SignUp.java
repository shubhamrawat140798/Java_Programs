/* Program to create two labels User Name and Password with two textfields to take input and and a 
login button to handle the ActionEvent of button that should validate the username and password and 
status should be printed as success/failure in third TextField and frame window should also be closed.*/

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
class Test extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;

	Button b1;
	Test()
	{
		setSize(400,400);
		setLayout(null);
		
		l1 = new Label("User Name");
		l1.setBounds(50,50,100,20);
		
		l2 = new Label("Password");
		l2.setBounds(50,100,100,20);

		l3 = new Label("Status");
		l3.setBounds(50,150,100,20);
		
		t1 = new TextField();
		t1.setBounds(150,50,100,20);

	
		t2 = new TextField();
		t2.setBounds(150,100,100,20);
	
		
		t3 = new TextField();
		t3.setBounds(150,150,100,20);
		t3.setEditable(false);
	
		b1 = new Button("Login");
		b1.setBounds(100,200,100,20);
		b1.setBackground(Color.green);
		
		add(l1);
		add(l2);
		add(l2);
		add(t1);
		add(t2);
		add(t3);
		add(b1);
		b1.addActionListener(this);
		addWindowListener(new WindowAdapter(){  
                public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		String uname = t1.getText();
		String pass = t2.getText();
		
		if(uname.equals("abc") && pass.equals("123"))
		{
			t3.setText("Success");
			t3.setBackground(Color.green);
		}
		else
		{
			t3.setText("Fail");
			t3.setBackground(Color.red);
		}
	}
}
class UInterface
{
	public static void main(String[] args)
	{
		Test t1 = new Test();
	}
}
