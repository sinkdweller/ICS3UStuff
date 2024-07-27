import java.io.*;
public class JAVAMETHOD {

	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter two numbers to be added");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		JAVAMETHOD fME1 = new JAVAMETHOD();
		int result = fME1.sum(num1, num2);
		System.out.println(result);
		
		

	}
	public int sum (int num1, int num2) {
		return num1 + num2;
		
	}

}
