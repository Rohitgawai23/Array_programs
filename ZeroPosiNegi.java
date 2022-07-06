/*Q13.Wap to input an array and find 
  no of 0s.
  no of positive no.
  no of negative no.
*/

import java.util.*;
class ZeroPosiNegi
{
	public static void main(String []args)
	{
		int i,z=0,p=0,n=0;
		Scanner sc=new Scanner(System.in);
		int [] a=new int [5];
		System.out.println("Enter Element in Array");
		
		for(i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}

		
		for(i=0; i<5; i++)
		{
			if(a[i]==0)
			  z++;
			
			else if(a[i]>0)
			  p++;
			
			else if(a[i]<0)
			  n++;
			
		}
		System.out.println("Zero in an array : "+z);
		System.out.println("possitive in an array : "+p);
		System.out.println("negitive in an array : "+n);
	}
}

/*
Output :

 Enter Element in Array
1
2
3
3
-4
Zero in an array : 0
possitive in an array : 4
negitive in an array : 1

*/