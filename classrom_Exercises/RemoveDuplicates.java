package week3.day6.classrom;


import java.util.LinkedHashSet;

public class RemoveDuplicates {
/*
 * 
 * // Input: "PayPal India"
   // Output:PaylIndi
 
 * //		Declare a String as PayPal India

//		Convert it into a character array

//		Declare a Set as charSet for Character

//		Iterate character array and add it into charSet

//              Check whether the character is space, if not add to charSet 

//		Iterate using charSet

//		print each character for charSet
 * 
 */
	public static void main(String[] args) {

		String Input = "PayPal India"  ;
		Input = Input.replaceAll("\\s", "");
		char[] arr =Input.toCharArray();
		
		System.out.println("Displayed without Duplicate Words");
		
		
		LinkedHashSet<Character> set1 = new LinkedHashSet<>();
		for(int i=0;i<Input.length();i++)   
            set1.add(arr[i]); 
            
        // print the string after removing duplicate characters   
        for(Character ch : set1)   
        	
            System.out.print(ch);   
			
		
		
	}

}
