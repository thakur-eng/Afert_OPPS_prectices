package com.Pattern;

import java.lang.reflect.Array;
import java.util.Arrays;
public class M2 {

	public static void main(String[] args) {
		int []  a = {1,2,3,4,5,1,2,3,5,7};
		
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

	}
}
