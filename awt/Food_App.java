/*
Q56. WAP to create a food ordering application with three checkboxes Pizza, Burger, Sandwitch, according to user choice the bill of the items along with item names 
should be displayed on message dialog box and on closing window confirm dialog box should come to confirm the close of window.
*/
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class FoodApp extends JFrame implements ActionListener
{
	JCheckBox cb1,cb2,cb3; 
	JLabel l1;
	JTextField t1; 
	JButton b1;
	FoodApp()
	{
		setSize(400,400);
		setLayout(null);
		l1 = new JLabel("Order Food");
		l1.setBounds(50,50,100,20);

		cb1 = new JCheckBox("Pizza Rs 300/-");
		cb1.setBounds(50,100,200,20);

		cb2 = new JCheckBox("Burger Rs 100/-");
		cb2.setBounds(50,150,200,20);

		cb3 = new JCheckBox("Sandwich Rs 50/-");
		cb3.setBounds(50,200,200,20);
		
		b1 = new JButton("Submit");
		b1.setBounds(50,250,100,20);
		

	

		add(l1);						
		add(cb1);			
		add(cb2);			
		add(cb3);			
		add(b1);			
				
		 
		b1.addActionListener(this);
		setVisible(true);
        	setDefaultCloseOperation(EXIT_ON_CLOSE);				
	}
	public void actionPerformed(ActionEvent e){  
        	float amount=0;  
        	String msg="";  
        	if(cb1.isSelected()){  
            		amount+=300;  
	            msg="Pizza: 300\n";  
     		}  
       		if(cb2.isSelected()){  
            		amount+=100;  
            		msg+="Burger: 100\n";  
        	}  
        	if(cb3.isSelected()){  
            		amount+=50;  
            		msg+="Sandwich: 50\n";  
       	 	}  
        	msg+="-----------------\n";  
        	JOptionPane.showMessageDialog(this,msg+"Total: "+amount);  
    	}

}
class UI
{
	public static void main(String[] args)
	{
		FoodApp A = new FoodApp();
	}
}
