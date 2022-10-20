
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;







class MyFrameStudentArr extends JFrame implements ActionListener {
	
	
	
    
	
	
	private JLabel l0 = new JLabel("  IMC Booking  ");
private JLabel l1 = new JLabel("Your name here: ");
private JTextField t1 = new JTextField("Joe Bloggs", 8);
private JLabel l3 = new JLabel("Email ");
private JTextField t3 = new JTextField("JoeBloggs@gmail.com", 14);

JFrame parent;



private String movie;
private String cinema;
private double total;

private JLabel l5 = new JLabel("Child Tickets(9.00)");
String[] list = { "0", "1", "2", "3", "4", "5" };
private JComboBox c9 = new JComboBox(list);

private JLabel l6 = new JLabel("Adult Tickets(13.00)");
String[] list2 = { "0", "1", "2", "3", "4", "5" };
private JComboBox c2 = new JComboBox(list2);

private JLabel l7 = new JLabel("Student Tickets(10.00)");
String[] list3 = { "0", "1", "2", "3", "4", "5" };
private JComboBox c3 = new JComboBox(list3);

private JLabel l8 = new JLabel("Teen Tickets(12.00) ");
String[] list4 = { "0", "1", "2", "3", "4", "5" };
private JComboBox c4 = new JComboBox(list4);

private JLabel l9 = new JLabel("OAP Tickets(11.00)");
String[] list5 = { "0", "1", "2", "3", "4", "5" };
private JComboBox c5 = new JComboBox(list5);

private JLabel l10 = new JLabel("Select a time:");
String[] list1 = { "13:05", "17:10", "20:30", "23:15" };
private JComboBox c1 = new JComboBox(list1);

private JLabel l11 = new JLabel("Discount code: ");
private JTextField t11 = new JTextField("", 14);

private JButton b7 = new JButton("View Order");




private JPanel p1 = new JPanel();
private JPanel p2 = new JPanel();

JMenuBar mbar=new JMenuBar();

JMenu    options= new JMenu("Options");

JMenuItem exit=new JMenuItem("Exit");


JPanel myImage=new JPanel();
JLabel label;

public MyFrameStudentArr(JFrame p, String movie, String cinema) {
	super();
	
	
	
	
	
	this.movie = movie;
	this.cinema = cinema;

	parent = p;
	Container content = getContentPane();
	content.setLayout(new FlowLayout());
	Font f = new Font("TimesRoman", Font.BOLD, 20);
	p1.setLayout(new GridLayout(12, 2));
	p2.setLayout(new GridLayout(12, 2));
	l0.setFont(f);
	
	content.add(l0);
	
	
	p1.add(l1);
	p1.add(t1);
	p1.add(l3);
	p1.add(t3);
	p1.add(l5);
	p1.add(c9);
	p1.add(l6);
	p1.add(c2);
	p1.add(l7);
	p1.add(c3);
	p1.add(l8);
	p1.add(c4);
	p1.add(l9);
	p1.add(c5);
	p1.add(l10);
	p1.add(c1);
	p1.add(l11);
	p1.add(t11);
	p1.add(b7);
	

	content.add(p1);
	content.add(p2);
	
	this.setJMenuBar(mbar);
    mbar.add(options);                          
    options.add(exit);
	
	
	content.add(myImage);
	//BufferedImage image=null;
	label=new JLabel();
   myImage.setPreferredSize(new Dimension(250,375));
   myImage.add(label);
	
	b7.addActionListener(this);
	exit.addActionListener(this); 

	

	setSize(310, 420);

	setVisible(true);
	
	if (movie.equals("Rocky")) {
		
	java.net.URL url = getClass().getResource("Rocky1.jpg");
	File file = new File(url.getPath());
	try{Image image = ImageIO.read(new File(url.getPath()));
	    label.setIcon(new ImageIcon(image));}
	catch(Exception e) {}
} else if (movie.equals("Rocky 2")) {
	java.net.URL url = getClass().getResource("Rocky2.jpg");
	File file = new File(url.getPath());
	try{Image image = ImageIO.read(new File(url.getPath()));
	    label.setIcon(new ImageIcon(image));}
	catch(Exception e) {}
}else if (movie.equals("Rocky 3")) {
	java.net.URL url = getClass().getResource("Rocky3.jpg");
	File file = new File(url.getPath());
	try{Image image = ImageIO.read(new File(url.getPath()));
	    label.setIcon(new ImageIcon(image));}
	catch(Exception e) {}
}else  {
	java.net.URL url = getClass().getResource("Rocky4.jpg");
	File file = new File(url.getPath());
	try{Image image = ImageIO.read(new File(url.getPath()));
	    label.setIcon(new ImageIcon(image));}
	catch(Exception e) {}
}
	
	JOptionPane.showMessageDialog(this, "Conragtulations, you have access to a discount code. Use code IMC for 10% off.");
	
}

public void actionPerformed(ActionEvent e) {

	Object target = e.getSource();

	if (target == b7) {
		String s9 = (String) c9.getSelectedItem();
		int NumChildren = Integer.parseInt(s9);
		String s2 = (String) c2.getSelectedItem();
		int NumAdult = Integer.parseInt(s2);
		String s3 = (String) c3.getSelectedItem();
		int NumStudent = Integer.parseInt(s3);
		String s4 = (String) c4.getSelectedItem();
		int NumTeen = Integer.parseInt(s4);
		String s5 = (String) c5.getSelectedItem();
		int NumOAP = Integer.parseInt(s5);
		

		

		if (t11.getText() != "") {
				String discountCode = t11.getText();
				DiscountedOrder discountedOrder = new DiscountedOrder(NumChildren, NumAdult, NumStudent, NumOAP,
						NumTeen, discountCode);
				
				total = discountedOrder.calculateTotalIncludingDiscount();
				
			} else {
				Order order = new Order(NumChildren, NumAdult, NumStudent, NumOAP, NumTeen);
				total = order.Calculate_Order();
				
			}
		
		if (total == 0) {
			JOptionPane.showMessageDialog(this, "Please select a ticket for purchase");
		} else {

			
			new Reciept(this, movie, cinema, c1.getSelectedItem().toString(), NumChildren, NumAdult, NumStudent, NumOAP, NumTeen, total);
			this.dispose();
		}

		}
		
	
	 if (target==exit){
         System.exit(0);} 
		

	}

}