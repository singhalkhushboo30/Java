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
		int count_odd=0;
		int count_even=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				count_even++;
			}
			else {
				count_odd++;
			}
		}
		System.out.println("Number of even elements: "+count_even);
		System.out.println("Number of odd elements: "+count_odd);
		
	}

}
