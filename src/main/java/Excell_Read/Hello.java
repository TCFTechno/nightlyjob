package Excell_Read;

public class Hello {

	public static void main(String[] args) {

		int arr[] = { 46, 3,4, 6, 8, 23, 9 };

		int first_least = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (first_least > arr[i]) {
				first_least = arr[i];
			}
		}

		System.out.println(first_least);
		int second_least = arr[0];		

		for (int i = 0; i < arr.length; i++) {

		
			
			
			
			if(arr[i]<second_least  && arr[i]!=first_least)
			{
				second_least=arr[i];
			}
		}
System.out.println(second_least);
	}
}
