// program 8:
/*
	Develop a program (user defined method) to take 
	two integers as arguments and
	add and subtract those two values
	return both results to the calling method
	in calling method display both results
*/
class AddSub {
	static int[] addSub(int a, int b){
		//int add = a+b;
		//int sub = a-b;
		
//========== syntax 1 ==============
		//int[] ia = new int[2];
		//ia[0] = add;
		//ia[1] = sub;
		
		//return ia;
		
		
//========= syntax 2 ===============	
	//int[] ia = {add, sub};
	  
	//return ia;
//======== syntax 3 ================
		//return new int[]{add, sub};
		
	//======insted of writing all the above code we can simplify in one line
	
	return new int[]{a+b, a-b};
	}
	
}

class test08_AddSubWithArray {
	public static void main(String[] args){
		int[] res = AddSub.addSub(20,10);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}
}

