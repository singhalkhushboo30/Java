import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		for(int i=n-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}
