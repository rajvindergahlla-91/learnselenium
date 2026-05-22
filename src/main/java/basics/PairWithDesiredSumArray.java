package basics;

public class PairWithDesiredSumArray {
	
	/*public static void main(String [] args)
	{
		int[] arr = { 2,4,3,7,5,1,6};
		int target = 7;
		for (int i = 0 ; i<arr.length;i++)
		{
			for(int j = i+1; j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("the desired pair is : " + arr[i] + " , " + arr[j]);
				}
			}
		}
	}

}*/
	public static void main(String[] args)
	{
		int[] arr = {2,3,4,5,1,8,9,7};
		int target= 9;
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println("the desired pair is :"  + arr[i] + " " + arr[j]);
				}
			}
		}
	}
}
