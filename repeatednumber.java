
public class repeatednumber {
	public static void main(String args[]){
		String s="2525";
		int a[]=new int[s.length()];
		int i=0,j=0,count=0;
		for(i=0;i<s.length();i++)
		{
			a[i]=Integer.parseInt(Character.toString(s.charAt(i)));
		}
		for(i=0;i<a.length;i++){
			count=0;
			for(j=0;j<i;j++){
				if(a[i]==a[j]){
					count=1;
					break;
				}
			}if(count==1){System.out.println(a[i]);}
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
