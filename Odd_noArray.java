// Q8.Wap to input an array and and print odd  no.

import java.util.*;
class Odd_noArray
{
	public static void main(String []args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int [] a=new int [10];
		System.out.println("Enter Element in Array");
		
		for(i=0; i<10; i++)
			a[i]=sc.nextInt();


		System.out.println("Odd Elements in Array: ");
		for(i=0; i<10; i++)
		{
			if(a[i]%2==1)
			System.out.println(a[i]);
		}


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
6
7
8
9
10
Odd Elements in Array:
1
3
5
7
9
*/
