import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;  
class Test extends Frame implements ActionListener
{

	Button b1,b2,b3;
	Test()
	{
		setSize(400,400);
		setLayout(null);
		
		b1 = new Button("Red");
		b1.setBounds(100,100,100,20);
		b1.setBackground(Color.red);
		b2 = new Button("Green");
		b2.setBounds(100,200,100,20);
		b2.setBackground(Color.green);
		b3 = new Button("blue");
		b3.setBounds(100,300,100,20);
		b3.setBackground(Color.blue);

		b1.setActionCommand("red");
		b2.setActionCommand("green");
		b3.setActionCommand("blue");

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
		
		
		addWindowListener(new WindowAdapter(){  
                public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });  
		setVisible(true);
		
	}

	public void actionPerformed(ActionEvent e)
	{
		String comm = e.getActionCommand();
		
		
		if(comm.equals("red"))
		{
			setBackground(Color.red);
		}
		else if(comm.equals("green"))
		{
			setBackground(Color.green);
		}
		else
		{
			setBackground(Color.blue);
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
