package project1.calculator;

import java.awt.Menu;
import java.awt.MenuBar;

import javax.swing.*;

public class CalculatorMain {

	public static void main(String[] args) {

		JFrame calculatorFrame = new JFrame("Calculator");
		
		MenuBar menuBar = new MenuBar();
		Menu edit = new Menu("Edit", true);
		Menu about = new Menu("About", true);
		
		calculatorFrame.setSize(350,320);
		calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculatorFrame.setResizable(false);
		
		CalculatorButtons c = new CalculatorButtons();
		
		edit.add("Whaat");
		edit.add("Papoi");
		about.add("I'm having a bad bad day- Despicable me");
		
		menuBar.add(edit);
		menuBar.add(about);
		calculatorFrame.setMenuBar(menuBar);
		c.addButtons(calculatorFrame);
		
		//calculatorFrame.pack();
		
		calculatorFrame.setVisible(true);

	}

}
