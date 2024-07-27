import java.io.*;
public class hollowRectangle {

	public static void main(String[] args) throws IOException{
		
		hollowRectangle ME1 = new hollowRectangle();
		int width = ME1.ask("enter a width");
		int height = ME1.ask("enter a height");
		
		ME1.drawSolid(width);
		for(int i = 3; i<= height; i++) {
			ME1.drawEmpty(width);
		}
		ME1.drawSolid(width);
		
	}
	public int ask(String askWhat)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(askWhat);
		return Integer.parseInt(br.readLine());
	}
	public void drawSolid(int width) {
		for(int i=1; i<= width; i++) {
			System.out.print("&");
			
		}System.out.println("");
	}
	
	public void drawEmpty(int width) {
		for(int i=1; i<=width; i++) {
			if(i ==1 || i==width) {
				System.out.print("&");
			}
			else
				System.out.print(" ");
		}
		System.out.println("");
	}
	
	

}
