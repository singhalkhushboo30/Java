import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		String str=sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			count++;
		}
		System.out.println(count);
	}

}
