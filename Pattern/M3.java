package com.Pattern;

import java.lang.reflect.Array;
import java.util.Arrays;
public class M3 {
 
	public static void main(String[] args) {
		int []  a = {1,2,3,4,5,6,1,2,3,5,6,7};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		int left =0;int right = a.length-1;
		while(left<right)
		{
			if(a[left]!=-1)
			{
				left++;
			}
			else if(a[right]==-1)
			{
				right--;
			}
			else 
			{
				int temp =  a[left];
				a[left] =a[right];
				a[right]=temp;
			}
		}
		System.out.println(Arrays.toString(a));

		
	}
}
