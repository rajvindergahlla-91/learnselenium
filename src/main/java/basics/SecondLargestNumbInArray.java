package basics;

public class SecondLargestNumbInArray {
	
	public static void main(String[] args)
	{
		int[] arr= { 10,5,20,8,15 };
		int large = arr[0];
		int secLarge= arr[1];
		
		if(secLarge>large)
		{
			int temp = large;
			large= secLarge;
			secLarge=temp;
		}
		for (int i = 2 ; i<arr.length;i++)
		{
			if(arr[i]> large)
			{
				large=secLarge;
				large=arr[i];
			}
			else if(arr[i]> secLarge && arr[i]<large) {
				secLarge=arr[i];
			}
		}
		System.out.println("second largest is : " + secLarge);
	}

}
