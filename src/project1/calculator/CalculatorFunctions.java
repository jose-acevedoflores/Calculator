package project1.calculator;

/**
 * @author 
 *
 */
public class CalculatorFunctions {

	private String firstInput="q";
	private boolean dotTyped = false;
	private String secondInput;
	private String operator="0";
	private String lastPressedButton="0";
	private boolean secondInputReady = false;
	private String lastResult="0";
	private String memory = "0";
	//Last result temporally  saves the result computed in the previous iteration. If the user clicks equals the firstInput is set to "q" (sentinel value)
	//

	/**
	 * Computes the square root of the given number.
	 * @param num the number to find the square root of.
	 * @return the square root.
	 */
	public String sqrt(String num)
	{ 
		secondInputReady = true;
		return Double.toString(Math.sqrt(Double.parseDouble(num)));
	}

	/**
	 * Computes the inverse of the given number.
	 * @param num the number to find the inverse of.
	 * @return the inverse.
	 */
	public String inverse(String num)
	{
		secondInputReady = true;
		return Double.toString(1 / (Double.parseDouble(num)));
	}
	
	/**
	 * Multiplies by minus one.
	 * @param num the number to be multiplied by minus one.
	 * @return the number multiplied by one.
	 */
	public String signChange(String num)
	{
		if(!num.equals("0"))
		{
			String eliminateZero = Double.toString(Double.parseDouble(num));
			if(eliminateZero.charAt(eliminateZero.length() - 1 ) == '0' && eliminateZero.charAt(eliminateZero.length() - 2 ) =='.')
			{
				eliminateZero = Double.toString(Double.parseDouble(eliminateZero) * (-1));
				eliminateZero = eliminateZero.substring(0, eliminateZero.length() - 2);
			}
			else
			{
				eliminateZero = Double.toString(Double.parseDouble(eliminateZero) * (-1));
			}
			return eliminateZero;
		}
		else
			return "0";
	}

	/**
	 * Gets the last button the user pressed.
	 * @return the last button the user pressed.
	 */
	public String getLastPressedButton()
	{
		return lastPressedButton;
	}

	/**
	 * Saves the last button the user pressed.
	 * @param lastPressedButton the last button the user pressed.
	 */
	public void setLastPressedButton(String lastPressedButton)
	{
		this.lastPressedButton = lastPressedButton;
	}

	/**
	 * Performs the sum of the number in the display and the number in memory(firstInput is the number in memory).
	 * @param currentCalculatorNumber
	 */
	public String sumPressed(String currentNumberInDisplay)
	{
		if(!firstInput.equals("q") && secondInputReady == true )
		{
			secondInput = currentNumberInDisplay;
			firstInput = this.compute(firstInput,secondInput);
		}
		else
			firstInput = currentNumberInDisplay;
		
		operator = "+";
		secondInputReady = false;
		dotTyped = false;
		return firstInput;
	}
	
	/**
	 *Performs the subtraction of the number in the display and the number in memory (firstInput is the number on memory).
	 *@param currentNumberInDisplay
	 *@return firstInput
	 */
	public String minusPressed(String currentNumberInDisplay)
	{
		if(!firstInput.equals("q") && secondInputReady == true )
		{
			secondInput = currentNumberInDisplay;
			firstInput = this.compute(firstInput,secondInput);
		}
		else
			firstInput = currentNumberInDisplay;
		
		operator = "-";
		dotTyped = false;
		secondInputReady = false;
		return firstInput;
	
	}
	
	/**
	 * Performs the multiplication of the number in the display and the number in memory (firstInput is the number on memory).
	 * @param currentNumberInDisplay
	 * @return firstInput
	 */
	public String multPressed(String currentNumberInDisplay )
	{
		if(!firstInput.equals("q") && secondInputReady == true )
		{
			secondInput = currentNumberInDisplay;
			firstInput = this.compute(firstInput,secondInput);
		}
		else
			firstInput = currentNumberInDisplay;
		
		operator = "*";
		secondInputReady = false;
		dotTyped = false;
		return firstInput;
	}
	
	/**
	 * Performs the division of the number in the display and the number in memory (firstInput is the number on memory).
	 * @param currentNumberInDisplay
	 * @return firstInput
	 */
	public String divPressed(String currentNumberInDisplay )
	{
		if(!firstInput.equals("q") && secondInputReady == true )//&& !lastPressedButton.equals("sqrt"))
		{
			secondInput = currentNumberInDisplay;
			firstInput = this.compute(firstInput,secondInput);
		}
		else
			firstInput = currentNumberInDisplay;
		
		operator = "/";
		secondInputReady = false;
		dotTyped = false;
		return firstInput;
	}
	
	/**
	 * 
	 * @return
	 */
	public String dotPressed(String currentNumberInDisplay)
	{
		if(lastPressedButton.equals("=") 
				|| lastPressedButton.equals("+") 
				|| lastPressedButton.equals("-")
				|| lastPressedButton.equals("/")
				|| lastPressedButton.equals("*"))
		{
			dotTyped = true;
			return "0.";
		}
		else if(dotTyped)
			return currentNumberInDisplay;
		else
		{	
			dotTyped = true;
			return currentNumberInDisplay + ".";
		}
	}
	/**	
	 * Computes the percentage of the given number.
	 * @param num percentage number.
	 * @return
	 */
	public String percent(String num)
	{
		String result = "";
		
		if (operator.equals("0"))
			result = "0";
		
		else if(!firstInput.equals("q"))
			result = Double.toString((Double.parseDouble(num) / 100) * Double.parseDouble(firstInput));
		
		else if (firstInput.equals("q"))
			result = Double.toString((Double.parseDouble(num) / 100) * Double.parseDouble(lastResult));
		
		return result;
	}

	/**
	 * 
	 * @param fTerm
	 * @param sTerm
	 * @return
	 */
	public String compute(String fTerm, String sTerm)
	{
		double result=0;
		
		if(lastPressedButton.equals("="))
		{
			fTerm = lastResult;
		}
		
		if(operator.equals("+"))
		{
			result = Double.parseDouble(fTerm) + Double.parseDouble(sTerm);
		}
		else if(operator.equals("-"))
		{
			result = Double.parseDouble(fTerm) - Double.parseDouble(sTerm);
		}
		else if(operator.equals("*"))
		{
			result = Double.parseDouble(fTerm) * Double.parseDouble(sTerm);
		}
		else if(operator.equals("/"))
		{
			result = Double.parseDouble(fTerm) / Double.parseDouble(sTerm);
		}
		
		
		firstInput = String.valueOf(result);
	
		return String.valueOf(result);
	}
	
	/**
	 * @param numToAdd
	 */
	public void memoryPlus(String numToAdd)
	{
		memory = Double.toString(Double.parseDouble(memory) + Double.parseDouble(numToAdd));
	}
	
	/**
	 * @return
	 */
	public String getLastResult()
	{
		return lastResult;
	}
	
	/**
	 * @param last
	 */
	public void setLastResult(String last)
	{
		lastResult = last;
	}
	
	/**
	 *
	 * @return
	 */
	public String getFirstInput()
	{
		return firstInput;
	}
	
	/**
	 * @return
	 */
	public String getNumInMemory()
	{
		return memory;
	}
	
	/**
	 * Method to reset the first input  field
	 */
	public void setFirstInput(String value)
	{
		firstInput = value;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSecondInput()
	{
		return secondInput;
	}
	
	/**
	 * Reseting the second input.
	 */
	public void setSecondInput(String value)
	{
		secondInput = value;
	}

	/**
	 * 
	 * @return
	 */
	public String getOperator()
	{
		return operator;
	}
	
	/**
	 * Reseting the operator.
	 */
	public void setOperator(String op)
	{
		operator = op;
	}
	

	/**
	 * @param numToMemory
	 */
	public void setMemoryState(String numToMemory)
	{
		memory = numToMemory;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isReadyForSecondInput()
	{
		return secondInputReady;
	}
	
	/**
	 * 
	 * @param t
	 */
	public void setReadyForSecondInput(boolean t)
	{
		secondInputReady = t;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isDotTyped()
	{
		return dotTyped;
	}
	
	/**
	 * 
	 * @param t
	 */
	public void setDotTyped(boolean t)
	{
		dotTyped = t;
	}
	
	
}
