import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		int a;
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a integer");
		a=scanner.nextInt();
		if( a%2 == 1 )System.out.println("The input integer is Odd Number.");
		else System.out.println("The input integer is Even Number.");
	}

}
