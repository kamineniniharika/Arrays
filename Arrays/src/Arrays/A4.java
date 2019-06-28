package Arrays;

public class A4 {
public static void main(String args[]) {
	int ascii=Integer.parseInt(args[0]);
	if(ascii>127)
	    System.out.println("Enter the value");
	else
	{	char asciiChar=(char) ascii;
	    System.out.println(" ASCII value of "+ ascii +" is "+ asciiChar );
	}
}
}
