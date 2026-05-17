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
   
 - With anonymous array object syntax 
	we can creat array object, store values or initilize values in array object
	and pass or return array object in a single line.
	
 - Below program shows working with array with 3rd syntax	
*/

class Test08_ArrayObjectAsArgumentAndReturnValue3 {
	public static void main(String[] args) {
		//=====================================================
		m1(new int[]{100,200,300,400,500});
		
		System.out.println();
		//=====================================================
			// when we return valu from the method we should assign the return value into a variabl
		int[] ia1 = m2();
		m1(ia1);
		
		System.out.println();
		//======================================================
			// when we return valu from the method we should assign the return value into a variabl
		int[] ia2 = m4();
		for(int i=0; i<ia2.length; i++){
			System.out.print(ia2[i] + "\t");
		}
		System.out.println();
		
		
		//m1(ia2); // we can use directly for loop or m1(ia2); or m1(m4());
		//=======================================================
	}
	
	static void m1(int[] ia){
		System.out.println("length of th array: " + ia.length);
		for(int i=0; i<ia.length; i++){
			System.out.print(ia[i] + "\t");
		}
		System.out.println();
	}
	//return array object
		// when we return valu from the method we should assign the return value into a variabl
	static int[] m2(){
		System.out.println("Array object is returned from m2() method");
		return new int[5];
	}
	
	/*
	static int[] m3(){
		System.out.println("Array object is returned from m3() method");
		return {11,22,33,44,55};
	}
	*/
	
	static int[] m4(){
		System.out.println("Array object is returned from m4() method");
		return new int[]{10,20,30,40,50};
	}
}
