import java.io.*;
import java.util.*;
public class ctsdiff{
public static void main(String[] args)
{Scanner sc=new Scanner(System.in);
String s="rrlrlr";int x=1;int y=2;
int x1=x;int count=0;
Set<String> lhs=new LinkedHashSet();
for(int i=0;i<s.length();i++)
for(int j=i+1;j<=s.length();j++)
lhs.add(s.substring(i,j));
System.out.println(lhs);
Iterator<String> it=lhs.iterator();
while(it.hasNext())
{String q=it.next();
for(int i=0;i<q.length();i++){
char c=q.charAt(i);
if(c=='r')
x1++;
else
x1--;}
if(x1==y)
count++;
x1=x;}
System.out.println(count);
}}
/*input s="rrlrlr"
start x=1,end y=2
char r=increment start by 1;
char l=decrement start by 1;
output:form possible substrings from s
and count the substring which leads the start to end
eg:substring = rlr then 2->1->2(it reached the end value)*/