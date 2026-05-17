// Program 06:
/*
	Develop a program to store
	5 integers and 5 floating numbers by using array object and initilizer syntax
	Read and print those values by usig for() loop
*/

class Test06_ArraywithInitilizerSyntax {
	public static void main(String[] args) {
		
		int[] ia1 = {3,4,5,6,7};
		double[] da1 = {5.5, 6.2, 7.3, 8.9, 6.7};
		System.out.println("Int array values : ");
		displayArray(ia1);
		System.out.println();
		System.out.println("double array values : ");
		displayArray1(da1);
	}
	
	static void displayArray (int[] ia) {
		for(int i=0;i<ia.length;i++){
			System.out.println("ia[" +i + "] : "+ ia[i]);
		}
	}
	
	static void displayArray1 (double[] da) {
		for(int i=0;i<da.length;i++){
			System.out.println("da[" +i +"] : "+ da[i]);
		}
	}
}