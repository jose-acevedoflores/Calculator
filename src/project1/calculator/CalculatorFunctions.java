package project1.calculator;

public class CalculatorFunctions {
	
	private String firstInput;
	private String secondInput;
	private String operator;
	private String result;
	
	/**
	 * Computes the square root of the given number.
	 * @param num the number to find the square root of.
	 * @return the square root.
	 */
	public String sqrt(String num)
	{
		return Double.toString(Math.sqrt(Double.parseDouble(num)));
	}

}
