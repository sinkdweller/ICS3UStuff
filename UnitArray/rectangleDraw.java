import java.io.*;
public class rectangleDraw {

	public static void main(String[] args)throws IOException {
		
		rectangleDraw ME1 = new rectangleDraw();
		ME1.drawRect(ME1.askNum(), ME1.askNum());
		
	}
	public int askNum() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a number");
		return Integer.parseInt(br.readLine());
	}
	public void drawRect(int width, int height) {
		for(int i=1; i<=height; i++) {
			for(int ii=1; ii<=width; ii++) {
				System.out.print("&");
			}
			System.out.println("");
		}
	}

}
