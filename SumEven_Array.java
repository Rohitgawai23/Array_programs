// wap input 10 element in array find sum all even number

import java.util.*;
class SumEven_Array
{
	public static void main(String []args)
	{
		int i,evensum=0;
		Scanner sc= new Scanner(System.in);
		int [] a=new int[10];
		System.out.println("Enter Elements in Array: ");
		
		for(i=0; i<10; i++)
		{
			a[i]=sc.nextInt();
		}

		
		for(i=0; i<10; i++)
		{	
			if(a[i]%2==0)
			evensum = evensum + a[i];		
		}
		System.out.println("sum of all even numbers in Array is: "+evensum);
	
				
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
sum of all even numbers in Array is: 30
*/