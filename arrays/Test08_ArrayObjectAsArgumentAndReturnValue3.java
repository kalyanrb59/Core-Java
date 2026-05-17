// program 8:
/*
	Passing and returning array object as argument and 
	return value without variable name.
	
	Many times in the project 
	1. we must pass array object as an argument to a method
	2. we must return array object as result from a method.
	
 - In this case if we want to directly pass and return array object 
   directly without variable creation we must use 3rd syntax for array creation.
   This is called anonymous array creation
   
 - With this syntax 
	we can creat array object, store values or initilize values in array object
	we can pass or return array object in a single line.
	
 - Below program shows working with array with 3rd syntax	
*/

class Test08_ArrayObjectAsArgumentAndReturnValue3 {
	public static void main(String[] args) {
		m1(new int[]{100,200,300,400,500});
	}
	
	static void m1(int[] ia){
		for(int i=0; i<ia.length; i++){
			System.out.print(ia[i] + "\t");
		}
		System.out.println();
	}
}
