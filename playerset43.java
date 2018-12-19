import java.io.*;
import java.util.*;
public class playerset43{
public static void main(String[] args)
{Scanner sc=new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
/*int a=s1.lastIndexOf(s2);//tells the rightmost occurance
if(a>=0)
System.out.println(a);
else
System.out.println(a);
int b=s1.IndexOf(s2);//tells the first occurance
if(b>=0)
System.out.println(b);
else
System.out.println(b);*/
if(s1.contains(s2))
System.out.println("yes");
else
System.out.println("no");
}}
