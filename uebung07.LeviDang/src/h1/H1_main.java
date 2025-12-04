package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Zahl z = new Zahl() ;
		 z.num = -7;
		 
		 z.setEven();
		 z.setSmall();
		 z.setPositive();
		 
		 System.out.println("Zahl:" + z.num);
		 System.out.println("Gerade? " + z.even);
		 System.out.println("Klein? " + z.small);
		 System.out.println("Positiv? " + z.positive);
		 

	}

}
