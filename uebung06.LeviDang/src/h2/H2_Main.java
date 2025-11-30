package h2;

public class H2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,2,3};
		int b [] = {1,2,4};
		int c [] = {1,3,2};
		int d [] = {1,2};
		int e [] = {1,2,3};
		
		System.out.println(compareArrays(a,e));
		System.out.println(compareArrays(a,b));
		System.out.println(compareArrays(b,a));
		System.out.println(compareArrays(e,a));
	}
		 public static boolean compareArrays (int []a, int []b) {
		
		if ( a.length != b.length ) {
			return false;
		}
		
		for (int i=0; i< a.length; i++) {
			if (a[i] != b[i] ) {
				return false;
			}	
		}
		return true;
	}
}




