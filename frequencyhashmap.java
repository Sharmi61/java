import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Map<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int a[]=new int[]{1,1,2,2,3,4,4,4};
		for(int i=0;i<a.length;i++){
		    if(hm.containsKey(a[i]))
		    hm.put(a[i],hm.get(a[i])+1);
		    else
		    hm.put(a[i],1);
		}Set<Map.Entry<Integer,Integer>> mi=hm.entrySet();
		for(Map.Entry<Integer,Integer> it:mi)
		System.out.println(it.getKey()+"="+it.getValue());
		System.out.println(hm);
		
	}
}
