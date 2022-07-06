// Q10.Wap to input an array and and find the sum of odd no.

import java.util.*;
class OddSumArray
{
	public static void main(String []args)
	{
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		int [] a=new int [5];
		System.out.println("Enter Element in Array");
		
		for(i=0; i<5; i++)
			a[i]=sc.nextInt();


		
		for(i=0; i<5; i++)
		{
			if(a[i]%2==1)
			sum=sum+a[i];
			
		}
		System.out.println("Odd of even number= "+sum);

	}
}

/*
Output :

Enter Element in Array
1
2
3
4
5
Odd of even number= 9
*/