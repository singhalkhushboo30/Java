import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=num-1;i>=0;i--) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
