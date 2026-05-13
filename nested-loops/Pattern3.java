class  Pattern3 {
	public static void main(String[] args) {
		int n = Integer.parseInt(IO.readln("Enter value : "));
		for(int i=0; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
	}
}
