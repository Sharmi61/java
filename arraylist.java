import java.io.*;
import java.util.*;
public class arraylist{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
ArrayList<Character> al=new ArrayList<Character>();
ArrayList<Integer> ali=new ArrayList<Integer>();
for(int i=0;i<s.length();i++)
al.add(s.charAt(i));
for(int i=0;i<al.size();i++)
ali.add(Collections.frequency(al,al.get(i)));
Collections.sort(ali);
System.out.println(ali);
char a='A';
int i=(int)a;
char a1=(char)i;
System.out.println(i);
TreeSet<Integer> t=new TreeSet<Integer>(ali);
System.out.println(ali.lastIndexOf(2));
System.out.println(ali.contains(2));
System.out.println(ali.remove(2));
System.out.println(ali);
String ss="sss ";
System.out.println(ss.trim());
}}