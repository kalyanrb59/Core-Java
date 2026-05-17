/*
Redevelop the previous addSub class fro taking multiple integers as argument
add, sub and mul those sequence of values 
and return all three results
In main method read multiple integers from user as many values as he want to enter
Store all those values in an array, pass it to addSub() method
gather results and print results
*/

class  AO{
	static int[] ao (int[] ia){
		if(ia==null){
			return null;
		}if(ia.length==0){
			return ia;
		}if(ia.length==1){
			return new int[]{ia[0], ia[0], ia[0]};
		}
		// the below approach is wrong. we will get false results
		/* 
		int sum =0;
		int sub =0;
		int mul =0; 
		*/
		
		int sub, sum, mul;
		sum = sub = mul = ia[0];
		
		for(int i=1; i<ia.length; i++){
			sum = sum + ia[i];
			sub = sub - ia[i];
			mul = mul * ia[i];
		}
		
		return new int[]{sum, sub, mul};
	}
	
}

class Test09_AddSubMulWithArray{
	public static void main(String[] args) {
		int[] res;
		res = AO.ao(null);
		System.out.println(java.util.Arrays.toString(res));
		
		res = AO.ao(new int[]{});
		System.out.println(java.util.Arrays.toString(res));
		
		res = AO.ao(new int[]{3});
		System.out.println(java.util.Arrays.toString(res));
		
		res = AO.ao(new int[]{3, 4});
		System.out.println(java.util.Arrays.toString(res));
		
		res = AO.ao(new int[]{3, 4, 5 });
		System.out.println(java.util.Arrays.toString(res));
	}
}
