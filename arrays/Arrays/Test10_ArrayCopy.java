// Develop a program to coyp one array values to another array

class  Test10_ArrayCopy {
	public static void main(String[] args) {
		//1. Original array
		int[] ia1 = {5,6,7,8,9};
		
		//2. New array object with original array size
		int[] ia2 = new int[ia1.length];
		
		//4. Copying from 1st array to 2nd array
		for(int i=0; i<ia1.length; i++){
			ia2[i] = ia1[i];
		}
		
		//5. Displaying arrays elements
		System.out.println("ia1 elements: ");
		display(ia1);
		System.out.println("ia2 elements: ");
		display(ia2);
	} // main close
	
	static void display(int[] ia){
		System.out.print("[");
		for(int i=0; i<ia.length; i++){
			System.out.print(ia[i]);
			if(i<ia.length-1){
				System.out.print(", ");
			}
		}
		System.out.println("]"); 
	}// display close
}
