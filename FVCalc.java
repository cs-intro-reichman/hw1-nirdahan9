// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		double rate2 = ((rate)+100.0)/100;
		int n = Integer.parseInt(args[2]);
		int futureValue =(int) (Math.pow(rate2, n)*currentValue);
		System.out.println("After "+n+" years, a $"+currentValue+" saved at "+rate+"% will yield $"+futureValue);
	}
}