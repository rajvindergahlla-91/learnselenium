package basics;

public class LargestNumberInarray {
	public static void main(String[] args)
	{
		int[] arr = { 19,11,4,45,60};
		int large = arr[0];
		for(int i=1; i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		System.out.println("the largest number in an array is :" + "  " + large);
	}

}