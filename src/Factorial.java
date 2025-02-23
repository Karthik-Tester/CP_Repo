import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int factorial=1,num;
System.out.println("Enter the number for which you need Factorial");
Scanner input = new Scanner(System.in);
num = input.nextInt();
for(int i=1;i<=num;i++) {
	factorial = factorial*i;
}
System.out.println("Factorial is "+factorial);
	}

}
