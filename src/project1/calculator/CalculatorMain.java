package project1.calculator;

import java.awt.Menu;
import java.awt.MenuBar;

import javax.swing.*;

public class CalculatorMain {

	public static void main(String[] args) {

		JFrame calculatorFrame = new JFrame("Calculator");
		
	
		calculatorFrame.setSize(450,390);
		calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorFrame.setResizable(false);
		
		CalculatorButtons cb = new CalculatorButtons();
		cb.addButtons(calculatorFrame);

		CalculatorMenus cm = new CalculatorMenus();
		cm.addMenus(calculatorFrame);
		
		
		//calculatorFrame.pack();
		
		calculatorFrame.setVisible(true);

	}

}
