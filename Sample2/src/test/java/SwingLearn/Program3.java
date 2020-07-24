package SwingLearn;

import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;    
import java.awt.*;  
import java.awt.event.*; 
public class Program3 {  
	 
	protected static final String Sai = null;

	public static void main(String[] args) {  
	    JFrame f=new JFrame("Wisdom Application"); 
	   // f.add(l1); //f.add(l2);  
	    
	    
	    JLabel l1,l2,l3;  
	    l1=new JLabel("Wisdom App Login");  
	   // l1.setBounds(50,50, 100,30);  
	    l1.setBounds(25, 30, 400, 30);
	    f.add(l1); //f.add(l2); 
	    f.setSize(400,00);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    l2=new JLabel("Username:");
	    l2.setBounds(50, 90, 400, 30);
	    f.add(l2); //f.add(l2); 
	    f.setSize(400,00);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    final JTextField tf = new JTextField(10); // accepts upto 10 characters
	    tf.setBounds(120, 90, 180, 30);
	    f.add(tf); //f.add(l2); 
	    f.setSize(100,00);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    l3 = new JLabel("Password:");
	    l3.setBounds(50, 140, 400, 30);
	    f.add(l3); //f.add(l2); 
	    f.setSize(400,00);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    final JTextField tf1 = new JTextField(10); // accepts upto 10 characters
	    tf1.setBounds(120, 140, 180, 30);
	    f.add(tf1); //f.add(l2); 
	    f.setSize(100,00);  
	    f.setLayout(null);  
	    f.setVisible(true);
	    String loginStr = tf.getText();
        String passwordStr = tf1.getText();
        System.out.println(loginStr);
        System.out.println(passwordStr);
        
        //Button
	    JButton b1=new JButton("Login");
	    JButton b2=new JButton("Cancel");
	    b1.setBounds(75,200,100,30);  
	    b2.setBounds(250,200,100,30); 
	    ButtonGroup bg1=new ButtonGroup(); 
	    bg1.add(b1); bg1.add(b2);
	    f.add(b1);f.add(b2);  
	    f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true); 
	    
	b1.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
                //tf.setText("Welcome to Javatpoint."); 
        	String Login = tf.getText();
        	String Password = tf1.getText();
        	System.out.println(Login);
        	System.out.println(Password);
        	if(Login=="Sai") {
            	
            	System.out.println("Enter username is correct");
            	
            } else {
            	System.out.println("Enter username is incorrect");
            }
        }  
        });  
        f.add(b1);f.add(tf); f.add(tf1);
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);   
    

    
	  
}}

//	    TextField loginText, passwordText;
//	    loginText = new TextField(16);
//	    passwordText = new TextField(16);
	    
	   

//	     // Add all the components.
//	        add(loginText);
//	        add(passwordText);
//
//	    // Register to receive action events.
//	        loginText.addActionListener(this);
//	        passwordText.addActionListener(this);
//	}
//
//	    public void actionPerformed(ActionEvent ae) {
//	        repaint();
//	      }
//
//	      public void paint(Graphics g) {
//	        double result = 0.0;
//            
//	        
//
//	    }
	    
	 
	

