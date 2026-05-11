// program #3:
/*
	Develop a program to take an an integer and
	find the given integer is even or odd
*/
class EvenOrOdd {
	static void evenOrOdd(int num){
		if (num%2==0){
			System.out.println(num + " is an even number.");
		}else {
			System.out.println(num + " is an odd number.");
		}
	}
}

class TestEvenOrOdd 
{
	public static void main(String[] args) 
	{
		EvenOrOdd.evenOrOdd(Integer.parseInt(IO.readln("Enter a number value: ")));
	}
}
