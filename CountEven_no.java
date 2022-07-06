// Q15.Wap to input an array and and print the  sum and count of  even no.

import java.util.*;
class CountEven_no
{
	public static void main(String []args)
	{
		int i,c=0,s=0;
		Scanner sc=new Scanner(System.in);
		int [] a=new int [5];
		System.out.println("Enter Element in Array");
		
		for(i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}


		System.out.println("Even Elements in Array: ");
		for(i=0; i<5; i++)
		{
			if(a[i]%2==0)
			{
			   s=s+a[i];
			    c++;
			}
			
		}
		System.out.println("Count of even number is :"+c);
		System.out.println("sum of even number is :"+s);
	}
}

/*
Output :

Enter Element in Array
2
2
2
3
4
Even Elements in Array:
Count of even number is :4
sum of even number is :10

*/