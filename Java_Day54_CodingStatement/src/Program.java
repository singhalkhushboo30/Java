import java.util.Scanner;

public class Program {
	public static boolean isDisjoint(int arr1[],int arr2[],int n,int m) {
		boolean flag=true;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr1[i]==arr2[j]) {
					flag=false;
				}
			}
			if(flag==false) {
				break;
			}
		}
		return flag;
	}
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter array 1 size");
    	int n=sc.nextInt();
    	System.out.println("Enter array 1 elements");
    	int[] arr1=new int[n];
    	for(int i=0;i<n;i++) {
    		arr1[i]=sc.nextInt();
    	}
    	System.out.println("Enter array 2 size");
    	int m=sc.nextInt();
    	System.out.println("Enter array 2 elements");
    	int[] arr2=new int[m];
    	for(int i=0;i<n;i++) {
    		arr2[i]=sc.nextInt();
    	}
    	System.out.println(isDisjoint(arr1,arr2,n,m));
    }
}
