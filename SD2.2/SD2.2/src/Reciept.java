import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

		

class Reciept extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel(" IMC Cinema Booking  ");
	
	JFrame parent;
	private String movie;
	private String cinema;
	private int children, adults, students, teens, oaps;
	private double total;
	private JButton b1 = new JButton("Pay with debit/visa");
	
	
	JMenuBar mbar=new JMenuBar();

	JMenu    options= new JMenu("Options");

	JMenuItem exit=new JMenuItem("Exit");
	
	
	public Reciept(JFrame p, String movie, String cinema, String time, int children, int adults, int students, int teens, int oaps, double total){
		super();
		
		
		
		this.movie = movie;
		this.cinema = cinema;
		
		this.children = children;
		this.adults = adults;
		this.students = students;
		this.teens = teens;
		this.oaps = oaps;
		this.total = total;
		
		JLabel l1 = new JLabel(" Movie:  " + movie);
		JLabel l2 = new JLabel(" Cinema:  " + cinema);
		JLabel l9 = new JLabel(" Time:  " + time);
		JLabel l3 = new JLabel(" Children  " + children);
		JLabel l4 = new JLabel(" Adults  " + adults);
		JLabel l5 = new JLabel(" Students  " + students);
		JLabel l6 = new JLabel(" Teens  " + teens);
		JLabel l7 = new JLabel(" OAPS  " + oaps);
		JLabel l8 = new JLabel(" Total " + "€" + total);
		
		
		parent = p;
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(11,2));
		p2.setLayout(new GridLayout(11,2));
		l0.setFont(f);  
		content.add(l0);
		
		p1.add(l1);
		p1.add(l2);
		p1.add(l9);
		p1.add(l3);
		p1.add(l4);
		p1.add(l5);
		p1.add(l6);
		p1.add(l7);
		p1.add(l8);
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
        	
         	new CardDetails(this);
         	this.dispose();
         	
         }
        
        if (target==exit){
            System.exit(0);} 
        


        
	 }

}