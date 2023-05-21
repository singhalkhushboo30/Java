import java.util.Arrays;
import java.util.Scanner;

public class Program {
   public static int maxProduct(int[] a) {
	   int ans=Integer.MIN_VALUE;
	   int cprod=1;
	   for(int i=0;i<a.length;i++) {
		   cprod*=a[i];
		   ans=Math.max(ans, cprod);
		   if(cprod==0) {
			   cprod=1;
		   }
	   }
	   cprod=1;
	   for(int i=a.length-1;i>=0;i--) {
		   cprod*=a[i];
		   ans=Math.max(ans, cprod);
		   if(cprod==0) {
			   cprod=1;
		   }
	   }
	   return ans;
   }
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size of array: ");
	   int n=sc.nextInt();
	   System.out.println("Enter the array: ");
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++) {
		   arr[i]=sc.nextInt();
	   }
	   System.out.println(maxProduct(arr));
   }
}
