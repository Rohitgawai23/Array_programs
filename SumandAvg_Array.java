// wap input 10 element in arry find sum and avg.

import java.util.*;
class SumandAvg_Array
{
	public static void main(String []args)
	{
		int i,sum=0,avg=0;
		Scanner sc= new Scanner(System.in);
		int [] a=new int[10];
		System.out.println("Enter Elements in Array: ");
		
		for(i=0; i<10; i++)
		{
			a[i]=sc.nextInt();
		}

		
		for(i=0; i<10; i++)
		{
			sum=sum+a[i];
			avg=sum/10;
			
		}
		System.out.println("sum of entered no is: "+sum);
		System.out.println("avg of entered no is: "+avg);
				
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
6
7
8
9
10
sum of entered no is: 55
avg of entered no is: 5
*/s