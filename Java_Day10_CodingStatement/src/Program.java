import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=num;i>=1;i--) {
			fact*=i;
		}
		System.out.println(fact);
	}
}
