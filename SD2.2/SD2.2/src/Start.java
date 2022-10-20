import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;


class Start extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel(" IMC Cinema Booking  ");
	
	
	
	private JButton b9=new JButton("Start Booking");
	
	
	

	private JPanel p1=new JPanel();private JPanel p2=new JPanel();
	JMenuBar mbar=new JMenuBar();

	JMenu    options= new JMenu("Options");


	JMenuItem exit=new JMenuItem("Exit");



	
	
	public Start(String s){
		super();
		
		Container content=getContentPane();
		content.setLayout(new FlowLayout());
		Font f=new Font("TimesRoman", Font.BOLD,20);
		p1.setLayout(new GridLayout(5,2));
		p2.setLayout(new GridLayout(4,2));
		l0.setFont(f);  
		content.add(l0);
		p1.add(b9); 
		

		content.add(p1);
		content.add(p2);
		
		this.setJMenuBar(mbar);
        mbar.add(options);                     
        options.add(exit);                            
        
        exit.addActionListener(this);   
		b9.addActionListener(this); 	
		
		

		
		setSize(310,420);    setVisible(true);}
	

	
	
	
	public void actionPerformed(ActionEvent e){
        
	  	Object target=e.getSource();
	  	
	  	
	 	
	 	
        if (target==b9){ 
        	
         	new SelectionMenu(this);
         	this.dispose();
         	
         }
        
        if (target==exit){
            System.exit(0);} 

        


        
	 }

}