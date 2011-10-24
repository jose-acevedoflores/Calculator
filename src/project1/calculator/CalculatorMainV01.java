package project1.calculator;

import java.awt.Dimension;
import java.awt.Menu;
import java.awt.MenuBar;

import javax.swing.JFrame;

public class CalculatorMainV01 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Calculator");
		frame.setSize(new Dimension(454,460));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		CalculatorFunctions f = new CalculatorFunctions();
		CalculatorButtonsV01 c = new CalculatorButtonsV01(f);
		CalculatorMenus m = new CalculatorMenus();
	
		c.addGUIToFrame(frame);
		m.addMenus(frame);
		frame.setVisible(true);
	}

}
