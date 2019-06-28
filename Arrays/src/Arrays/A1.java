package Arrays;

public class A1 {
public static void main(String args[]) {
    int x[]= {10,5,3,2,1};
	int sum=0;
	float average=0;
	for(int i=0;i<x.length;i++)
	{ 
	    sum=sum+x[i];
	}
	System.out.println(+sum);
	average=(float)sum/5;
	System.out.println(+average);
  }
}
