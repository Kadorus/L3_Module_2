package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Encryptor {
	
	public static void main(String[] args) {
	
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/newFile.txt");
		
			String message = JOptionPane.showInputDialog("Enter a message");
			
			String encryptedMessage = "";
			
			for(int i = 0; i < message.length(); i++) {
				char letter = message.charAt(i);
				letter += 7;
				encryptedMessage += letter;
			}
			
			fw.write(encryptedMessage);
			
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	
}
