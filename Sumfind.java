// Q5.Wap to input an array and find sum.

import java.util.*;
class Sumfind
{
	public static void main(String []args)
	{
		int i,sum=0;
		Scanner sc= new Scanner(System.in);
		int [] a=new int[5];

		System.out.println("Enter Elements in Array: ");
		
		for(i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
			
	
		for(i=0; i<5; i++)
		{
			sum=sum+a[i];	
		}
	
		System.out.println("Sum of element= "+sum);
	
				
	}
}
/*
Output :
Enter Elements in Array:
1
2
3
4
5
Sum of element= 15
*/