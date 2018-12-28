import java.io.*;
import java.util.*;
public class hashmap{
public static void main(String[] args)
{Scanner sc=new Scanner(System.in);
Map m=new HashMap();//or Map<Integer,Character> m=new <...>();
m.put(2,'s');//to insert key and values
m.put(1,'y');
m.put(6,'y');
m.put(null,null);
Set<Map.Entry<Integer,Character>> st=m.entrySet();
for(Map.Entry<Integer,Character> mi:st)
System.out.println(mi.getKey()+"="+mi.getValue());
System.out.println(m.size());
System.out.println(m.isEmpty());
ArrayList<String> al=new ArrayList<String>();
al.addAll(m.values());//return entire map as collection
System.out.println(al);
m.remove(null);//remove corresponding key and value
System.out.println(m);//print entire map
System.out.println(m.containsKey(1));//return true if value found
System.out.println(m.containsValue('y'));//return true if value found
System.out.println(m.get(1));//return value for the corresponding key
System.out.println(m.get(4));//returns null if value not found
/*any number of key and values can be null
not guaranteed sorted order
key should be unique
*/
}}