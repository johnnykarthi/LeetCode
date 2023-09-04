package Arrays;
import java.util.*;
public class RotateImage90Degree2Dmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		rotate(arr);
	}
	
	static void rotate(int[][] arr) {
		for(int i =0;i<=arr.length/2;i++)
		{
			for(int j =i+1;j<arr[i].length;j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i =0;i<arr.length;i++)
		{
			int k = arr[i].length-1;
			for(int j =0;j<arr[i].length/2;j++)
			{
				int temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] = temp;
				k--;
			}
		}
		
		System.out.println(Arrays.deepToString(arr));
    }
}
