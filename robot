import java.io.*;
import  java.util.*;

// Read only region start
class robot
{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
String s1=sc.next();
String s2=sc.nextLine();s2=s2.trim();
System.out.println(s2);
robot r=new robot();
System.out.println(r.moveRobot(n1,n2,s1,s2));}

	public String moveRobot(int input1,int input2,String input3,String input4){
		// Read only region end
		// Write code here...
		int x=input1;int g=0;
		int y=input2;
		String[] ss=input3.split("-");
		String[] p=input4.split(" ");
		int s=Integer.parseInt(ss[0]);
		int e=Integer.parseInt(ss[1]);
		String d=ss[2];
		String def=d;
		for(int i=0;i<p.length;i++){
			if(p[i].equals("M"))
			{
				
				if(def.equals("E")){
                                if(((s+1)>x)||(e>y))
				{ g=1;
				break;}else{
					s+=1;}}
				else if(def.equals("S")){
                               if((s>x)||((e-1)<0))
				{ g=1;
				break;}else{
					e-=1;}}
				else if(def.equals("W")){

                               if(((s-1)<0)||(e>y))
				{ g=1;
				break;}else{
					s-=1;}}
				else if(def.equals("N")){

                               if((s>x)||((e+1)>y))
				{ g=1;
				break;}else{
					e+=1;}}
				else if(def.equals("SE")){

                               if(((s+1)>x)||((e-1)<0))
				{ g=1;
				break;}else
				{s+=1;e-=1;}}
				else if(def.equals("SW")){

                               if(((s-1)<0)||((e-1)<0))
				{ g=1;
				break;}else
				{s-=1;e-=1;}}
				else if(def.equals("NE")){

                               if(((s+1)>x)||((e+1)<0))
				{ g=1;
				break;}else
				{s+=1;e+=1;}}
				else if(def.equals("NW")){

                               if(((s-1)<0)||((e+1)>y))
				{ g=1;
				break;}else
				{s-=1;e+=1;}}
			}
			if(p[i].equals("R")){
				if(def.equals("E"))
					def="S";
				else if(def.equals("S"))
					def="W";
				else if(def.equals("W"))
					def="N";
				else if(def.equals("N"))
					def="E";
				else if(def.equals("SE"))
					def="SW";
				else if(def.equals("SW"))
					def="NW";
				else if(def.equals("NE"))
					def="SE";
				else if(def.equals("NW"))
					def="NE";
				
			}
			if(p[i].equals("r")){
				if(def.equals("E"))
					def="SE";
				else if(def.equals("S"))
					def="SW";
				else if(def.equals("W"))
					def="NW";
				else if(def.equals("N"))
					def="NE";
				else if(def.equals("SE"))
					def="S";
				else if(def.equals("SW"))
					def="W";
				else if(def.equals("NE"))
					def="E";
				else if(def.equals("NW"))
					def="N";
				
			}
			if(p[i].equals("L")){
				if(def.equals("E"))
					def="N";
				else if(def.equals("S"))
					def="E";
				else if(def.equals("W"))
					def="S";
				else if(def.equals("N"))
					def="W";
				else if(def.equals("SE"))
					def="NE";
				else if(def.equals("SW"))
					def="SE";
				else if(def.equals("NE"))
					def="NW";
				else if(def.equals("NW"))
					def="SW";
			}
			if(p[i].equals("l")){
				if(def.equals("E"))
					def="NE";
				else if(def.equals("S"))
					def="SE";
				else if(def.equals("W"))
					def="SW";
				else if(def.equals("N"))
					def="NW";
				else if(def.equals("SE"))
					def="E";
				else if(def.equals("SW"))
					def="S";
				else if(def.equals("NE"))
					def="N";
				else if(def.equals("NW"))
					def="W";
				
			}
			
		}String q;
		if(g==0)
		q=s+"-"+e+"-"+def;
		else
		q=s+"-"+e+"-"+def+"-ER";	
		return q;
	
}}
