package github.aq.stringcalculator;

public class Calculator {

	final String delimiterComma = ",";
	
	public int add(String numbers) {
		if ("".equals(numbers) || ",".equals(numbers)) {
			return 0;
		} 
		
		int result = 0;
		String[] numberStringArray = splitNumbers(numbers);	
		for (String numberString: numberStringArray) {
			result += Integer.parseInt(numberString);
		}
		return result;
	}

	private String[] splitNumbers(String numbers) {
		String[] numberStringArray = numbers.split(delimiterComma+"|\n");
		return numberStringArray;
	}
}
