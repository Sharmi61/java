import java.util.Scanner;


public class player4set40 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=1,sum=0;//System.out.println(n);
		for(int i=1;i<=n;i++){
			 int r=n-i;
			 for(int j=0;j<r;j++){
				 sum+=1;
				// System.out.println(sum);
			 }for(int k=0;k<i;k++)
			 {
				 sum+=2;
				// System.out.println(sum);
			 if(sum==n)
			 {
				 count++;
				 break;
			 }
			 }
			
			 sum=0;} System.out.println(count);
		}
		
	

}
