class Pattern2 {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.readln("Enter value : "));
		for(int i=1; i<=n; i++){
			for(int j = 1; j<=n; j++){
				System.out.print(" "+ i + "\t");
			}
			System.out.println();
		}
		
	}
}
