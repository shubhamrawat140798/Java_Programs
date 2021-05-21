/*
Q55. WAP to create a Registration Form with fields Name (TextField), Roll No (TextField), 
Gender (Radio Button), Address (TextArea), Profession(Combo Box), one Checkbox with text 
as Terms and Conditions with three buttons Submit, Select Color, Reset button, and one 
Text Area. The data should be displayed in TextArea when check box is checked on Submit 
button, Select Color button-user should select the color and textarea background should 
be filled, reset button should clear all fields.
*/
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class Registration extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	JButton b1,b2,b3;
	JRadioButton rb1,rb2;
	JComboBox cb;
	JCheckBox jcb;
	Registration()	
	{
		setSize(400,400);
		setLayout(null);
		l1 = new JLabel("Name:");
		l1.setBounds(50,50,100,20);

		l2 = new JLabel("Roll No.:");
		l2.setBounds(50,100,100,20);

		l3 = new JLabel("Gender:");
		l3.setBounds(50,150,100,20);
		
		l4 = new JLabel("Adress:");
		l4.setBounds(50,200,100,20);

		l5 = new JLabel("Profession:");
		l5.setBounds(50,250,100,20);

		l6 = new JLabel("Terms and Condition");
		l6.setBounds(90,300,200,20);
		
		jcb = new JCheckBox();	
		jcb.setBounds(50,300,20,20);

		t1 = new JTextField();
		t1.setBounds(155,50,100,20);
		t1.setToolTipText("Please enter name ");
		
		t2 = new JTextField();
		t2.setBounds(155,100,100,20);
		t2.setToolTipText("Please enter  your Roll No. ");
		
		t3 = new JTextField();
		t3.setBounds(155,200,100,20);
		t3.setToolTipText("Please enter your Address ");
		
		
		t4 = new JTextField();
		t4.setBounds(50,450,100,20);
	
		rb1 = new JRadioButton("Male");
		rb1.setBounds(155,150,60,20);

		rb2 = new JRadioButton("Female");
		rb2.setBounds(220,150,100,20);

		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		cb = new JComboBox();
		cb.setBounds(155,250,100,20);
		cb.addItem("Software Engineer");
		cb.addItem("Plumber");
		cb.addItem("Teacher");
		cb.addItem("Gym Trainner");
		
		b1 = new JButton("Submit");
		b1.setBounds(50,350,100,20);

		b2 = new JButton("Set Color");
		b2.setBounds(50,390,100,20);

		b3 = new JButton("Reset");
		b3.setBounds(50,430,100,20);
		
		//add 
		add(jcb);
		add(cb);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(rb2);
		add(rb1);
		add(b1);
		add(b2);
		add(b3);

		b2.addActionListener(this);		
	
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		Color c=JColorChooser.showDialog(this,"Choose Color",Color.green);
		t4.setBackground(c);
	}
}
class UI
{
	public static void main(String[] args)
	{
		Registration R = new Registration();
	}
}
