package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Decrypt {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/newFile"));
			
			String line = br.readLine();
			String decryptedMessage = "";
			for(int i = 0; i < line.length(); i++) {
				char letter = line.charAt(i);
				decryptedMessage += letter;
			}
			System.out.println(decryptedMessage);
			
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
//©: Mitt Romney, 1741