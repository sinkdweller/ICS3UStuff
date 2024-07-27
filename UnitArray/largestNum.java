import java.io.*;

public class largestNum {

	public static void main(String[] args)throws IOException {
		largestNum ME1 = new largestNum();
		int largestNum = ME1.AskForNum();
		
		for(int i = 0; i<=10; i++) {
			largestNum = ME1.compareNum(largestNum, ME1.AskForNum());
		}
		
		System.out.println(largestNum);
	}
	
	public int AskForNum() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter a number");
		return Integer.parseInt(br.readLine());
	}
	
	public int compareNum(int num1, int num2) {
		if(num1 > num2) {
			return num1;
		}
		else
			return num2;
	}

}
