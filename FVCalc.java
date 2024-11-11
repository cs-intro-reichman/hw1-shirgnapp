// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
        double rate= Double.parseDouble(args[1]);
        int n= Integer.parseInt(args[2]);
        double rate2= rate+1;
        double futureValue=currentValue*(Math.pow(rate2,n));
        System.out.println("After "+n+ " years, "+ (int)(currentValue) +"$ saved at " + rate +"% will yield " + ((int)futureValue)/100);

	}
}