// Program #5: Find the max of three numbers using non-void method call.

class MaxOfThreeNums {
	static int maxOfThreeNums(int a, int b, int c) {
		if(a>b && a > c){
			return a;
		}else if(b>a && b>c){
			return b;
		}else{
			return c;
		}	
	}
}

class TestMaxOfThreeNums02 {
	public static void main(String[] args) {
		int fn = Integer.parseInt(IO.readln("Enter first number: "));
		int sn = Integer.parseInt(IO.readln("Enter second number: "));
		int tn = Integer.parseInt(IO.readln("Enter third number: "));
		
		int max = MaxOfThreeNums.maxOfThreeNums(fn,sn,tn);
		System.out.println(max + " is the greatest number among " + fn + " " + sn + " and " + tn);
	}
}
