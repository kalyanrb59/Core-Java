// Program #03:
/*
	Develop a program to print only odd number in the given range using while 
*/
import java.util.Scanner;
class  OddNumsForLoop {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter a value: ");
		int num = scn.nextInt();
		
		for(int i=1;i<=num;i++){
			if(i%2!=0){
				System.out.print(i + " ");
			}
		}
	}
}
