package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

public class Copywriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);
			
			fw.write("Copyright My Dog");
				
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
