// Q4.Wap to input an array and find sum of its 1st and 2nd element.

import java.util.*;
class Sumof_1stand2nd
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
		
			sum=a[0]+a[1];	
			
		System.out.println("sum of its 1st and 2nd element "+sum);
	
				
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
sum of its 1st and 2nd element 3
*/