import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int digitRemove_Palin(int input1){
		// Read only region end
	String q=Integer.toString(input1);
    String d=Integer.toString(input1);
	StringBuilder r=new StringBuilder(d);
	r.reverse();int z=0;
	
		if(q.equals(r.toString()))
			return -1;
	    else{r.reverse();
			 for(int i=0;i<q.length();i++)
			 {
				r.delete(i,i+1);
				 if(r.toString().equals(r.reverse().toString())){
					z=Integer.parseInt(Character.toString(q.charAt(i)));
						break;
				 }else{r.reverse();
char c =q.charAt(i);
					 r.insert(i,c);
//System.out.println(r);
				 }
				 
			 }
			 }
		return z;
		 }
public static void main(String args[]){
UserMainCode u=new UserMainCode();
System.out.println(u.digitRemove_Palin(252532)); 
}
			
		
	}
