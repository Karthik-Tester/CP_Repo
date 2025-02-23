import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result,x =0;
		System.out.println("Please enter the integer for which you want to generate multiplication table");
		Scanner sc = new Scanner (System.in);
		x=sc.nextInt();
		for (int i=1;i<=10;i++) {
			result = x*i;
			System.out.println(result);
		}

	}

}
