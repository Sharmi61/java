
public class wrapperclasses {
public static void main(String args[])
{
	int i=3;
	String s=Integer.toString(i);
	System.out.println(s);
	Integer i1=new Integer(i);
	System.out.println(i1.SIZE);
	System.out.println(i1.TYPE);
	System.out.println(i1.MIN_VALUE);
	System.out.println(i1.MAX_VALUE);
	int i2=2;
	Integer i22=new Integer(i2);
	System.out.println(i22.compareTo(i));
	System.out.println(i22.compareTo(i1));
	char v='9';char v1='@';char v2='a';char v3=' ';
	System.out.println(Character.isDigit(v));
	System.out.println(Character.isLetter(v));
	System.out.println(Character.isLetterOrDigit(v1));
	System.out.println(Character.isLowerCase(v2));
	System.out.println(Character.isUpperCase(v2));
	System.out.println(Character.toLowerCase(v2));
	System.out.println(Character.toUpperCase(v2));
	System.out.println(Character.isWhitespace(v3));
	
	}
}
