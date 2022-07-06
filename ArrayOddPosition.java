// Q17 Wap enter an array and print element present at odd position and also find count?

import java.util.*;
class ArrayOddPosition
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int i, c=0;
		int [] a = new int[5];

		System.out.println(" Enter elements : ");

		for(i=0; i<5; i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println(" Number at odd position are : ");

		for(i=0; i<5; i++)
		{
			if(i%2==0)
			{
			  System.out.println(a[i]);	
			   c++;
			}
		}
	
		System.out.println(" Count of odd number is : " +c);
	}
}

/*
Output :
	
 Enter elements :
2
3
5
4
7
 Number at odd position are :
2
5
7
 Count of odd number is : 3

*/








