package practice;

public class SecLarge {
	public static void main(String[] args) {
		int arr[] = { 2, 4, 8, 6, 9 };
		int large = arr[0];
		int seclarge = arr[1];
		if (seclarge > large) {
			int temp = large;
			large = seclarge;
			seclarge = temp;
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > large) {
				
				seclarge = large;
				large = arr[i];
			} else if (arr[i] > seclarge && arr[i]<large) {
				seclarge = arr[i];
			}
		}
		System.out.println("the second highest is " + ":" + " " + seclarge);

	}

}