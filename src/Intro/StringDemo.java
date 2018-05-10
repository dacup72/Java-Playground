package Intro;

public class StringDemo {

	public static void main(String[] args) {
		String input = "this is a test string";
		StringBuilder inputBuilder = new StringBuilder(input);
		StringBuilder output = reverseString(input, inputBuilder);
		
		System.out.println(output);
	}
	
	public static StringBuilder reverseString(String input, StringBuilder inputBuilder) {
		 String[] stringArray = input.split("\\s+");
		 StringBuilder reversedString = new StringBuilder();
		 
		 if(input.length() <= 1) {
			 reversedString = inputBuilder;
		 } else {
			// Create reversed string
			 for(int i = (stringArray.length - 1); i >= 0; i--) {
				 reversedString.append(stringArray[i] + " ");
			 }
		}

		return reversedString;
	}

}
