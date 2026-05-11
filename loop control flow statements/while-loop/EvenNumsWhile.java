// Program #02:
/*
	Develop a program to print only even number in the given range using while 
*/
import java.util.Scanner;
class EvenNumsWhile {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Value: ");
		int num = scn.nextInt();
		
		int i = 2;
		while(i<=num){
			System.out.println(i);
			i=i+2;
		}
	}
}
