package wiproprp;

import java.util.Scanner;

public class stringsplitandreverse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] ss=s.split(" ");
		for(int i=0;i<ss.length;i++) {
		StringBuilder sb=new StringBuilder(ss[i]);
	    System.out.print(sb.reverse()+" ");
	}

}}
