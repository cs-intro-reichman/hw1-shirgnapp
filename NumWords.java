// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int num= Integer.parseInt(args[0]);
        int hundreds, tens, ones;
        hundreds= num/100;
        ones= num%10;
        tens= (num/10)%10;
        System.out.println(hundreds + " hundreds, "+ tens + " tens, and "+ ones+ " ones." );
	}
}
