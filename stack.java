import java.io.*;
import java.util.*;
public class stack{
public static void main(String[] args){
Stack<Integer> s=new Stack<Integer>();
s.push(0);
s.push(1);
s.push(2);
s.push(3);
System.out.println(s);
int p=s.pop();
System.out.println(p);
System.out.println(s);
System.out.println(s.peek());
System.out.println(s.isEmpty());
System.out.println(s.size());
System.out.println(s.search(1));
Iterator<Integer> i=s.iterator();
while(i.hasNext()){
System.out.println(i.next());}
ListIterator<Integer> li=s.listIterator(s.size());
while(li.hasPrevious()){
System.out.println(li.previous());}}}