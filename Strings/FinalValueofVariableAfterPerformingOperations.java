package Strings;

public class FinalValueofVariableAfterPerformingOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"++X","++X","X++"};
		System.out.println(finalValueAfterOperations(arr));
	}

	static int finalValueAfterOperations(String[] operations) {
		int x =0;
		for(int i =0;i<operations.length;i++)
		{
			if(operations[i].equals("X++") || operations[i].equals("++X"))
				x++;
			else
				x--;
		}
		return x;
	}

}
