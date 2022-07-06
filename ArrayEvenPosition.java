// Q18 Wap enter an array and print element present at even position and also find count?

import java.util.*;
class ArrayEvenPosition
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

		System.out.println(" Number at even position are : ");

		for(i=0; i<5; i++)
		{
			if(i%2==1)
			{
			  System.out.println(a[i]);	
			   c++;
			}
		}
	
		System.out.println(" Count of even number is : " +c);
	}
}


/*
Output :

 Enter elements :
1
2
3
4
5
 Number at even position are :
2
4
 Count of even number is : 2

*/
