// Program
/*
Develop a program to read and print 5 students name from keybord using 3 loops
*/
import java.util.Scanner;
class  StudentNames{
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		for(int i=1;i<=5;i++){
			System.out.print(" Enter student name " + i+ ": " );
			String sname = scn.nextLine();
			System.out.println("You entered " + sname); 
		}
		
	}
}
