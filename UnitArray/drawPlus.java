import java.io.*;
public class drawPlus {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		drawPlus ME1 = new drawPlus();
		int times = ME1.askNum();
		for(int i=1; i<=times; i++) {
			ME1.drawLine();
		}
		

	}
	public int askNum()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return Integer.parseInt(br.readLine());
	}
	public void drawLine() {
		System.out.println("+++++++++++");
	}

}
