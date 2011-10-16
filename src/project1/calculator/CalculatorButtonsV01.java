package project1.calculator;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorButtonsV01 implements ActionListener {
	
	private JButton[] buttons = new JButton[27];
	private JTextField txtField = new JTextField(36);
	private CalculatorFunctions calcFun;
	
	public CalculatorButtonsV01(CalculatorFunctions f)
	{
		calcFun = f;
		for(int i = 0 ; i < 10; i++)
		{
			buttons[i] = new JButton(Integer.toString(i));
		}
		
		String[] buttonText = {"/", "*","1/x","%", "sqrt", "-","+","=",".","+/-",
				"MC","MR","MS","M+", "Backspace","CE", "C"};
		
		for(int u = 10; u < 27 ; u++)
		{
			buttons[u] = new JButton(buttonText[u-10]);
		}
		
		txtField.setMaximumSize(txtField.getPreferredSize());
		txtField.setEditable(false);
		txtField.setHorizontalAlignment(JTextField.RIGHT);
	}
	
	/**
	 * 
	 * @param frame
	 */
	public void addGUIToFrame(JFrame frame)
	{
		Dimension buttonSize = new Dimension(60,60);
		buttons[24].setPreferredSize(new Dimension(103,50));
		buttons[25].setPreferredSize(new Dimension(103,50));
		buttons[26].setPreferredSize(new Dimension(103,50));
		
		for(int i = 0 ; i < 24; i++)
		{
			buttons[i].setPreferredSize(buttonSize);
		}
		
		JPanel numberGrid1 = new JPanel(new FlowLayout());
		JPanel numberGrid2 = new JPanel(new FlowLayout());
		JPanel numberGrid3 = new JPanel(new FlowLayout());
		JPanel numberGrid4 = new JPanel(new FlowLayout());
		JPanel clearButtonsRow = new JPanel(new FlowLayout());
		
		clearButtonsRow.add(Box.createRigidArea(new Dimension(70,0)));//Empty area to make the backspace button move to the right. 
		clearButtonsRow.add(buttons[24]);
		clearButtonsRow.add(buttons[25]);
		clearButtonsRow.add(buttons[26]);
		
		numberGrid1.add(buttons[20]);
		numberGrid1.add(Box.createRigidArea(new Dimension(5,0)));
		numberGrid1.add(buttons[7]);
		numberGrid1.add(buttons[8]);
		numberGrid1.add(buttons[9]);
		numberGrid1.add(buttons[10]);
		numberGrid1.add(buttons[14]);
		
		numberGrid2.add(buttons[21]);
		numberGrid2.add(Box.createRigidArea(new Dimension(5,0)));
		numberGrid2.add(buttons[4]);
		numberGrid2.add(buttons[5]);
		numberGrid2.add(buttons[6]);
		numberGrid2.add(buttons[11]);
		numberGrid2.add(buttons[13]);
		
		numberGrid3.add(buttons[22]);
		numberGrid3.add(Box.createRigidArea(new Dimension(5,0)));
		numberGrid3.add(buttons[1]);
		numberGrid3.add(buttons[2]);
		numberGrid3.add(buttons[3]);
		numberGrid3.add(buttons[15]);
		numberGrid3.add(buttons[12]);
		
		numberGrid4.add(buttons[23]);
		numberGrid4.add(Box.createRigidArea(new Dimension(5,0)));
		numberGrid4.add(buttons[0]);
		numberGrid4.add(buttons[19]);
		numberGrid4.add(buttons[18]);
		numberGrid4.add(buttons[16]);
		numberGrid4.add(buttons[17]);
		
		JPanel all = new JPanel();
		all.setLayout(new BoxLayout(all, BoxLayout.Y_AXIS));
		all.add(Box.createRigidArea(new Dimension(10,20))); //Space between top and textField.
		all.add(txtField);
		all.add(Box.createRigidArea(new Dimension(10,10)));//Space between textField and the first row of buttons.
		all.add(clearButtonsRow);
		all.add(numberGrid1);
		all.add(numberGrid2);
		all.add(numberGrid3);
		all.add(numberGrid4);
		all.add(Box.createRigidArea(new Dimension(50,20))); // Space in the bottom.
		
		for(int i =0 ; i < buttons.length; i++ )
		{
			buttons[i].addActionListener(this);
		}
		
		frame.getContentPane().add(all);		
	}

	
	/**
	 * Calls the appropriate CalculatorFunctions based on the input. 
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == buttons[0])
		{
			txtField.setText(txtField.getText()+"0");
		}
		
		else if(e.getSource() == buttons[1])
		{
			txtField.setText(txtField.getText()+"1");
		}
		
		else if(e.getSource() == buttons[2])
		{
			txtField.setText(txtField.getText()+"2");
		}
		
		else if(e.getSource() == buttons[3])
		{
			txtField.setText(txtField.getText()+"3");
		}
		
		else if(e.getSource() == buttons[4])
		{
			txtField.setText(txtField.getText()+"4");
		}
		
		// Square root
		else if(e.getSource() == buttons[14])
		{
			if(txtField.getText().length() != 0)
				txtField.setText(calcFun.sqrt(txtField.getText()));
		}
		
		//Backspace
		else if(e.getSource() == buttons[24]) 
		{
			if(txtField.getText().length() != 0)
			{
				String currentlyInTextField = txtField.getText(); 
				txtField.setText(currentlyInTextField.substring(0, currentlyInTextField.length()-1));
			}
		}
		
		else if(e.getSource() == buttons[26])
		{
			txtField.setText("");
		}
		
	}
	

}
