// Q16.Wap to input an array and and print the  sum and count of odd  no.

import java.util.*;
class CountOdd_no
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


		System.out.println("odd Elements in Array: ");
		for(i=0; i<5; i++)
		{
			if(a[i]%2==1)
			{
			   s=s+a[i];
			    c++;
			}
			
		}
		System.out.println("Count of odd number is :"+c);
		System.out.println("sum of odd number is :"+s);
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
odd Elements in Array:
Count of odd number is :3
sum of odd number is :9
*/