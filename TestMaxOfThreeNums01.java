// Program #5: Max of three nums using relational operators and logical operators.

class MaxOfThreeNums {
	static void maxOfThreeNums(int a, int b, int c) {
		if(a>b && a>c) {
		System.out.println( a + " is greater htan " + b + " and " + c);
		} else if (b>a && b>c) {
		System.out.println( b + " is greater than "+ a + " and " + c);
		}else {
		System.out.println( c + " is greater than " + a + " and " + b);
		}
	}
}

class TestMaxOfThreeNums01 {
	public static void main(String[] args) {
		int fn = Integer.parseInt(IO.readln("Enter first number: "));
		int sn = Integer.parseInt(IO.readln("Enter second number: "));
		int tn = Integer.parseInt(IO.readln("Enter third number: "));
		MaxOfThreeNums.maxOfThreeNums(fn,sn,tn);
	}
}
