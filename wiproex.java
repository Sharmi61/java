
public class wiproex {
	public static void main(String args[]){
	String s="Wipro Technologies";
	String[] str=s.split(" ");
	StringBuilder s1=new StringBuilder(str[0]);
	StringBuilder s2=new StringBuilder(str[1]);
	s1=s1.reverse();
	s2=s2.reverse();
	String s11=s1.toString();
	String s22=s2.toString();
	char[] c1=s11.toCharArray();
	char[] c2=s22.toCharArray();
	c1[0]=Character.toUpperCase(c1[0]);
	c1[c1.length-1]=Character.toLowerCase(c1[c1.length-1]);
	c2[0]=Character.toUpperCase(c2[0]);
	c2[c2.length-1]=Character.toLowerCase(c2[c2.length-1]);
	String r1=String.valueOf(c1);
	String r2=String.valueOf(c2);
	System.out.println(r1+" "+r2);
	
	
	
	

}}
