package project1.calculator;

public class CalculatorFunctions {
	
	private String firstInput="0";
	private String secondInput;
	private String operator;
	private String result;
	private String lastPressedButton;
	
	/**
	 * Computes the square root of the given number.
	 * @param num the number to find the square root of.
	 * @return the square root.
	 */
	public String sqrt(String num)
	{
		return Double.toString(Math.sqrt(Double.parseDouble(num)));
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
	 * Performs the sum of the number in the display and the number in memory(firstInput is the number in memory)
	 * @param currentCalculatorNumber
	 */
	public void sumPressed(String currentNumberInDisplay)
	{
		operator = "+";
		double currentInput = Double.parseDouble(currentNumberInDisplay);	
		double resultDouble = Double.parseDouble(firstInput) + currentInput;
		result = String.valueOf(resultDouble);
		firstInput = result;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getResult(String currentNumberInDisplay)
	{
	
		if(operator.equals("+") && !lastPressedButton.equals("="))
		{
			secondInput = currentNumberInDisplay;
			this.sumPressed(secondInput);
		}
		else if(operator.equals("+") && lastPressedButton.equals("=")) 
		{
			result = String.valueOf(Double.parseDouble(result) + Double.parseDouble(secondInput));
			firstInput = "0";
		}
			
		
		return result;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getFirstInput()
	{
		return firstInput;
	}

}
