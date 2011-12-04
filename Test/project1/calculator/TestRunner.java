package project1.calculator;

import javax.swing.JFrame;

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
