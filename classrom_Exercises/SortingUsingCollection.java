package week3.day6.classrom;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	/*
//Declare a String array and add the Strings values as (HCL, Wipro,  Aspire Systems, CTS)		

//		get the length of the array		

//		sort the array			

//		Iterate it in the reverse order

//		print the array
		
//		Required Output: Wipro, HCL , CTS, Aspire Systems
	 
	 */
	
	public static void main(String[] args) {

		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> list=Arrays.asList(input);
		Collections.sort(list);
		System.out.println();
		Collections.reverse(list);
			System.out.println(list);
		
	}

	}

