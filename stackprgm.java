import java.io.*;
import java.util.*;
public class stackprgm
{
public static void main(String[] args)
{Stack<Integer> s=new Stack<Integer>();
s.push(10);
s.push(20);
s.push(30);
s.pop();
System.out.println(s.peek());//return the topmostelement 
System.out.println(s.search(1));//returns pos and not found returns -1
System.out.println(s.isEmpty());
System.out.println(s);
Iterator<Integer> i=s.iterator();
while(i.hasNext())
{
System.out.println(i.next());}//bottom up
ListIterator<Integer> l=s.listIterator(s.size());//size is must
while(l.hasPrevious())
System.out.println(l.previous());//top to bottom
System.out.println(s.size());}}//position index starts from 1
//principle LIFO