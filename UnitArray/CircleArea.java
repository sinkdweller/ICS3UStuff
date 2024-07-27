import java.io.*;
public class CircleArea {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter a circle radius");
        int radius = Integer.parseInt(br.readLine());
        
        CircleArea ME1 = new CircleArea();
        System.out.println("the area is: " + ME1.Calculate(radius));
	}
	public double Calculate(int radius) {
		return 3.14159*radius*radius;
	}

}
