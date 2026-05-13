import java.util.Scanner;
class  StarsProgram{
	public static void main(String[] args) {
		System.out.println("Main method start");
		
		System.out.println("\nIn main before method call");
		m1();
		System.out.println("\nIn main after method call");
		System.out.println("Main method end");
	}//main method end.
	
	static void m1(){
		System.out.println("\nm1() started");
		System.out.println("\nBefore loop");
		for(int i=1;i<=5;i++){
			System.out.println("\nHi Kalyan "+ i);
			if(i==3){
				return;
			}
			System.out.println("Hello Chakravarthi " + i);
		}
		System.out.println("\nAfter loop");
		System.out.println("\nm1() is end");
	}//method end
}


/*
output for break:

---- Main method start

---- In main before method call

---- m1() started

---- Before loop

---- Hi Kalyan 1
---- Hello Chakravarthi 1

---- Hi Kalyan 2
---- Hello Chakravarthi 2

---- Hi Kalyan 3

---- After loop

---- m1() is end

---- In main after method call
---- Main method end
*/
//====================================================
/*
output for continue:

---- Main method start

---- In main before method call

---- m1() started

---- Before loop

---- Hi Kalyan 1
---- Hello Chakravarthi 1

---- Hi Kalyan 2
---- Hello Chakravarthi 2

---- Hi Kalyan 3

---- Hi Kalyan 4
---- Hello Chakravarthi 4

---- Hi Kalyan 5
---- Hello Chakravarthi 5

---- after loop

---- m1() is ended

---- In main after method call
---- Main method end

*/

//==========================================

/*
---- Main method start

---- In main before method call

---- m1() started

---- Before loop

---- Hi Kalyan 1
---- Hello Chakravarthi 1

---- Hi Kalyan 2
---- Hello Chakravarthi 2

---- Hi Kalyan 3

---- In main after method call
---- Main method end
*/

