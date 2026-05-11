// Program #4: Find max of two given numbers
class MaxFinder {
	static int maxFinder(int a , int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}
class TestMaxFinder {
	public static void main(String[] args) 
	{
		int fn = Integer.parseInt(IO.readln("Enter first number: "));
		int sn = Integer.parseInt(IO.readln("Enter second number: "));
		int max = MaxFinder.maxFinder(fn,sn);
		
		System.out.println(max);
	}
}
