/*Q50. WAP to create 2 checkboxes with content C++ and JAVA and display the text in 
Label according to the checkbox that is checked/unchecked.
Hint; ItemListener interface and over-ride method itemStateChanged () method. */
import java.awt.*; 
import java.awt.event.*; 
class CheckboxGroupExample extends Frame implements ItemListener 
{ 
	Label label;
	Checkbox checkBox1,checkBox2;
 	CheckboxGroupExample()
 	{ 
 
	 	setSize(400,400); 
 		setLayout(null); 
	 	setVisible(true);
		label = new Label(); 
	 	label.setBounds(100,350, 150, 50); 
	 
		CheckboxGroup cbg = new CheckboxGroup(); 
	 	checkBox1 = new Checkbox("C++", cbg, false); 
	 	checkBox1.setBounds(100,100, 50,50); 
	 	checkBox2 = new Checkbox("Java", cbg, false); 
	 	checkBox2.setBounds(100,150, 50,50); 
 
		add(checkBox1);
	        add(checkBox2); 
		add(label); 
 
 		checkBox1.addItemListener(this);
		checkBox2.addItemListener(this);
 	}
 
 	public void itemStateChanged(ItemEvent e) 
 	{ 
		if (checkBox1.getState()==true) 
 			label.setText("C++ checkbox: Checked");
		else
			label.setText("Java checkbox: Checked");
 	} 
 
	public static void main(String args[]) 
	{ 
 		CheckboxGroupExample ob=new CheckboxGroupExample(); 
	} 
} 
