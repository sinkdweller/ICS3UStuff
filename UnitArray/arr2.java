import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class arr2 {
	final byte SIZE = 15;
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		arr2 ME12 = new arr2();
		
		double arr[] = new double[ME12.SIZE];
		System.out.println("please enter 15 double numbers");
		arr = ME12.fillArray();
		
		double sum = 0;
		double largestNum = arr[0];
		double smallestNum = arr[0];
		double mean = sum/arr.length;
		int aboveAvg =0;
		int Avg=0;
		int belowAvg=0;
		int maxCount=0;
		double maxCountNum = arr[0];
		for(int i=0; i<arr.length; i++) {
			largestNum = ME12.compareLarger(arr[i], largestNum);
			smallestNum = ME12.compareSmaller(arr[i], smallestNum);
			
			if(arr[i] > mean) 
				aboveAvg++;
			else if(arr[i]<mean)
				belowAvg++;
			else
				Avg ++;
			
			int numCount = 0;

			for(int ii = 0; ii< arr.length; ii++) {
				if( arr[i] == arr[ii])
					numCount ++;
			}
			if (numCount >=maxCount) {
				maxCountNum = arr[i];
				maxCount = numCount;
			}
		}
		System.out.println(maxCountNum + "was entered " + maxCount + "times");
		System.out.println("Largest number entered was " + largestNum);
		System.out.println(belowAvg + "numbers were belowAvg");
		System.out.println(aboveAvg + "numbers were above Avg");
		System.out.println(Avg + "numbers were at Avg");


	}
	
	public double[] fillArray()throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double array[] = new double[SIZE];
		for(byte i=0;i<SIZE; i++) {
			array[i] = Double.parseDouble(br.readLine());
		}
		return array;
	}
	
	public double compareLarger(double num, double num2) {
		if(num2 >= num) {
			return num2;
		}
		else
			return num;
	}
	
	public double compareSmaller(double num, double num2) {
		if(num2 <= num) {
			return num2;
		}
		else
			return num;
	}
	


	public double AskNum(String args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(args);
		return Double.parseDouble(br.readLine());
	}

}

