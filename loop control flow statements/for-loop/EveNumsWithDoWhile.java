import java.util.Scanner;
class  EveNumsWithDoWhile{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter value: ");
		int num = scn.nextInt();
		
		int i = 1;
		do{
			if(i%2==0){
				System.out.print(i + " ");
			}
			i++;
		}while(i<=num);
	}
}
