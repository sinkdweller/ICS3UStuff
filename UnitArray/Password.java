import java.io.*;
public class Password {

	public static void main(String[] args)throws IOException {
		Password AskPass = new Password();
		AskPass.AskPassword();
	}
	
	public void AskPassword() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int times = 0;
		String password; 
		
		while(times <3) {
			times ++;
			System.out.print("What's the password cuh");
			password = br.readLine();
			if(password.equals("Cuh! Bluuh!")) {
				System.out.println("Yarrr!");
				return;
			}
			
		}
		System.out.println("Wrong hahrh!!!! goodbye");
		return;
	}

}
