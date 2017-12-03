package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class Copyright {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/Encrypt.java", true);
			FileWriter fw1 = new FileWriter("src/intro_to_file_io/Decrypt.java", true);
			FileWriter fw2 = new FileWriter("src/intro_to_file_io/Copyright.java", true);
			FileWriter fw3 = new FileWriter("src/intro_to_file_io/IntroToFileIO.java", true);
			
			fw.write("//©: Mitt Romney, 1741");
			fw1.write("//©: Mitt Romney, 1741");
			fw2.write("//©: Mitt Romney, 1741");
			fw3.write("//©: Mitt Romney, 1741");
				
			fw.close();
			fw1.close();
			fw2.close();
			fw3.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}//©: Mitt Romney, 1741