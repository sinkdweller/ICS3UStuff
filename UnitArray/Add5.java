import java.io.*;

public class Add5 {

	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Add5 Me1 = new Add5();
        int budget = Integer.parseInt(br.readLine());
        budget = Me1.add5(budget);
        System.out.println(budget);
        

	}
	public int add5(int num1) {
		return num1 += 5; 
	}

}
