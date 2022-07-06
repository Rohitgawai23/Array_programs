// Q6.Wap to input an array and find its average.

import java.util.*;
class Averagefind
{
	public static void main(String []args)
	{
		int i,sum=0,avg=0;
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
			avg=sum/5;	
		}
	
		System.out.println("Avg of element= "+avg);
	
				
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
Avg of element= 3

*/