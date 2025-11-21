package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int[] myArray = {5, 6, 7, 10,11};

		        
		        System.out.println("Vor dem Umdrehen:");
		        for (int i = 0; i < myArray.length; i++) {
		            System.out.print(myArray[i] + " ");
		        }
		        System.out.println(); 

		       
		        int i = 0;
		        int j = myArray.length - 1;

		       
		        while (i < j) {
		            int temp = myArray[i];    
		            myArray[i] = myArray[j];  
		            myArray[j] = temp;        

		            i++;  
		            j--;  
		        }

		        
		        System.out.println("Nach dem Umdrehen:");
		        for (int k = 0; k < myArray.length; k++) {
		            System.out.print(myArray[k] + " ");
		        }
		        System.out.println();
		    }
}

