import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.KeyEvent;
import javax.imageio.ImageIO;

		

class Payment_Confirmed extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel(" IMC Cinema Booking  ");
	private JLabel l1 = new JLabel(" Your order has been confirmed  ");
	private JLabel l2 = new JLabel(" Tickets have been sent to your email  ");
	
	
	
	
	JFrame parent;
	private String movie;
	private String cinema;
	private int children, adults, students, teens, oaps;
	private double total;
	
	
	
	private JButton b1 = new JButton("Exit");
	
	JMenuBar mbar=new JMenuBar();

	JMenu    options= new JMenu("Options");

	JMenuItem exit=new JMenuItem("Exit");
	
	
	
	
	public Payment_Confirmed(JFrame p){
		super();
		
		
		
		
		
		parent = p;
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(11,2));
		p2.setLayout(new GridLayout(11,2));
		l0.setFont(f);
		l1.setFont(f);
		
		content.add(l0);
		
		
		p1.add(l1);
		p1.add(l2);
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
        	
         System.exit(0);
         	
         }
        
        if (target==exit){
            System.exit(0);} 
        


        
	 }

}