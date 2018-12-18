import java.io.*;
import java.util.*;
public class playerset42{
public static void main(String[] args)
{Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a1[]=new int[n];int c=0;
if(n==1)
{
int a=sc.nextInt();
System.out.println("yes");}
else{
for(int i=0;i<n;i++)
a1[i]=sc.nextInt();
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(a1[i]>a1[j]){
c=1;
break;
}
}if(c!=0)
break;}
if(c==0)
System.out.println("yes");
else
System.out.println("no");
}
}}
