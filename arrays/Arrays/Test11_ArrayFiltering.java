/*
Develop a program to take array object as an argument
seperate even numbers and return all those even numbers from method
in main method display all those even numbers
*/
class ArrayFilter {
	static int[] filterEven(int[] ia){
		int[] tempArray = new int[ia.length];
		int tempIndex = 0;
		
		for(int i=0; i<ia.length; i++){
			int element = ia[i];
			
			if(element%2==0){
				tempArray[tempIndex] = element;
				tempIndex++;
			}
		}
		int[] evenArray = new int[tempIndex];
		for(int i=0; i<tempIndex; i++){
			evenArray[i] = tempArray[i];
		}
		return evenArray;
	}
}


class  Test11_ArrayFiltering {
	public static void main(String[] args) {
		
		//1. Original array
		int[] ia1 = {3, 2, 7, 14, 9, 10, 16, 15, 23};
		
		//2. Filtering array
		int[] ia2 = ArrayFilter.filterEven(ia1);
		
		//3. Display array values
		display(ia1);
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
