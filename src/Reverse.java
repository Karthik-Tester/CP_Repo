import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 int number;
		 int reverse=0;
		 System.out.println("Enter the number");
		 number = sc.nextInt();
	        
	        int temp = number;
	        int remainder = 0;
	        
	        while(temp>0)
	        {
		    remainder = temp % 10;
		    reverse = reverse * 10 + remainder;
	            temp /= 10;
	        }

	        System.out.println("Reverse of " + number + " is " + reverse);
	    }
	}
