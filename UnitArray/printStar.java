import java.io.*;
public class printStar {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		printStar MEE1 = new printStar();
		int times = MEE1.askNums();
		
	}
	public int askNums()throws IOException {
		System.out.println("Pleasae enter stars");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b;
		while(true) {
			try {
				b = Integer.parseInt(br.readLine());
				return b;
				
			}catch(NumberFormatException e) {
				System.out.println("please enter a positive number");
			}
		}
		
		
		
	}
	
	public void drawStuffs(int times) {
		for(int i=1; i<=times; i++) {
			System.out.println("*");
		}
	}

}
