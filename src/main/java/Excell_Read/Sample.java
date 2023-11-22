package Excell_Read;

import java.util.ArrayList;

public class Sample {
	

	public static void main(String[] args) throws Throwable {

		//output= hollo werld
		
		String name="hello world";
	
		String vowels="";
		for (int i = 0; i < name.length(); i++) {
			
			
			char c=name.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				
				vowels+=name.charAt(i);
			}
			
		}
		System.out.println(vowels);
	}
}
