import java.util.*;
public class matrixsorting{
public static void main(String args[])
{Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int temp=0,h=0;
int[][] r=new int[m][n];
int[][] s=new int[m][n];
int[][] t=new int[m][n];
int[] a=new int[n];
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{r[i][j]=sc.nextInt();
System.out.print(r[i][j]+" ");
}System.out.println();
}for(int i=0;i<m;i++){
for(int j=0;j<n;j++)
{a[h]=r[j][i];
h++;
}h=0;if(i%2==0)
{for(int x=0;x<a.length-1;x++){
for(int y=x+1;y<a.length;y++){
if(a[x]>a[y]){
temp=a[x];
a[x]=a[y];
a[y]=temp;}}}}else
{for(int x=0;x<a.length-1;x++){
for(int y=x+1;y<a.length;y++){
if(a[x]<a[y]){
temp=a[x];
a[x]=a[y];
a[y]=temp;}}}}
for(int f=0;f<a.length;f++){
s[f][i]=a[f];}}
for(int i=0;i<m;i++)
{for(int j=0;j<n;j++)
{
System.out.print(s[i][j]+" ");
}System.out.println();}}}