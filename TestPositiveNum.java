// Program #1
/*
	Develop a program to take an integer as an argument, 
	if it is +ve number double that number return the result
	if it is -ve number return the same number
*/
class  PositiveNum{
	static int pnum(int num){
		if(num>0){
			return num*2;
		}
		return num/2;
	}
	
}

class TestPositiveNum{
	public static void main(String[] args){
		
		int res = PositiveNum.pnum(Integer.parseInt(IO.readln("enter the value: ")));
			System.out.println(res);
	}
}
