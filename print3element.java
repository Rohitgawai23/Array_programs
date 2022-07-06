// Q11.Wap to input an array and print its 1st  2nd and 3rd element.

import java.util.*;
class print3element
{
	public static void main(String []args)
	{
		int i;
		Scanner sc= new Scanner(System.in);
		int [] a=new int[5];
		System.out.println("Enter Elements in Array: ");
		
		for(i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}
			
			
		System.out.println("First element= "+a[0]);
		System.out.println("Second element= "+a[1]);	
		System.out.println("Third element= "+a[2]);	
	}
}

/*
Enter Elements in Array:
1
2
3
4
5
First element= 1
Second element= 2
Third element= 3

*/