package Arrays;

public class A10 {
	public static void main(String args[]) {
		int y[][]=new int[3][3];
        int a=args.length;
		int max=0;
		if(a<9)
		     System.out.println("enter the 9 values");
		
		if(a==9)
		{
		   int k=0;
           for(int i=0;i<3;i++)
            {     for(int j=0;j<3;j++){
            	  y[i][j]=Integer.parseInt(args[k]);
            	  k++;
            }
            }
           for(int i=0;i<3;i++)
             {   for(int j=0;j<3;j++) {
        	         if(max<y[i][j])
                           max=y[i][j];
              
        }
             }
        System.out.println("max no is "+max);
	
            }
        } 
        
	}
