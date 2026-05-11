import java.util.Scanner;
class StudentNameWhile {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
			
		int i = 1;
		while(i<=5){
			System.out.print("Enter student name " + i + ": ");
			String name = scn.nextLine();
			System.out.println("You have entered " + name);
			i++;
		}
		
	}
}
