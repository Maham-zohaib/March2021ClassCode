package assignments;

public class Fictorial_Numb {

	public static void main(String[] args) {
		int i;
		int n=5;
		int fict=1;
       for(i=1 ; i<=n ; i++) {
			fict = fict * i;
			}
		System.out.println("fictorial of " + n+ " is "+ fict);
	}
}