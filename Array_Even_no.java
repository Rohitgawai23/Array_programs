// wap input 10 element in array count all even number

import java.util.*;
class Array_Even_no
{
	public static void main(String []args)
	{
		int i;
		Scanner sc=new Scanner(System.in);
		int [] a=new int [10];
		System.out.println("Enter Element in Array");
		
		for(i=0; i<10; i++)
			a[i]=sc.nextInt();


		System.out.println("Even Elements in Array");
		for(i=0; i<10; i++)
		{
			if(a[i]%2==0)
			System.out.println(a[i]);
		}


	}
}



/*	
Output:
		
Even Elements in Array
22
44
66
66
34
*/