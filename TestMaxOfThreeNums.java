// program #5: Find max of three numbers

class MaxOfThreeNums {
	static void maxOfThreeNums(int a, int b, int c){
		if(a>b){
			if(a>c){
				System.out.println( a + " is greater than " + b + " and " + c);
			}
		}else if (b>a){
			if(b>c){
				System.out.println( b + " is greater than " + a + " and " + c);
			}
		}else{
				System.out.println( c + " is greater than " + a + " and " + b);
			}
	}
}

class TestMaxOfThreeNums {
	public static void main(String[] args) {
		int fn = Integer.parseInt(IO.readln("Enter first number: "));
		int sn = Integer.parseInt(IO.readln("Enter second number: "));
		int tn = Integer.parseInt(IO.readln("Enter third number: "));
		MaxOfThreeNums.maxOfThreeNums(fn,sn,tn);
		
	}
}
