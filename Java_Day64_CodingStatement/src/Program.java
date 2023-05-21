import java.util.*;
import java.lang.*;
import java.io.*;

public class Program {
	public static void main(String[] args) throws java.lang.Exception {
// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			if (s.contains("010") || s.contains("101"))
				System.out.println("Good");
			else
				System.out.println("Bad");
		}
	}
}