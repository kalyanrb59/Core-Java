class Test07_ArrayObjectAsArgumentAndReturnValue3 {
	public static void main(String[] args) {
		//m1(); ---->m1(no argument) --------- CE: Argument not matched
		//m1(5);---->m1(int)----- CE: int can not bt converted into int[]
		
		int[] ia1 = new int[5]; // This is array obj with default values
		m1(ia1);  // m1(int[] arg)------> no CE, no RE pass it as an argument.
		
	// The problem 1 here is too many lines of code and memory wast	
		int[] ia2 = new int[5];
		ia2[0] = 3;
		ia2[1] = 4;
		ia2[2] = 5;
		ia2[3] = 6;
		ia2[4] = 7;
		
		m1(ia2);
		
	// The problem 2 here is lines of code is one line only but, memory is wasting:		
		int[] ia3 = {11,22,33,44,55,};
		m1(ia3);
		
	// 3. Anonymous int array object syntax (array object without name)
		
		m1(new int[5]); // array object with default values.
	// How can we pass values in to the anonymous array object	
		m1(new int[]{10,20,30,40,50});
	// In the above line we have created array object withou name.
	// That means it is anonymous array object.
	}
	
	static void m1(int[] ia){
		System.out.println("You passed array with length: "+ ia.length);
		for(int i=0; i<ia.length; i++){
			System.out.print(ia[i] + " ");
		}
		System.out.println();
	}
}

/*
	Problem 2:
	My target is to pass the values to the method and after method execution 
	I want to destroy the object, And I don't want to use tha object again.
	So do not create array object with variable, Because in the above example,
	even after the execution of the method the object is still in the memory.
	
	So, Now I want to values without variable. Both
	1. int[] ia = new int[]; 
			and
	2. int[] ia = {initilizer};
	are not useful to achive my requirement
	we should use 
	3. int[] ia = int[]{initilizer} -----> anonymous array object (without name)
	
*/
