import java.io.*;
import java.util.*;
public class freqdelete{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int n=sc.nextInt();
ArrayList<Integer> al=new ArrayList<Integer>();
ArrayList<Character> cl=new ArrayList<Character>();
for(int i=0;i<s.length();i++){
cl.add(s.charAt(i));}
int r=cl.size();
for(int i=0;i<cl.size();i++)
al.add(Collections.frequency(cl,cl.get(i)));
while(n>0){
int m=Collections.min(al);
for(int i=0;i<al.size();i++)
{if(al.get(i)==m){
al.remove(i);
cl.remove(i);
i--;
n--;
}if(n==0)
{r=cl.size();
break;
}}}
System.out.println(r);}}