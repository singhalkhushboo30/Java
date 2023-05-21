import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length();
		for(int i=0;i<n;i++) {
			if(i==0) {
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}
			else if(i==n-1) {
				System.out.print(Character.toUpperCase(str.charAt(i)));
			}
			else {
				System.out.print(Character.toLowerCase(str.charAt(i)));	
			}
		}
	}

}
