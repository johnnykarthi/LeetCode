package Strings;
import java.util.*;
class JewelsandStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jewels = "aAA";
		String stones = "aAAAbbbb";
		System.out.println(numJewelsInStones1(jewels,stones));

	}

	static int numJewelsInStones(String jewels, String stones) {
		int count=0;
		for(int i =0;i<jewels.length();i++)
		{
			char k = jewels.charAt(i);
			for(int j =0;j<stones.length();j++)
			{
				char m = stones.charAt(j);
				if(k == m)
					count++;
			}
		}
		return count;
	}
	static int numJewelsInStones1(String jewels, String stones) {
        int[] count = new int[128];
        for(int i=0;i<stones.length();i++){
            count[stones.charAt(i)]++;
        }
        int ans = 0;
        for(int i=0;i<jewels.length();i++){
            ans += count[jewels.charAt(i)];
        }
        return ans;
    }

}
