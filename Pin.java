package wiproprp;

import java.util.Scanner;

public class Pin {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
	//	System.out.println(input1);

		 String s1=Integer.toString(input1);
			String s2=Integer.toString(input2);
			String s3=Integer.toString(input3);
			String s=s1+s2+s3;
		//	System.out.println(s1);

			int[] c1=new int[3];
			int[] c2=new int[3];
			int[] c3=new int[3];
			int[] r=new int[4];
			int[] ss=new int[9];
			for(int i=0;i<3;i++){
				c1[i]=Integer.parseInt(Character.toString(s1.charAt(i)));
				}
							for(int i=0;i<3;i++){
				c2[i]=Integer.parseInt(Character.toString(s2.charAt(i)));
				}
				for(int i=0;i<3;i++){
				c3[i]=Integer.parseInt(Character.toString(s3.charAt(i)));
				}
				for(int i=0;i<9;i++){
				ss[i]=Integer.parseInt(Character.toString(s.charAt(i)));
				}
			for(int i=0;i<9;i++){
				r[0]=r[0]>ss[i]?r[0]:ss[i];
			}int j=1;for(int i=0;i<3;i++){
			r[j]=c1[i];
				r[j]=r[j]<c1[i]?r[j]:c1[i];
				r[j]=r[j]<c2[i]?r[j]:c2[i];
				r[j]=r[j]<c3[i]?r[j]:c3[i];
				j++;
				}
			
				StringBuilder sb=new StringBuilder();
				for(int i=0;i<r.length;i++) {
					sb.append(r[i]);
				}
		        int e=Integer.parseInt(sb.toString());
		        System.out.println(e);
		        

}}
