package Strings;

public class MaximumNumberofWordsFoundinSentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "please wait", "continue to fight", "continue to win" };
		System.out.println(mostWordsFound(arr));
	}

	static int mostWordsFound(String[] sentences) {
		int n = sentences.length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < sentences[i].length(); j++) {
				if (sentences[i].charAt(j) == ' ')
					count++;
			}
			if (count > ans)
				ans = count;
		}
		return ans + 1;
	}

}
