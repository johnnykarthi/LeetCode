package Arrays;

public class NextGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 10, 9, 6, 13 };
		GreatestNumber(arr);
	}

	static void GreatestNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int max = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (max < arr[j]) {
					max = arr[j];
					break;
				}
			}
			if (max > arr[i])
				System.out.print(max + " ");
			else
				System.out.print(-1 + " ");
		}
	}

}
