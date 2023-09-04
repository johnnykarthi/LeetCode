package Arrays;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(maxArea1(arr));
	}

	// Method 1
	static int maxArea(int[] height) {
		int ans = 0;
		int n = height.length - 1;
		for (int i = 0; i <= n; i++) {
			for (int j = i + 1; j <= n; j++) {
				int min = height[i] < height[j] ? height[i] : height[j];
				int k = min * (j - i);
				if (k > ans)
					ans = k;
			}
		}
		return ans;
	}

	// Method 2
	static int maxArea1(int[] height) {
		int ans = 0;
		int i = 0;
		int j = height.length - 1;
		while (i <= j) {
			int min = height[i] < height[j] ? height[i] : height[j];
			int k = min * (j - i);
			if (k > ans)
				ans = k;
			if (height[i] < height[j])
				i++;
			else
				j--;
		}
		return ans;
	}
}
