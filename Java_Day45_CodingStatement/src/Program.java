import java.util.Scanner;

public class Program {
	public static void main(String[]  args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		System.out.println("Enter elements");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int max=arr[n-1];
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			else if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Smallest number: "+min);
		System.out.println("Largest number: "+max);
		
		
	}

}
