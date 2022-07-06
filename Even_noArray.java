// Q7.Wap to input an array and and print even no.

import java.util.*;
class Even_noArray
{
	public static void main(String []args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int [] a=new int [10];
		System.out.println("Enter Element in Array");
		
		for(i=0; i<10; i++)
			a[i]=sc.nextInt();


		System.out.println("Even Elements in Array: ");
		for(i=0; i<10; i++)
		{
			if(a[i]%2==0)
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
45
4
5
6
7
7
8
Even Elements in Array:
2
4
6
8
*/