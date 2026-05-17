//Program04

/*
Develop a program to store 5 integers 3,4,5,6,7 in an array object, read and print those valueson console
*/

class Test04_ArrayStoringReading{
	public static void main(String[] args) {
		
		int[] ia1 = new int[5];
		
		// reading default values
		System.out.println("Default values");
		for(int i=0; i<ia1.length; i++){
			System.out.println(ia1[i]);
		}
		System.out.println();
		
		// passing new values 
		
		 ia1[0] = 3;
		 ia1[1] = 4;
	     ia1[2] = 5;
		 ia1[3] = 6;
		 ia1[4] = 7;
		 
		 // returning the updated array values
		
		System.out.println("printing updated array values");
		for(int i=0; i<ia1.length; i++){
			System.out.println(ia1[i]);
		}
	}
		
}
