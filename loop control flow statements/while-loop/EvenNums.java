// Program #02:
/*
	Develop a program to print only even number in the given range using while 
*/
import java.util.Scanner;
class EvenNums  {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int num = scn.nextInt();
		
		int i = 1;
		while(i<=num){
			if(i%2==0){
				System.out.println(i);
			}
			i++;
		}
	}
}
