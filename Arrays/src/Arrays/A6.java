package Arrays;

public class A6 {
public static void main(String args[]) {
	int x[]= {6,8,3,17,54,4};
	int temp=0;
	for(int i=0;i<x.length;i++)
	{   for(int j=0;j<x.length-i-1;j++)
	    {    if(x[j]>x[j+1])
	       {  
	    	   temp=x[j];
	           x[j]=x[j+1];
	           x[j+1]=temp;
	       }
	    }
	}
	System.out.println("Ascending order:");
	
	for(int i=0;i<x.length;i++)
	{  
		System.out.print(x[i]+" , ");
	}
	//System.out.println(x[(x.length)-1]);
   }
}
