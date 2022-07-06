//Q3.Wap to input an array and print its 1st and last element.

import java.util.*;
class Sumof_1standlast
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
			
		System.out.println("First element= "+a[0]);
		System.out.println("last element= "+a[4]);
				
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
First element= 1
last element= 5
*/