package h1;

public class Zahl {
	boolean even = true;
	boolean small = true;
	boolean positive = false;
	int num = 1;
	
	public void setEven () {
		if ( Math.abs(num) % 2 == 0 ) {
			even = true;
		}
		else {
			even = false;
		}
	}
	public void setSmall () {
		if (Math.abs(num) < 100) {
			small = true;
		}
		else {
			small = false;
		}
	}
	public void setPositive () {
		if (num > 0) {
			positive = true;
		}
		else {
			positive = false;
		}
	}
}
