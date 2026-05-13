import java.util.Scanner;
class  EnterStudentsNames{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		//int i = 1;
		String option = "N";
		do{
			System.out.print("\nEnter student name : ");
		    String name = scn.nextLine();
			
		    System.out.println("You entered " + name);
		
		    System.out.print("\nDo you want to continue(Y/N)?: ");
		    option = scn.nextLine();
		//i++;
		} while(option.equalsIgnoreCase("Y"));//while(i<=5);
	}
}
