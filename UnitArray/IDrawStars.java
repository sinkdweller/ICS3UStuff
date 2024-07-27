import java.io.*;
public class IDrawStars {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		System.out.println("I draw stars. ho many you want?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int howMany= Integer.parseInt(br.readLine());
        
        IDrawStars drawStuff = new IDrawStars();
        drawStuff.drawStar(howMany);
        }
	public void drawStar(int num) {
		for(int i = 1; i<=num; i++) {
			System.out.print("*");
		}
	}

}
