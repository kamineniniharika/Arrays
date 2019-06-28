package Arrays;

public class A3 {
	public static void main(String args[]) {
		int x[]= {53,5,26,1,9};
		int c=-1;
		int n=Integer.parseInt(args[0]);
		for(int i=0;i<x.length;i++)
		{   if(x[i]==n)
			  c=i;
		     
		}
		if(c!=-1)
		    System.out.println(c);
		else
			 System.out.println("-1");

	}
}
