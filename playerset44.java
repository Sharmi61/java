import java.io.*;
import java.util.*;
public class playerset44{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.next();
int r=sc.nextInt();
char[] c=new char[s.length()];
char[] cr=new char[s.length()];
for(int i=0;i<s.length();i++)
c[i]=s.charAt(i);
for(int i=0;i<r;i++)
{for(int j=0;j<s.length();j++)
{if(j==s.length()-1)
cr[j]=c[0];
else
cr[j]=c[j+1];
}for(int k=0;k<s.length();k++)
c[k]=cr[k];
}
String f=String.valueOf(c);
System.out.println(f);
}}
/*input: sharmi 3
output:rmisha
//rotate the string 3 times
*/