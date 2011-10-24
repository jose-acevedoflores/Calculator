package project1.calculator;

import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CalculatorMenus implements ActionListener{
	
	private MenuItem helpTopics = new MenuItem("Help Topics");
	
	public void addMenus(JFrame frame)
	{
		MenuBar menuBar = new MenuBar();
		Menu edit = new Menu("Edit", true);
		Menu view = new Menu("View", true);
		Menu help = new Menu("Help", true);
		
		edit.add("Copy Ctrl+C");
		edit.add("Copy Ctrl+V");
		view.add("I'm having a bad bad day- Despicable me");
		
		helpTopics.addActionListener(this);
		help.add(helpTopics);
		
		menuBar.add(edit);
		menuBar.add(view);
		menuBar.add(help);
		
		frame.setMenuBar(menuBar);
	}

	/**
	 * 
	 */
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource() == helpTopics )
		{
			JOptionPane.showMessageDialog(null, "Not available", "Help Topics", JOptionPane.OK_CANCEL_OPTION);
		}
		
	}

}
