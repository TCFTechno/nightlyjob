package Excell_Read;

import java.util.HashSet;
import java.util.Set;

public class Practise3 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 2, 3, 4, 5 };

		int arr1[] = { 3, 3, 6, 7, 8 };

	
		
	Set<Integer> uniqueelement=new HashSet<>();
	
	
	for(int num:arr1)
	{
		uniqueelement.add(num);
	}
	for(int num1:arr)
	{
		uniqueelement.add(num1);
	}

	
		
	System.out.println(uniqueelement);
	
	}
}
