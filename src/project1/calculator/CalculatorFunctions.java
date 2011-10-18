package project1.calculator;

public class CalculatorFunctions {

	private String firstInput="0";
	private String secondInput;
	private String operator;
	private String result;
	private String lastPressedButton="0";

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
	 * Computes the inverse of the given number.
	 * @param num the number to find the inverse of.
	 * @return the inverse.
	 */
	public String inverse(String num)
	{
		return Double.toString(1 / (Double.parseDouble(num)));
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
	 *Computes the result of the number in memory and the number in the current number in the display.
	 *The operator used will be the last one that was pressed.
	 * @return 
	 */
	public String getResult(String currentNumberInDisplay)
	{


		if(operator.equals("+") && lastPressedButton.equals("="))
		{
			secondInput = currentNumberInDisplay;
			result = String.valueOf(Double.parseDouble(result) + Double.parseDouble(secondInput));
			System.out.println("orly");
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
	
	/**
	 * 
	 * @return
	 */
	public String getSecondInput()
	{
		return secondInput;
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
	 *Subtraction Prototype
	 */
	/*public String subtraction(){
		double subtraction = Double.parseDouble(firstInput) - Double.parseDouble(secondInput);

		return Double.toString(subtraction);
	}*/

	/**
	 * Multiplication Prototype
	 */
	/*public String multiplication(){
		double multiplication = Double.parseDouble(firstInput) * Double.parseDouble(secondInput);

		return Double.toString(multiplication);
	}*/

}
