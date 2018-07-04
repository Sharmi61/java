package wiproprp;

import java.util.Scanner;

public class sumofarray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] s=new int[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.nextInt();
		}int r=0;
		for(int i=0;i<s.length;i++) {
			r=r+s[i];
		}System.out.println(r);
	}

}
