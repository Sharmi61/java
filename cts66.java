import java.io.*;
import java.util.*;
public class cts66{
public static void main(String[] args)
{
List<String> name=new ArrayList();
List<Integer> price=new ArrayList();
List<Integer> weight=new ArrayList();
HashSet<String> hs=new HashSet();
name.add("book");
name.add("pen");
name.add("pen");
name.add("book");
name.add("pen");
price.add(10);
price.add(20);
price.add(20);
price.add(10);
price.add(10);
weight.add(100);
weight.add(200);
weight.add(200);
weight.add(100);
weight.add(200);
int count=0;
for(int i=0;i<name.size();i++)
if(hs.add(name.get(i)+Integer.toString(price.get(i))+Integer.toString(weight.get(i)))==false)
count++;
System.out.println(count);
}}