import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int[] k=new int[n];
	   int[] x=new int[n];
	   for(int i=0;i<n;i++) {
		   k[i]=sc.nextInt();
		   x[i]=sc.nextInt();	
	   }
	   int m=0;
	   for(int i=0;i<n;i++) {
		   m=0;
		   m+=k[i]-x[i];
		   System.out.println(m);
	   }
   }
}
