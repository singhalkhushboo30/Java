import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int count = 0;
		if (num <= 1)
			System.out.println(num + " is not a prime number");
		else {

			for (int i = 2; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count > 2)
				System.out.println(num + " is not a prime number");
			else
				System.out.println(num + " is a prime number");
		}
	}
}
