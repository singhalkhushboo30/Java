import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int rem, rev = 0;
		int copy = num;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		if (rev == copy)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a Palindrome number");
	}
}