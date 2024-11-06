// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		// Replace this comment with your codeasaddgvd
		System.out.println("hello");
		int lim = Integer.parseInt(args[0])+1;
		int a = (int) (Math.random()*lim);
		int b = (int) (Math.random()*lim);
		int c = (int) (Math.random()*lim);
		int sum = a+b+c;
		System.out.println(a+" "+b+" "+c);
		int min = Math.min(Math.min(a,b),c);
		int max = Math.max(Math.max(a,b),c);
		int mid = sum-max-min;
		System.out.println(max+" "+mid+" "+min);

	}
}
