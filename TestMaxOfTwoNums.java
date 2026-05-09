// program #4:
/*
	Develop a program to find the max of two given numbers
*/
class MaxOfTwoNums {
	static void maxOfTwoNums(int a, int b) {
		if(a>b){
			System.out.println(a + " is greater than " + b);
		}else{
			System.out.println(b + " is greater than " + a);
		}
	}
}
class TestMaxOfTwoNums  {
	public static void main(String[] args) {
		int fn = Integer.parseInt(IO.readln("Enter first number: "));
		int sn = Integer.parseInt(IO.readln("Enter second number number: "));
		MaxOfTwoNums.maxOfTwoNums(fn,sn);
	}
}
