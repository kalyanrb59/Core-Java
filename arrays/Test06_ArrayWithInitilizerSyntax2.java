// Program 17
/*
	Develop a program to crate an array object an store
	5 integer values and 5 flooting values by using {initilizer}
*/

class Test06_ArrayWithInitilizerSyntax2 {
	public static void main(String[] args) {
		int[] inta = {3,4,5,6,7};
		
		double[] doublea = {1.1, 2.2, 3.3, 4.4, 5.5};
		
		displayIntArray(inta);
		System.out.println();
		displayDoubleArray(doublea);
		
	}
	
	static void displayIntArray(int[] ia){
		System.out.println("Reading int[] values from user defined method displayIntArray()");
		
		for(int i=0; i<ia.length; i++){
			System.out.println("inta["+i+"] : " + ia[i]); 
		}
		System.out.println("The length of the int[] inta: " + ia.length);
	}
	
	static void displayDoubleArray(double[] da){
		System.out.println("Reading double[] values from user defined method displayDoubleArray()");
		for(int i=0; i<da.length; i++){
			System.out.println("inta["+i+"] : " + da[i]); 
		}
		System.out.println("The length of the double[] doublea: " + da.length);
	}
}
