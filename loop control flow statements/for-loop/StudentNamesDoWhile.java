import java.util.Scanner;
class StudentNamesDoWhile {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		
		int i =1;
		do{
			System.out.print("Enter Student Name " + i + ": ");
			String name = scn.nextLine();
			System.out.println(name);
			i++;
		}while(i<=5);
	}
}
