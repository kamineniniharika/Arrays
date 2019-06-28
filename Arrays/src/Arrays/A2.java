package Arrays;

public class A2 {
	public static void main(String args[]) {
		int x[]= {20,5,6,8,10};
		int max=x[0],min=x[0];
		for(int i=0;i<x.length;i++)
		{    if(x[i]>max)
			     max=x[i];
		}
		System.out.println(" max value "+max);
		for(int i=0;i<x.length;i++)
		{     if(x[i]<min)
			     min=x[i];
		}
		System.out.println(" min value "+min);
	}

}
