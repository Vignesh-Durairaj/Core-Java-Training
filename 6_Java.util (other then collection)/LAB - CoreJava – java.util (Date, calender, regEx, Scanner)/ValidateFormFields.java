package cg.javaflp.practice;

public class ValidateFormFields {
	
	/**
	 * This method is use to validate a text field input data
	 * @param text - input value to be validated as text 
	 * @return - true (if data is valid text)
	 */
	public static boolean isValidText(String text){
		
		boolean response = true;
		for (int i = 0; i < text.length(); i++){
			boolean isValidChar =  Character.isLetter(text.charAt(i));
			if (!isValidChar){
				response = false;
			}
		}
		return response;
	}
	
	/**
	 * This method is use to validate a numeric field input data
	 * @param text - input value to be validated as number 
	 * @return - true (if data is valid number)
	 */
	public static boolean isValidNumber(String text){

		boolean response = true;
		for (int i = 0; i < text.length(); i++){
			boolean isValidChar =  Character.isDigit(text.charAt(i));
			if (!isValidChar){
				response = false;
			}
		}
		return response;
	}
}
