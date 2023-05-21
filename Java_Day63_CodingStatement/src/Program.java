import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int w1;
	   int w2;
	   int x1;
	   int x2;
	   int m;
	   for(int i=0;i<n;i++) {
		   w1=sc.nextInt();
		   w2=sc.nextInt();
		   x1=sc.nextInt();
		   x2=sc.nextInt();
		   m=sc.nextInt();
		   if((w2>=w1+(x1*m)) && (w2<=w1+(x2*m))) {
			   System.out.println("1");
		   }
		   else {
			   System.out.println("0");
		   }
	   }
   }
}
