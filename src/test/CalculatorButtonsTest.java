package test;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.Test;

import project1.calculator.CalculatorButtons;
import project1.calculator.CalculatorFunctions;

public class CalculatorButtonsTest {

	CalculatorFunctions f = new CalculatorFunctions();
	CalculatorButtons c = new CalculatorButtons(f);
	JFrame frameTest = new JFrame();
	
	@Test
	public void testCalcButtons() 
	{
		c.addGUIToFrame(frameTest);
		
		c.buttons[0].doClick();	
		
		assertTrue(
				
				c.calcFunctions.getFirstInput().equals("q")
				
			);
		
		c.buttons[16].doClick();
		
		
		assertTrue(
				
				c.calcFunctions.getFirstInput().equals("0")
				
				);
		
		c.buttons[4].doClick();
		c.buttons[7].doClick();
		c.buttons[17].doClick(); // Equals button
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
				-	47 ) < 1e-10
				
				);
		
		assertTrue(
				
				c.calcFunctions.getFirstInput().equals("q")
				
			);
		
		c.buttons[17].doClick(); // Equals button

		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
				-	94 ) < 1e-10
				);
		
		c.buttons[10].doClick(); // Division button
		c.buttons[5].doClick(); 
		c.buttons[17].doClick(); // Equals button
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
						-	18.8 ) < 1e-10
				);
		
		assertTrue(
				
				c.calcFunctions.getFirstInput().equals("q")
				
			);
		
		frameTest.dispose();
		
	}
	
	
	@Test
	public void testCalcButtons2()
	{
		

		c.addGUIToFrame(frameTest);
		assertTrue(
				
				c.calcFunctions.getLastPressedButton().equals("0")
				
				);
		
		c.buttons[10].doClick(); // Division button
		c.buttons[5].doClick(); 
		c.buttons[17].doClick(); // Equals button
		
		
		assertTrue(
				
				c.calcFunctions.getLastPressedButton().equals("=")
				&&	
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					-	0 ) < 1e-10
				);
		
		c.buttons[25].doClick(); // CE button
		c.buttons[2].doClick(); // 2 button
		c.buttons[8].doClick(); // 8 button
		c.buttons[25].doClick(); // CE button
		c.buttons[15].doClick();// minus button
		c.buttons[25].doClick(); // CE button
		
		c.buttons[17].doClick(); // Equals button
		
		assertTrue(
					
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					-	0 ) < 1e-10
				);
		
		c.buttons[15].doClick();// minus button
		c.buttons[8].doClick(); // 8 button
		c.buttons[25].doClick(); // CE button
		c.buttons[7].doClick(); // 7 button
		c.buttons[3].doClick(); // 3 button
		c.buttons[5].doClick(); // 5 button
		c.buttons[24].doClick(); // Backspace button
		c.buttons[10].doClick(); // Division button
		c.buttons[11].doClick(); // Multiplication button
		c.buttons[17].doClick(); // Equals button
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					-	5329 ) < 1e-10
				);
		
		c.buttons[10].doClick(); // Division button
		c.buttons[8].doClick(); // 8 button
		c.buttons[6].doClick(); // 6 button
		c.buttons[25].doClick(); // CE button
		c.buttons[8].doClick(); // 8 button
		c.buttons[17].doClick(); // Equals button
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					-	666.125 ) < 1e-10
				);
		
		c.buttons[11].doClick(); // Multiplication button
		c.buttons[4].doClick(); // 4 button
		c.buttons[15].doClick();// minus button
		c.buttons[2].doClick(); // 2 button
		c.buttons[0].doClick(); // 0 button
		c.buttons[0].doClick(); // 0 button
		c.buttons[0].doClick(); // 0 button
		c.buttons[10].doClick(); // Division button
		c.buttons[7].doClick(); // 7 buttons
		c.buttons[15].doClick();// minus button
		c.buttons[9].doClick(); // 9 button
		c.buttons[0].doClick(); // 0 button
		c.buttons[10].doClick(); // Division button
		c.buttons[4].doClick(); // 4 button
		c.buttons[15].doClick();// minus button
		c.buttons[8].doClick(); // 8 button
		c.buttons[17].doClick(); // Equals button
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					+	6.767857143 ) < 1e-6
				);
	
		frameTest.dispose();
	}
	
	@Test
	public void testSqrt()
	{
		c.addGUIToFrame(frameTest);
		
		c.buttons[9].doClick(); // 9 button
		c.buttons[14].doClick(); // sqrt button
		c.buttons[16].doClick();// plus button
		c.buttons[17].doClick(); // Equals button
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					-	6) < 1e-6
				);
		
		c.buttons[11].doClick(); // Multiplication button
		c.buttons[4].doClick(); // 4 button
		c.buttons[15].doClick();// minus button
		c.buttons[2].doClick(); // 2 button
		c.buttons[0].doClick(); // 0 button
		c.buttons[10].doClick(); // Division button
		c.buttons[7].doClick(); // 7 buttons
		c.buttons[14].doClick(); // sqrt button
		c.buttons[15].doClick();// minus button
		c.buttons[10].doClick(); // Division button
		c.buttons[4].doClick(); // 4 button
		c.buttons[15].doClick();// minus button
		c.buttons[8].doClick(); // 8 button
		c.buttons[17].doClick(); // Equals button
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					+	7.622035527 ) < 1e-6
				);
		
		c.buttons[26].doClick(); // Clear button
		c.buttons[3].doClick(); // 3 button
		c.buttons[16].doClick();// plus button
		c.buttons[6].doClick(); // 6 button
		c.buttons[17].doClick(); // Equals button.
		c.buttons[14].doClick(); // sqrt button
		c.buttons[17].doClick(); // Equals button.
		
		assertTrue(
				

				Math.abs(Double.parseDouble(c.txtField.getText()) 
					-	12) < 1e-6
				
				);
		
		c.buttons[17].doClick(); // Equals button.
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					-	15) < 1e-6
				
				);
		
		c.buttons[26].doClick(); // Clear button
		c.buttons[9].doClick(); // 9 button
		c.buttons[16].doClick();// plus button
		c.buttons[5].doClick();// 5 button
		c.buttons[16].doClick();// plus button
		c.buttons[1].doClick();// 1 button
		c.buttons[0].doClick();// 0 button
		c.buttons[16].doClick();// plus button
		c.buttons[6].doClick();// 6 button
		c.buttons[15].doClick();// minus button
		c.buttons[5].doClick();// 5 button
		c.buttons[17].doClick(); // Equals button.
		c.buttons[14].doClick(); // sqrt button
		c.buttons[17].doClick(); // Equals button.
		c.buttons[17].doClick(); // Equals button.
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					-	15) < 1e-6
				
				);
		
		c.buttons[26].doClick(); // Clear button
		c.buttons[4].doClick(); // 4 button
		c.buttons[0].doClick(); // 0 button
		c.buttons[16].doClick();// plus button
		c.buttons[9].doClick();// 9 button
		c.buttons[17].doClick(); // Equals button.
		c.buttons[14].doClick(); // sqrt button
		c.buttons[14].doClick(); // sqrt button
		c.buttons[17].doClick(); // Equals button.
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					-	51.64575131106459) < 1e-6
				
				);
		
		c.buttons[26].doClick(); // Clear button
		c.buttons[5].doClick();// 5 button
		c.buttons[0].doClick(); // 0 button
		c.buttons[15].doClick();// minus button
		c.buttons[1].doClick();// 1 button
		c.buttons[17].doClick(); // Equals button.
		c.buttons[14].doClick(); // sqrt button
		c.buttons[10].doClick(); // Division button
		c.buttons[5].doClick();// 5 button
		c.buttons[17].doClick(); // Equals button.
		

		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText()) 
					-	1.4 ) < 1e-6
				
				);
		

		frameTest.dispose();
	}

	
	@Test
	public void testInverse()
	{
		c.addGUIToFrame(frameTest);
		
		c.buttons[3].doClick();
		c.buttons[0].doClick();
		c.buttons[2].doClick();
		c.buttons[10].doClick(); // Division button
		c.buttons[5].doClick();
		c.buttons[0].doClick();
		c.buttons[12].doClick(); // Inverse
		c.buttons[16].doClick(); // plus button
		c.buttons[8].doClick(); // 8
		c.buttons[17].doClick(); // Equals button.
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText() )
						-  15108) < 1e-6
						
				);
		
		c.buttons[26].doClick(); // Clear button
		c.buttons[2].doClick();
		c.buttons[12].doClick(); // Inverse
		c.buttons[14].doClick(); // sqrt button
		c.buttons[12].doClick(); // Inverse
		c.buttons[16].doClick(); // plus button
		c.buttons[15].doClick();// minus button
		c.buttons[3].doClick();
		c.buttons[17].doClick(); // Equals button.
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText() )
						+  1.585786437626) < 1e-6
						
				);
		c.buttons[17].doClick(); // Equals button.
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText() )
						+  4.585786437626) < 1e-6
						
				);
		
		c.buttons[10].doClick(); // Division button
		c.buttons[9].doClick();  
		c.buttons[16].doClick(); // plus button
		c.buttons[2].doClick(); 
		c.buttons[1].doClick(); 
		c.buttons[17].doClick(); // Equals button.
		
		assertTrue(
				
				Math.abs(Double.parseDouble(c.txtField.getText() )
						-  20.49046817359) < 1e-6
						
				);
		frameTest.dispose();
		
	}
		
		@Test
		
		public void testPercent()
		{
			c.addGUIToFrame(frameTest);
			
			
			c.buttons[9].doClick();  
			c.buttons[16].doClick(); // plus button
			c.buttons[2].doClick(); 
			c.buttons[1].doClick(); 
			c.buttons[17].doClick(); // Equals button.
			c.buttons[13].doClick(); // Percent button
			
			assertTrue(
					
					Math.abs(Double.parseDouble(c.txtField.getText() )
							- 9) < 1e-6
							
					);
			c.buttons[13].doClick(); // Percent button
			
			assertTrue(
					
					Math.abs(Double.parseDouble(c.txtField.getText() )
							- 2.7) < 1e-6
							
					);
			c.buttons[17].doClick(); // Equals button.
			
			assertTrue(
					
					Math.abs(Double.parseDouble(c.txtField.getText() )
							- 32.7) < 1e-6
							
					);
			
			frameTest.dispose();
			
		}
		
		@Test 
		public void testSignChangeAndDot()
		{
			c.addGUIToFrame(frameTest);
			
			c.buttons[3].doClick();
			c.buttons[5].doClick();
			c.buttons[18].doClick();// . button
			c.buttons[2].doClick();
			c.buttons[3].doClick();
			c.buttons[6].doClick();
			c.buttons[10].doClick(); // Division button
			c.buttons[1].doClick(); 
			c.buttons[1].doClick();
			c.buttons[17].doClick(); // Equals button.
			
			assertTrue(
					
					Math.abs(Double.parseDouble(c.txtField.getText() )
							- 3.203272727272727) < 1e-6
						);
			
			c.buttons[12].doClick(); // Inverse
			c.buttons[14].doClick(); // sqrt button
			c.buttons[15].doClick();// minus button
			c.buttons[3].doClick();
			c.buttons[18].doClick();// . button
			c.buttons[17].doClick(); // Equals button.
			
			
			assertTrue(
					
					Math.abs(Double.parseDouble(c.txtField.getText() )
							+ 2.4412686475064) < 1e-6
						);
			
			c.buttons[26].doClick(); // Clear button
			
			c.buttons[7].doClick();
			c.buttons[2].doClick(); 
			c.buttons[18].doClick(); // . button
			c.buttons[4].doClick();
			c.buttons[4].doClick();
			c.buttons[11].doClick(); // Mult button
			c.buttons[9].doClick();
			c.buttons[1].doClick();
			c.buttons[18].doClick(); // . button
			c.buttons[3].doClick();
			c.buttons[15].doClick();// minus button
			c.buttons[2].doClick();
			c.buttons[3].doClick();
			c.buttons[18].doClick();// . button
			c.buttons[6].doClick();
			c.buttons[3].doClick();
			c.buttons[5].doClick();
			c.buttons[15].doClick();// minus button
			c.buttons[4].doClick();
			c.buttons[5].doClick();
			c.buttons[0].doClick();
			c.buttons[18].doClick();// . button
			c.buttons[3].doClick();
			c.buttons[19].doClick(); // +/- button
			c.buttons[10].doClick(); // Division button
			c.buttons[3].doClick();
			c.buttons[5].doClick();
			c.buttons[17].doClick(); // Equals button.
	
			assertTrue(		
					Math.abs(Double.parseDouble(c.txtField.getText() )
							- 201.15534285714) < 1e-6
						);
			
			
			
		}
		
	
	

}
