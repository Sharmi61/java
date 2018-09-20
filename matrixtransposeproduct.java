import java.io.*;
import java.util.*;
public class matrixtransposeproduct{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();int d=n-1;
ArrayList<Integer> m=new ArrayList<Integer>();
ArrayList<Integer> t=new ArrayList<Integer>();
for(int i=0;i<n*n;i++){
if(i==0)
m.add(n);
else
m.add(m.get(i-1)+a);
}
int r=0;
for(int i=0;i<n;i++){
for(int j=0;j<n;j++)
{
System.out.print(m.get(r)+" ");
r++;}
System.out.println();}
} }