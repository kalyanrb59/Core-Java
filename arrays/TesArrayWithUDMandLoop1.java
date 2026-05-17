//Read a progrem to print array values by using for loop and user defined method

class TesArrayWithUDMandLoop1{
	public static void main(String[] args){
		int[] ia1 = new int[5];
		// ia1 = address of int[5] memory
		System.out.println("Default values");
		displayArray(ia1);
		
		//initilizing values
		ia1[0] = 3;
		ia1[1] = 4;
		ia1[2] = 5;
		ia1[3] = 6;
		ia1[4] = 7;
		System.out.println();
	
		System.out.println("After initilization values");
		displayArray(ia1);
	}
	
	static void displayArray(int[] ia){
		System.out.println("Array values are printing from method");
		for(int i=0;i<ia.length;i++){
			System.out.println("ia[" + i + "] : " + ia[i]);
		}
	}
}

/* 

In the above program we have learnt how to use array.
	1. Storing multiple values as one group by using single variable name, "int[] ia1".
	2. passing multiple values as one group or passing array object as argument to 
	   a method using single perameter, "int[] ia".
	3. printing all values of an array dynamically by using for-loop with the 
	   condition "i<ia.length"
	4. Most important point we learnt in this program is 
		-	When we pass an object as an argument to a mthod
			- The object memory is not passed
			- The object reference copy is passed.
		-	It means both
			- the original variable "ia1" from the main method 
			- the perameter "ia" from the called method 
			are pointing the same object
		-	So, if we modify the object data by using one of the variables 
			this modification is available to other variable also.
		-	This is the reason, when we calld displayArray() method 2nd time, 
			it printed the modified values "3,4,5,6,7". Actually we modified
			the values in the main method but available even userdefined method 
			displayArray() also.
			
	Still, there is one proble in the above program:
	-------------------------------------------------
	
	- Code is too lenthy for
		1. Creating array
		2. initilizing or storing values in the array object.
	- we have written multiple lines for creating array object and 
	  storing values in thearray object.
			int[] ia1 = new int[5];
				ia1[0] = 3;
				ia1[1] = 4;
				ia1[2] = 5;
				ia1[3] = 6;
				ia1[4] = 7;

	Solution for this ( How to minimize the code):
	------------------------------------------------
	- By using {initilizer} we can create an array object 
	  and initilize or store values in a single line. 
	  
	- Syntax: int[] variableName = {val1, val2, val3, val4, val5};
	- Example:  int[] ia1 = {3, 4, 5, 6, 7};
	
	- We can use this syntax only when we know the valuse of the array object
	  before creation.
	 

*/