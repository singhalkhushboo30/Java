import java.util.Arrays;
import java.util.Scanner;

public class Program {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size of array: ");
	   int n=sc.nextInt();
	   System.out.println("Enter the array: ");
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++) {
		   arr[i]=sc.nextInt();
	   }
	   Arrays.sort(arr);
	   for(int i=0;i<n;i++) {
		   System.out.print(arr[i]+ " ");
	   }
   }
}
