import java.io.*;
import java.util.*;
public class uncommonarraycount{
public static void main(String[] args)
{
int[] a={1,2,3,3,4,5};
int[] b={3,4,4,5,6,7,7};
ArrayList<Integer> al=new ArrayList<Integer>();
ArrayList<Integer> bl=new ArrayList<Integer>();
for(int i=0;i<b.length;i++){
bl.add(b[i]);}
for(int i=0;i<a.length;i++){
al.add(a[i]);}
for(int i=0;i<a.length;i++){
if(bl.contains(a[i]))
{al.removeAll(Collections.singleton(a[i]));
bl.removeAll(Collections.singleton(a[i]));
}
}
System.out.println(al.size()+bl.size());
}}