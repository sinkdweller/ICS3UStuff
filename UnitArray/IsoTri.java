import java.io.*;
public class IsoTri {

	public static void main(String[] args)throws IOException {
		IsoTri ME1 = new IsoTri();
		int side = ME1.ask("Please enter a side!");
		for(int i=1; i<=side; i++) {
			ME1.drawLine(i);
		}

	}
	public int ask(String askWhat)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		System.out.println(askWhat);
		return Integer.parseInt(br.readLine());
		
	}
	public void drawLine(int width) {
		for(int i=1; i<=width; i++) {
			System.out.print("#");
		}
		System.out.println("");
	}

}
