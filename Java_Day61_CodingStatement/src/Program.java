import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int sum=0;
			sum+=a+b;
			if(sum<3) {
				System.out.println("1");
			}
			else if(sum>=3 && sum<=10) {
				System.out.println("2");
			}
			else if(sum>=11 && sum<=60) {
				System.out.println("3");
			}
			else if(sum>60){
				System.out.println("4");
			}
		}
	}

}
