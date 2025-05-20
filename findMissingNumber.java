class findMissingNumber
{
public static void main(String [] args)
	{
	int [] arr = {1,3,5,6,2};
	int  n =  arr.length+1;
	int finalSum =  n*(n+1)/2;
	int arraySum=0;
	for(int i =0;i<arr.length;i++)
	{
		arraySum+=arr[i];
	}
	System.out.println(finalSum-arraySum);
	}
}