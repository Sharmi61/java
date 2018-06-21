import java.util.Scanner;


public class oddnumber {
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int no=n;
		int r,sum=0;
		while(no!=0)
		{
			r=no%10;
			if((r%2)!=0)
			{sum=sum+r;}
			no=no/10;
		}
		System.out.println(sum);
	}

}
