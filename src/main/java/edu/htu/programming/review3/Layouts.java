package edu.htu.programming.review3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Layouts {
	public static void main(String[] args) {
		JFrame frm=new JFrame();
		frm.setSize(400, 400);
		frm.setLocationRelativeTo(null);//center on screen
		frm.setLayout(null);
		
		//by default JFrame uses BorderLayout; responsive design
		JButton comp = new JButton("Button 1");
		comp.setBounds(10, 10, 200, 50);
		frm.add(comp);//center
		frm.add(new JButton("Button 2"));
		frm.add(new JButton("Button 3"));
		frm.add(new JButton("Button 4"));
		frm.add(new JButton("Button 5"));
		
		frm.setVisible(true);
		
	}

	private static void calculatorExample() {
		JFrame frm=new JFrame();
		frm.setSize(180, 180);
		frm.setLocationRelativeTo(null);//center on screen
		
//		frm.add(new JTextField(10));
//		frm.add(new JButton("0"));
		JPanel pnlCenter=new JPanel();
		pnlCenter.setLayout(new GridLayout(4,4));
		JTextField txt=new JTextField();
		
		pnlCenter.add(new JButton("9"));
		pnlCenter.add(new JButton("8"));
		pnlCenter.add(new JButton("7"));
		pnlCenter.add(new JButton("+"));
		
		pnlCenter.add(new JButton("6"));
		pnlCenter.add(new JButton("5"));
		pnlCenter.add(new JButton("4"));
		pnlCenter.add(new JButton("-"));
		
		pnlCenter.add(new JButton("3"));
		pnlCenter.add(new JButton("2"));
		pnlCenter.add(new JButton("1"));
		pnlCenter.add(new JButton("*"));
		
		pnlCenter.add(new JButton("."));
		pnlCenter.add(new JButton("0"));
		pnlCenter.add(new JButton("="));
		pnlCenter.add(new JButton("/"));
		
		frm.add(pnlCenter, BorderLayout.CENTER);
		frm.add(txt,BorderLayout.NORTH);
		frm.setVisible(true);
	}

	private static void fLowLayout() {
		JFrame frm=new JFrame();
		frm.setSize(400, 400);
		frm.setLocationRelativeTo(null);//center on screen

		frm.setLayout(new FlowLayout());//FLowLayout: will distibute components based on their Prefered Sizes
		frm.add(new JButton("Hello from Button 1"));//center
		frm.add(new JButton("Button 5"));
		frm.add(new JButton("Button 2"));
		frm.add(new JButton("Button 3"));
		frm.add(new JButton("Button 4"));
		
		frm.setVisible(true);
	}

	private static void borderLayoutTest() {
		JFrame frm=new JFrame();
		frm.setSize(400, 400);
		frm.setLocationRelativeTo(null);//center on screen

		//by default JFrame uses BorderLayout; responsive design
		frm.add(new JButton("Button 1"));//center
		frm.add(new JButton("Button 2"),BorderLayout.NORTH);
		frm.add(new JButton("Button 3"),BorderLayout.SOUTH);
		frm.add(new JButton("Button 4"),BorderLayout.EAST);
		frm.add(new JButton("Button 5"),BorderLayout.WEST);
		
		frm.setVisible(true);
	}
}
