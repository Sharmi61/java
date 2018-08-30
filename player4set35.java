import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class player4set35 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.replace(" " ,"");
		ArrayList<String> al=new ArrayList<String>();
		for(int i=0;i<s.length();i++){
			al.add(Character.toString(s.charAt(i)));
		}
		ArrayList<String> al1=new ArrayList<String>();
		for(int i=0;i<s.length();i++){
			al1.add(Character.toString(s.charAt(i)).toLowerCase());
		}
		ArrayList<Integer> al2=new ArrayList();
		for(int i=0;i<al.size();i++)
			al2.add(Collections.frequency(al1,al1.get(i)));
		int m=Collections.min(al2);
		for(int i=0;i<al.size();i++)
		{
			if(al2.get(i)==m)
				System.out.print(al1.get(i)+" ");
		}
	}

}
