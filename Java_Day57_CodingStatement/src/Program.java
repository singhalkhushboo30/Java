import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] c=new int[n];
		int[] p=new int[n];
		int[] m=new int[n];
		for(int i=0;i<n;i++) {
			m[i]=sc.nextInt();
			c[i]=sc.nextInt();
			p[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(c[i]*4-m[i]>=p[i]) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}
	}

}
