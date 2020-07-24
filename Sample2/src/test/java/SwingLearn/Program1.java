package SwingLearn;


//Java Swing - Buttons

import javax.swing.*;    
public class Program1 {  
	 
	public static void main(String[] args) {  
	    JFrame f=new JFrame("Online Test of Java ");  
		/*
		 * JButton b=new JButton("Click Here"); b.setBounds(90,120,120,30); f.add(b);
		 * f.setSize(400,400); f.setLayout(null); f.setVisible(true);
		 */
	    
	    //SaiPrasad Code dont touch it
	    //Label Creation
	    JLabel l1,l2;  
	    l1=new JLabel("Que1: Which one among these is not a primitive datatype?");  
	   // l1.setBounds(50,50, 100,30);  
	    l1.setBounds(25, 30, 400, 30);
		/*
		 * l2=new JLabel("Second Label."); l2.setBounds(50,70, 70,30);
		 */
	    f.add(l1); //f.add(l2);  
	    f.setSize(400,00);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	   
	    
	    //Radio Button
	    JRadioButton r1=new JRadioButton("int");    
	    JRadioButton r2=new JRadioButton("Float");  
	    JRadioButton r3=new JRadioButton("boolean");
	    JRadioButton r4=new JRadioButton("char");
	    r1.setBounds(50,75,100,30);    
	    r2.setBounds(50,100,100,30);   
	    r3.setBounds(50,125,100,30); 
	    r4.setBounds(50,150,100,30); 
	    ButtonGroup bg=new ButtonGroup();    
	    bg.add(r1);bg.add(r2);bg.add(r3);bg.add(r4);  
	    f.add(r1);f.add(r2);f.add(r3);f.add(r4);      
	    f.setSize(300,300);    
	    f.setLayout(null);    
	    f.setVisible(true);
	    
	   
	    //Button
	    JButton b1=new JButton("Next");
	    JButton b2=new JButton("BookMark");
	    b1.setBounds(75,200,100,30);  
	    b2.setBounds(250,200,100,30); 
	    ButtonGroup bg1=new ButtonGroup(); 
	    bg1.add(b1); bg1.add(b2);
	    f.add(b1);f.add(b2);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);  
	   
		/*
		 * JTextField t1,t2; t1=ew JTextField("Welcome to Javatpoint.");
		 * t1.setBounds(50,100, 200,30); t2=new JTextField("AWT Tutorial");
		 * t2.setBounds(50,150, 200,30); f.add(t1); f.add(t2); f.setSize(400,400);
		 * f.setLayout(null); f.setVisible(true);
		 */
	    
	    
	}  
	}