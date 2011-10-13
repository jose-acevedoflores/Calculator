package project1.calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorButtons implements ActionListener{

	public static JButton button0 = new JButton("0");
	public static JButton button1 = new JButton("1");
	public static JButton button2 = new JButton("2");
	public static JButton button3 = new JButton("3");
	public static JButton button4 = new JButton("4");
	public static JButton button5 = new JButton("5");
	public static JButton button6 = new JButton("6");
	public static JButton button7 = new JButton("7");
	public static JButton button8 = new JButton("8");
	public JButton button9 = new JButton("9");
	
	public static JButton buttonClear = new JButton("C");
	public static JButton buttonCE = new JButton("CE");
	public static JButton buttonBackSpace = new JButton("Backspace");
	
	public static JButton plusSlashMinus = new JButton("+/-");
	public static JButton sqrt = new JButton("sqrt");
	public static JButton plus = new JButton("+");
	public static JButton minus = new JButton("-");
	public static JButton multiplication = new JButton("*");
	public static JButton division = new JButton("/");
	public static JButton inverse = new JButton("1/x");
	public static JButton equals = new JButton("=");
	public static JButton percentage = new JButton("%");
	public static JButton dot = new JButton(".");
	
	public static JButton mc = new JButton("MC");
	public static JButton mr = new JButton("MR");
	public static JButton ms = new JButton("MS");
	public static JButton mplus = new JButton("M+");
	
	public static JTextField textField = new JTextField(25);
	
	
	/**
	 * 
	 * @param frame the frame to add the buttons and text area.
	 */
	public void addButtons(JFrame frame)
	{
		JPanel buttonPanel = new JPanel();
		JPanel textPanelPlusButtons = new JPanel();
		JPanel numberGrid1 = new JPanel();
		JPanel numberGrid2 = new JPanel();
		JPanel numberGrid3 = new JPanel();
		JPanel numberGrid4 = new JPanel();
		Dimension buttonSize = new Dimension(46,46);
		
		textField.setMaximumSize(textField.getPreferredSize());
		buttonClear.setPreferredSize(new Dimension(80,40));
		buttonBackSpace.setPreferredSize(new Dimension(80,40));
		buttonCE.setPreferredSize(new Dimension(80,40));
		
		mc.setPreferredSize(buttonSize);
		button9.setPreferredSize(buttonSize);
		button9.addActionListener(this);
		button9.setForeground(Color.blue);
		button8.setPreferredSize(buttonSize);
		button7.setPreferredSize(buttonSize);
		division.setPreferredSize(buttonSize);
		sqrt.setPreferredSize(buttonSize);
		
		mr.setPreferredSize(buttonSize);
		button4.setPreferredSize(buttonSize);
		button5.setPreferredSize(buttonSize);
		button6.setPreferredSize(buttonSize);
		multiplication.setPreferredSize(buttonSize);
		percentage.setPreferredSize(buttonSize);
		
		ms.setPreferredSize(buttonSize);
		button1.setPreferredSize(buttonSize);
		button2.setPreferredSize(buttonSize);
		button3.setPreferredSize(buttonSize);
		minus.setPreferredSize(buttonSize);
		inverse.setPreferredSize(buttonSize);
		
		mplus.setPreferredSize(buttonSize);
		button0.setPreferredSize(buttonSize);
		plusSlashMinus.setPreferredSize(buttonSize);
		dot.setPreferredSize(buttonSize);
		plus.setPreferredSize(buttonSize);
		equals.setPreferredSize(buttonSize);
		
		textPanelPlusButtons.setLayout(new BoxLayout(textPanelPlusButtons, BoxLayout.Y_AXIS));
		
		buttonPanel.add(Box.createRigidArea(new Dimension(55,0)));
		buttonPanel.add(buttonBackSpace);
		buttonPanel.add(buttonCE);
		buttonPanel.add(buttonClear);

		numberGrid1.add(mc);
		numberGrid1.add(Box.createRigidArea(new Dimension(5,0)));
		numberGrid1.add(button7);
		numberGrid1.add(button8);
		numberGrid1.add(button9);
		numberGrid1.add(division);
		numberGrid1.add(sqrt);
		
		numberGrid2.add(mr);
		numberGrid2.add(Box.createRigidArea(new Dimension(5,0)));
		numberGrid2.add(button4);
		numberGrid2.add(button5);
		numberGrid2.add(button6);
		numberGrid2.add(multiplication);
		numberGrid2.add(percentage);
		
		numberGrid3.add(ms);
		numberGrid3.add(Box.createRigidArea(new Dimension(5,0)));
		numberGrid3.add(button1);
		numberGrid3.add(button2);
		numberGrid3.add(button3);
		numberGrid3.add(minus);
		numberGrid3.add(inverse);
		
		numberGrid4.add(mplus);
		numberGrid4.add(Box.createRigidArea(new Dimension(5,0)));
		numberGrid4.add(button0);
		numberGrid4.add(plusSlashMinus);
		numberGrid4.add(dot);
		numberGrid4.add(plus);
		numberGrid4.add(equals);
		
		
		textPanelPlusButtons.add(textField);
		textPanelPlusButtons.add(buttonPanel);
		textPanelPlusButtons.add(numberGrid1);
		textPanelPlusButtons.add(numberGrid2);
		textPanelPlusButtons.add(numberGrid3);
		textPanelPlusButtons.add(numberGrid4);
		textPanelPlusButtons.add(Box.createRigidArea(new Dimension(0,20)));
		
		frame.getContentPane().add(textPanelPlusButtons);
	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button9)
		{
			System.out.println("Je");
			System.out.println("jajajaj");
		}
		
	}

}
