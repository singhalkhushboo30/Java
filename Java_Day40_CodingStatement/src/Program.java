import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String subStr=sc.next();
		String newStr=sc.next();
		String str1=str.replace(subStr,newStr);
		System.out.println(str1);
	}

}
