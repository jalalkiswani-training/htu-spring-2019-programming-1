package edu.htu.programming.lesson7;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * GUI: Graphical User Interface --> 
 * 1- AWT: easy but very basic , 
 * 2- Swing: very powerful but heavy, 
 * 3- Java FX: modern but not mature
 */
public class SwingTest {
	public static void main(String[] args) {
		JFrame frmMain=new JFrame("My First Swing Frame");
		//frmMain.setTitle("My First Swing Frame"); we cann pass it direcrly from the constructor
		frmMain.setSize(300, 300);//in pixels
		frmMain.setLocationRelativeTo(null);//center window on the screen
		
		frmMain.setLayout(new FlowLayout());//to give each component only the required size
		//this will over the default layout which is BorderLayout
		
		JTextField txtName=new JTextField();
		txtName.setPreferredSize(new Dimension(250, 30));//to control the size of the field
		
		JButton btnSayHello=new JButton("Say Hello");
		JButton btnSayBye=new JButton("Say Bye");
		
		//on button click event		
		btnSayHello.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//System.out.println("Hi from uncle Jalal");
				String name=txtName.getText();
				JOptionPane.showMessageDialog(null, "Hi, "+name+"!");
			}
		});
		
		btnSayBye.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String name=txtName.getText();
				JOptionPane.showMessageDialog(null, "Bye ,"+name+"!");
			}
		});
		JLabel lblName=new JLabel("Your Name");
		
		frmMain.add(lblName);
		frmMain.add(txtName);
		frmMain.add(btnSayHello);//to make visible on the frame
		frmMain.add(btnSayBye);	
		frmMain.setVisible(true);	
		
	}
}
