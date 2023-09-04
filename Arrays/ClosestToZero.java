package Arrays;

import java.util.*;

public class ClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, -12, 15, 5, -4};
		System.out.println(Arrays.toString(Closest(arr)));
	}

	static int[] Closest(int[] arr) {
		int[] ans = new int[2];
		int l = 0, m = 0, p = 0, q = 0;
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if (sum < 0) {
					if (sum > min) {
						min = sum;
						l = i;
						m = j;
					}
				} else {
					if (sum < max) {
						max = sum;
						p = i;
						q = j;
					}
				}
			}
			if (Math.abs(min) < max) {
				ans[0] = arr[l];
				ans[1] = arr[m];
			} else {
				ans[0] = arr[p];
				ans[1] = arr[q];
			}
		}
		return ans;
	}
}
