package com.Pattern;

import java.lang.reflect.Array;
import java.util.Arrays;

public class M1 {
	public static void main(String[] args) {
		int []  a = {1,2,3,4,5,1,2,3,5,7};
		//{1,2,3,4,5,-1,-1,-1,-1,7}
	//	{1,2,3,4,5,7,-1,-1,-1,-1}
  
		for(int i=0;i<a.length;i++)
		{
			//if(a[i]!=-1) {
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
			}
		//}
		System.out.println(Arrays.toString(a));
		
	}
}
