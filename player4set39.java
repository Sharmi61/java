import java.util.Scanner;


public class player4set39 {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();int r=0,q=n;
	if(n==1)
		System.out.println("yes");
	else
	{
		do{
			 
			 q=q/2;
			 r=q%2;
		}while(r==0);
		if(q==1)System.out.println("yes");
		else{System.out.println("no");} 
	}
}
}
