package Lab3Ex.Ex2_comp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class ComparatorInput {
	public static void main(String[] args) throws InterruptedException, IOException {

		File file = new File("C:\\Users\\draga\\Documents\\College\\Year 4\\Sem 1\\Distributed Control Systems\\DCS_Lab_Dragan_Lucian_30343\\Lab1\\src\\main\\java\\Lab3Ex\\Ex2_comp\\comparator.txt");
		Files.deleteIfExists(file.toPath());
		FileWriter fw = new FileWriter(file.getPath());
		Float f1, f2;
		for (float i = 0; i < 50; i++) {
			f1 = (float) Math.sin(Math.toRadians(i * 360 / 50));
			f2 = (float) Math.cos(Math.toRadians(i * 360 / 50));

			fw.write("P0:" + f1 + "F" + "," + "P1:" + f2 + "F\n");
		}
		fw.close();
		System.out.println("Done!");
	}
}
