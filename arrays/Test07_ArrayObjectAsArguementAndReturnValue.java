class Test07_ArrayObjectAsArguementAndReturnValue {
	public static void main(String[] args) {
		// m1()   ---------> CE: arguments are not matched
		// m1(5)  ---------> CE: int can not be converted into int[]
		int[] ia1 = new int[5];
		System.out.println("ia1 default values");
		m1(ia1);
		System.out.println();
		System.out.println("ia2 passed values");
		int[] ia2 = new int[5];
		ia2[0] = 3;
		ia2[1] = 4;
		ia2[2] = 5;
		ia2[3] = 6;
		ia2[4] = 7;
		m1(ia2);
		
		int[] ia3 = {11,23,43,54,67};
		System.out.println();
		System.out.println("Accessing array values using initilizer");
		m1(ia3);
		
		
		m1(new int[]{22, 33, 44, 55, 66});
		
	}
	
	static void m1(int[] ia){
		for(int i=0;i<ia.length;i++){
			System.out.println(ia[i] + " "); 
		}
	}
}
