package test;

import javax.swing.JFrame;

import project1.calculator.CalculatorButtons;
import project1.calculator.CalculatorFunctions;

public class TestRunner {
	
	public static void main(String args[])
	{
		CalculatorFunctions f = new CalculatorFunctions();
		CalculatorButtons c = new CalculatorButtons(f);
		
		JFrame frameTest = new JFrame();
		c.addGUIToFrame(frameTest);
		
		c.buttons[0].doClick();	
		
		System.out.println(c.calcFunctions.getFirstInput());
		
		c.buttons[16].doClick();
	
		System.out.println(c.calcFunctions.getFirstInput());
		
		c.buttons[4].doClick();
		c.buttons[7].doClick();
		c.buttons[17].doClick();
		
		System.out.println("After + -> " + c.txtField.getText());
	}

}
