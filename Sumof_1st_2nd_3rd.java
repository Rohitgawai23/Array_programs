// Q12.Wap to input an array and print sum of its 1st  2nd and 3rd element.

import java.util.*;
class Sumof_1st_2nd_3rd
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
		
			sum=a[0]+a[1]+a[2];	
			
		System.out.println("Sum of its 1st,2nd and 3rd element: "+sum);
	
				
	}
}

/*
Output: 

Enter Elements in Array:
1
2
3
4
5
Sum of its 1st,2nd and 3rd element: 6
*/