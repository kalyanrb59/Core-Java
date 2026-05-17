class Test05_ArraywithLoop{
	public static void main(String[] args) {
		int[] ia1 = new int[5];
		System.out.println("default values of array before passing values");
		displayArray(ia1);
		
		ia1[0] = 3;
		ia1[1] = 4;
		ia1[2] = 5;
		ia1[3] = 6;
		ia1[4] = 7;
		
		System.out.println();
		System.out.println("After passing the values");
		displayArray(ia1);
	}
	
	
	static void displayArray(int[] ia){
		for(int i=0;i<ia.length;i++){
			System.out.println(ia[i]);
		}
	}
}
