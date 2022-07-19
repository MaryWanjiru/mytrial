import java.util.*;
public class simpcalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tt = new Scanner(System.in); 
		
		Double fnum;
		Double snum;
		Double ans;
		
		System.out.println("To add two numbers, input First Number:");
		fnum = tt.nextDouble();
		System.out.println("Input the Second Number");
		snum = tt.nextDouble();
		ans = fnum + snum;
		System.out.println("Your Answer is: "+ans);
	}

}
