import java.io.*;
public class array {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String words[] = new String[] {"sat", "hit", "walks", "jumps", "bites", "you", "i", "he", "she", "they"};
		array ME1 = new array();
		String word1 = words[ME1.AskNum("Enter a number between 1 and 4")];
		String word2 = words[ME1.AskNum("Enter a number between 1 and 4")];
		String word3 = words[ME1.AskNum("Enter a number between 5 and 9")];
		String word4 = words[ME1.AskNum("Enter a number between 5 and 9")];
		
		System.out.println(word1 +" " +word2 +" " +word3 +" "+ word4);

	}
	public int AskNum(String args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(args);
		return Integer.parseInt(br.readLine());
	}

}
