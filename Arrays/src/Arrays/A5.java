package Arrays;

public class A5 {
	public static void main(String args[]) {
		int []x= {6,8,3,17,54,4};
		int temp=0;
		int n=x.length;
		for(int i=0;i<n;i++)
		 {   for(int j=0;j<n-i-1;j++)
		    {    if(x[j]>x[j+1])
		       {   temp=x[j];
		           x[j]=x[j+1];
		           x[j+1]=temp;
		       }
		    }
		 }
		System.out.print("ascending order:");
		for(int i=0;i<x.length;i++)
		{     System.out.print(x[i]+" , ");
			}
		System.out.println("\nsmallest 2 numbers :"+x[0]+" and " +x[1]);
			
		 System.out.print("largest 2 no "+x[5]+" , "+x[4]);	
}
}

