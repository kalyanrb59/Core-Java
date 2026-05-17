// Program 17
/*
	Develop a program to crate an array object an store
	5 integer values and 5 flooting values by using {initilizer}
*/

class Test06_ArrayWithInitilizerSyntax2 {
	public static void main(String[] args) {
		int[] inta = {3,4,5,6,7};
		
		System.out.println("Hello World!");
	}
	
	static void displayIntArray(int[] ia){
		for(int i=0; i<ia.length; i++){
			System.out.println("inta["+i+"] : " + ia[i]); 
		}
	}
}
