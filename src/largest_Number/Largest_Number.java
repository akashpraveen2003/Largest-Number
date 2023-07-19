package largest_Number;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
   Given an array A of non-negative integers, arrange them such that they form the largest number.

	Note: The result may be very large, so you need to return a string instead of an integer.
	
	Input 1:
	
	A = [3, 30, 34, 5, 9]
	
	Input 2:
	
	A = [2, 3, 9, 0]
		
	Output 1:
	
	"9534330"
	
	Output 2:
	
	"9320"
 */
public class Largest_Number {
	
	private static void largest_number(String[] array) {
	
		Arrays.sort(array,new Comparator<String>()
		{
			public int compare(String o1, String o2) {		// Comparing 2 numbers
				String s1=o1+o2;				// concatenating 2 string
				String s2=o2+o1;
				int n1=Integer.parseInt(s1);
				int n2=Integer.parseInt(s2);
				if(n1>n2)					// checking if n1>n2, then no swap in elements
				{
					return -1;
				}
				else if(n1<n2)					// else swap
				{
					return 1;
				}
				else
				{
				return 0;
				}
			}
			
		}
				);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+"");
		}
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		String array[]=new String[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextLine();
		}
		largest_number(array);
	}

	

}
