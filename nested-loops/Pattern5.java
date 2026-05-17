class Pattern5 {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.readln("Enter n value: "));
		for(int i=1; i<=5; i++){
			for(int j=n; j>=1; j--){
				System.out.print(" "+ j + " ");
			}
			System.out.println();
		}
	}
}
