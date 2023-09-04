package Arrays;

public class SmallPositiveMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 10, -5, 15, 2, 10 };
		MissingElement(arr);

	}

	static void MissingElement(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		for (int i = 1; i <= max; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j])
					count++;
			}
			if (count == 0) {
				System.out.println("Missing Number:" + i);
				break;
			}
		}
	}

}
