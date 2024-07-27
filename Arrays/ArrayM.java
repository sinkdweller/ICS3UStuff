import java.io.*;
public class ArrayM {
	public static void main(String[] args)throws IOException {
		String line;

		
		BufferedReader input;
		input = new BufferedReader(new FileReader("/Users/evelynnlu/Desktop/Filestuff/temptemp.txt"));
		line = input.readLine();
		while (line!=null) {
			line = input.readLine();
			System.out.println(line);
		
		}
	}

}
