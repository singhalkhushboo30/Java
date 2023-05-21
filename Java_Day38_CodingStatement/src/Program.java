import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int frequency[]=new int[256];
		for(int i=0;i<str.length();i++) {
			frequency[(int)str.charAt(i)]++;
		}
		for(int i=0;i<256;i++) {
			if(frequency[i]==1) {
				System.out.print((char)i+" ");
			}
		}
	}

}
