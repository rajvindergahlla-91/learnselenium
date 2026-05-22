package basics;

public class SecondLargestNumbInArray {

	public static void main(String[] args) {
		int[] arr = {10,15,8,20,14};                                            //{ 10, 5, 20, 8, 15 };
		int large = arr[0];
		int secLarge = arr[1];

		if (secLarge > large) {
			int temp = large;
			large = secLarge;
			secLarge = temp;
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > large) {
			    secLarge= large;
				large = arr[i];
			} else if (arr[i] > secLarge && arr[i] < large) {
				secLarge = arr[i];
			}
		}
		System.out.println("second largest is : " + secLarge);
	}

	/*
	 * public static void main(String[] args) { int[] arr = {10,15,8,20,14}; int
	 * large = arr[0]; int seclarge = arr[1]; if(seclarge>large) { int temp= large;
	 * large= seclarge; seclarge=temp; } for(int i=2; i<arr.length;i++) {
	 * if(arr[i]>large) { large= seclarge; large=arr[i];
	 * 
	 * } else if(arr[i]>seclarge && arr[i]<large) { seclarge=arr[i]; }
	 * 
	 * } System.out.println("the largest number is: " + large + "  " + "and" +
	 * "second largest number is :" + seclarge); }
	 */
}
