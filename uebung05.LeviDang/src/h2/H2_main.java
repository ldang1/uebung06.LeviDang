package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 299;
        int digits = 0;

        int[] a = new int[9];

        int temp = n;

        if (temp == 0) {
            digits = 1;
            a[8] = 0;
        } else {
            int index = 8;

            while (temp > 0) {
                int ziffer = temp % 10;
                a[index] = ziffer;
                index--;
                digits++;
                temp = temp / 10;
            }
        }

        System.out.println("Zahl n: " + n);
        System.out.println("Anzahl der Ziffern: " + digits);

        System.out.print("Array a: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

		
		
		
		
				
	}

}
