import java.util.Arrays;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		boolean status=true;
		if(str1.length()!=str2.length()) {
			status=false;
		}
		else {
		char[] str1Array=str1.toLowerCase().toCharArray();
		char[] str2Array=str2.toLowerCase().toCharArray();
		Arrays.sort(str1Array);  
        Arrays.sort(str2Array);  
        status = Arrays.equals(str1Array, str2Array);  
        
	}
		if(status) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
			}

	
}
