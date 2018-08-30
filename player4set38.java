import java.util.Scanner;


public class player4set38 {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();int a=0;
	for(int i=2;i<=n;i++)
	{
		if(n%i==0)
		{if(i%2==0){if(a!=0)
		{System.out.print(" "+i);a=a+1;}
			   else
			   System.out.prinln(i);}
		}
	}
}
}
