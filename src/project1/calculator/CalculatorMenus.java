package project1.calculator;

import java.awt.Menu;
import java.awt.MenuBar;

import javax.swing.JFrame;

public class CalculatorMenus {
	
	public void addMenus(JFrame frame)
	{
		MenuBar menuBar = new MenuBar();
		Menu edit = new Menu("Edit", true);
		Menu about = new Menu("About", true);
		Menu help = new Menu("Help", true);
		
		edit.add("Whaat");
		edit.add("Papoi");
		about.add("I'm having a bad bad day- Despicable me");
		
		menuBar.add(edit);
		menuBar.add(about);
		menuBar.add(help);
		
		frame.setMenuBar(menuBar);
	}

}
