import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String newStr="";
		newStr=str.replaceAll("[{}()]", "");
		System.out.println(newStr);
	}

}
