import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import java.awt.FlowLayout;




class CardDetails extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel(" IMC Cinema Booking  ");
	private JLabel l1 = new JLabel(" Card Number ");
	private JLabel l2 = new JLabel(" Expiry  ");
	private JLabel l3 = new JLabel(" Security Code  ");
	private JLabel l4 = new JLabel(" CardHolder Name:  ");
	
	private JTextField t1 = new JTextField("XXXX XXXX XXXX XXXX", 16);

	private JTextField t2 = new JTextField("MM" + "/" + "YY", 5);

	private JTextField t3 = new JTextField("XXX", 3);
	
	private JTextField t4 = new JTextField("");
	
	
	JMenuBar mbar=new JMenuBar();

	JMenu    options= new JMenu("Options");

	JMenuItem exit=new JMenuItem("Exit");
	
	
	
	
	
	JFrame parent;
	private String movie;
	private String cinema;
	private int children, adults, students, teens, oaps;
	private double total;
	
	
	
	private JButton b1 = new JButton("Confirm payment");
	
	
	
	
	
	public CardDetails(JFrame p){
		super();
		
		
		
		
		
		parent = p;
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(11,2));
		p2.setLayout(new GridLayout(11,2));
		l0.setFont(f);  
		content.add(l0);
		
		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(l4);
		p1.add(t4);
		p1.add(b1);
		
		content.add(p1);
		content.add(p2);
		
		this.setJMenuBar(mbar);
	    mbar.add(options);                          
	    options.add(exit);
		
		
		
		b1.addActionListener(this);
		exit.addActionListener(this); 
		
		
		setSize(310,420);    
		
		
		setVisible(true);
		
		
		}
	
	
	
	
	
	
	

	private JPanel p1=new JPanel();private JPanel p2=new JPanel();
	

	
	
	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	
	  	
	 	
	 	
        if (target==b1){ 
        	String val = t1.getText();
        	String val2 = t2.getText();
        	String val3 = t3.getText();
        	
        	
        	
        	if (val.length() > 16){
        		JOptionPane.showMessageDialog(this, "Card Number is too long");

        	}
        	else if (val.length() < 16) {
        		JOptionPane.showMessageDialog(this, "Card Number is too short");
        		
        	} 
        	else if (val2.length() > 5) {
        		JOptionPane.showMessageDialog(this, "Expiry date is too long.");

        	}
        	else if (val2.length() < 5) {
        		JOptionPane.showMessageDialog(this, "ExpiryDate is too short");
        		
        	} else if (val3.length() > 3) {
        		JOptionPane.showMessageDialog(this, "CVV is too long.");

        	}
        	else if (val3.length() < 3) {
        		JOptionPane.showMessageDialog(this, "CVV is too short");
        		
        	} else {
        
         	new Payment_Confirmed(this);
         	this.dispose();
        	}
        	}
        
        
        
        if (target==exit){
            System.exit(0);} 
        
        
         }
        


        
	 }

