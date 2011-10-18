package project1.calculator;

public class CalculatorFunctions {
	
	private String firstInput;
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
	
	
	public void setLastPressedButton(String lastPressedButton)
	{
		this.lastPressedButton = lastPressedButton;
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
