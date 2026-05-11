// Program #2:
/*
	Develop a program to take an integer number as an argument.
	If the given number is +ve double the number and return
	if the given number is -ve half the number and return
*/

class DoublePositiveAndHalfNegetive {
	static int doubleOrHalf(int num){
		if (num >0) {
			return num*2;
		}else{
			return num/2;
		}
	}
}

class TestDoublePositiveAndHalfNegetive {
	public static void main(String[] args) 
	{
		int res = DoublePositiveAndHalfNegetive.doubleOrHalf(Integer.parseInt(IO.readln("Enter a positive or negetive number : ")));
		System.out.println(res);
	}
}
