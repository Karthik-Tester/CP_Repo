import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int base,power,result = 1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter base value");
		base=sc.nextInt();
		System.out.println("Enter poweer value");
		power=sc.nextInt();
		for(int i=1;i<=power;i++) {
		result = result*base;	
		}
		System.out.println("Result is "+result);
	}

}
