import java.io.*;
import java.util.*;
public class playerset41{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
double sum=0;int i=0;
do{
sum=Math.pow(m,i);
if(sum==n)
break;
i++;
}while(sum<n);
if(sum==n)
System.out.println("yes");
else
System.out.println("no");}}
