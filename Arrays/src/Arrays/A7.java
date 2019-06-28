package Arrays;

public class A7 {
public static void main(String args[]) {
	int x[]= {6,5,4,1,3,4,6};
	int n=x.length;
	int avx[]=new int[7];
	for(int i=0;i<n-1;i++)
	{    for(int j=i+1;j<n;j++)
	    {   if(x[i]==x[j])
	       {    avx[j]=1;
	           
	    }
	}
}   
	
	for(int i=0;i<n;i++)
	{
		if(avx[i]==0)
	
	System.out.println(x[i]);
}
}
}