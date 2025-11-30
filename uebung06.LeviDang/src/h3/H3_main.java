package h3;

public class H3_main {
	
	public static void main(String [] args) {
		int a [] = {1,2,3};
		int b [] = {1,2,4};
		int c [] = {1,3,2};
		
		System.out.println(compareArraysVal(a,b));
		System.out.println(compareArraysVal(b,c));
		System.out.println(compareArraysVal(a,c));
		
		
		
		
	}
	
	public static boolean compareArraysVal (int a[], int b[]) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
	        int value = a[i];

	        int countA = 0;
	        int countB = 0;

	        for (int x : a) {
	            if (x == value) countA++;
	        }

	        for (int y : b) {
	            if (y == value) countB++;
	        }

	        if (countA != countB) {
	            return false;
	        }
	    }

	    return true;
	}
}
