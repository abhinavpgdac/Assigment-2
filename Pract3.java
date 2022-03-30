package Assignment2;
/*
 wap to check any number is spy number or not 
example 
1124 is spy  i.e 1+1+2+4  =8 
                     and 1*1*2*4=8 
 */
import java.util.*;

public class Pract3 {
	
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n,p,rev,s=0,sum=1;
		System.out.println("Enter the no.:- ");
		n=x.nextInt();
		p=n;
		while(n>0)
		{
			rev=n%10;
			s=s+rev;
			sum=sum*rev;
			n=n/10;
		}
		if(sum==s)
		{
			System.out.println("It is spy no.:- "+p);
		}
		else System.out.println("Not a spy no.:- "+p);
	}

}
