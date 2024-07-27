import java.io.*;
public class test {
	
	static final char[] ALPHORDER = {'a', 'b','c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w','x', 'y', 'z'};

	public static void main(String[] args)throws IOException {

		String test[] ={"hey", "blunt", "apple", "burd"};
		test MEE = new test();
		
	}
		

	

	static public boolean higherWord(String a, String b) {
		int cindx = 0;
		if(a.equals(b))//same word case
			return true; 
		
		while(a.charAt(cindx) == b.charAt(cindx)) {
			if(cindx < a.length()-1 && cindx < b.length()-1)
				cindx ++;
		}
		char charA = a.charAt(cindx);
		char charB = b.charAt(cindx);
		
		for(byte i =0; i< ALPHORDER.length; i++) {
			if(charA == ALPHORDER[i])
				return true;
			if(charB == ALPHORDER[i])
				return false;

		}
		return true;
	}
	public String[] Change(String arr[]) {
		arr = new String[1];
		return arr;
	}
	public void bubbleSort(String arr[]) {
		boolean flag = true;
		for(int i =0; i< arr.length; i++) {
			for(int j =0; (j< (arr.length -1)-i);j++) {
				if(higherWord(arr[j+1], arr[j])) { //if arr[j+1] is alphabetically in front of j, move forward
					flag = false;
					String temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			if (flag == true)
				break;
			else
				flag = true;
		}
	}
	

}


