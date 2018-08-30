import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class player4set36 {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	int n=sc.nextInt();
	ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> al1=new ArrayList<Integer>();
	for(int i=0;i<s.length();i++)
		al.add(Integer.parseInt(Character.toString(s.charAt(i))));
	System.out.println(Collections.frequency(al,n));
}
}
