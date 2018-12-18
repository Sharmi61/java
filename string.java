import java.io.*;
import java.util.*;
public class string{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
//char c='c';System.out.println(Character.isLetterOrDigit(' '));
String s1=sc.nextLine();
if(s.compareTo(s1)>=0)
System.out.println("s");
else
System.out.println("no");
System.out.println(s.substring(0,2));
ArrayList<Integer> al=new ArrayList();
ArrayList<Integer> al1=new ArrayList();
al.add(0);
al.add(1);
al.add(2);
for(int i=0;i<al.size();i++)
al1.add(Collections.frequency(al,i));
System.out.println(al1);
}}