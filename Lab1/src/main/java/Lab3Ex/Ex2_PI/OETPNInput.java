package Lab3Ex.Ex2_PI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

//For OETPN-c 
public class OETPNInput {
	public static void main(String[] args) throws InterruptedException, IOException {
		File file = new File("C:\\Users\\draga\\Documents\\College\\Year 4\\Sem 1\\Distributed Control Systems\\DCS_Lab_Dragan_Lucian_30343\\Lab1\\src\\main\\java\\Lab3Ex\\Ex2_PI\\OETPNInput.txt");
		Files.deleteIfExists(file.toPath());
		FileWriter fw = new FileWriter(file.getPath());
		Float command = 0.55F;

		for (float i = 0; i < 100; i++) {
			if (i > 50)
				command = 0.35f;

			fw.write("r:" + command + "F\n");
		}
		fw.close();
		System.out.println("Done!");
	}
}
