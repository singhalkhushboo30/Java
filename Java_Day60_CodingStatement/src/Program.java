import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int[][] k=new int[n][7];
	   int rainy_day=0;
	   int sunny_day=0;
	   for(int i=0;i<n;i++) {
		   sunny_day=0;
		   rainy_day=0;
		   for(int j=0;j<7;j++) {
			   k[i][j]=sc.nextInt();
			   if(k[i][j]==0) {
				   rainy_day++;
			   }
			   else if(k[i][j]==1) {
				   sunny_day++;
			   }
		   }
		   if(sunny_day>rainy_day) {
			   System.out.println("Yes");
		   }
		   else {
			   System.out.println("No");
		   }
	   }
   }
}
