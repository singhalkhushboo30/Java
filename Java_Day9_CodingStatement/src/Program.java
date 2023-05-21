import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		if(num==0) {
			count=1;
			System.out.println(count);
		}else {
		while(num!=0){
			count++;
			num=num/10;
			
		}System.out.println(count);}
		
	}
}
