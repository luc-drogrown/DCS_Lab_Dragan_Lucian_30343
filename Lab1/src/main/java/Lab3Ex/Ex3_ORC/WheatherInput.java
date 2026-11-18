package Lab3Ex.Ex3_ORC;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

//For testing the PI controller alone
public class WheatherInput {
	public static void main(String[] args) throws InterruptedException, IOException {
		File plant = new File("C:\\Users\\draga\\Documents\\College\\Year 4\\Sem 1\\Distributed Control Systems\\DCS_Lab_Dragan_Lucian_30343\\Lab1\\src\\main\\java\\Lab3Ex\\Ex3_ORC\\OutsideTemp.txt");
		Files.deleteIfExists(plant.toPath());

		File RTC = new File("C:\\Users\\draga\\Documents\\College\\Year 4\\Sem 1\\Distributed Control Systems\\DCS_Lab_Dragan_Lucian_30343\\Lab1\\src\\main\\java\\Lab3Ex\\Ex3_ORC\\RTC.txt");
		Files.deleteIfExists(RTC.toPath());

		File HTC = new File("C:\\Users\\draga\\Documents\\College\\Year 4\\Sem 1\\Distributed Control Systems\\DCS_Lab_Dragan_Lucian_30343\\Lab1\\src\\main\\java\\Lab3Ex\\Ex3_ORC\\HTC.txt");
		Files.deleteIfExists(HTC.toPath());

		File ORC = new File("C:\\Users\\draga\\Documents\\College\\Year 4\\Sem 1\\Distributed Control Systems\\DCS_Lab_Dragan_Lucian_30343\\Lab1\\src\\main\\java\\Lab3Ex\\Ex3_ORC\\ORC.txt");
		Files.deleteIfExists(ORC.toPath());

		// Scenarios:
		float winterDay[] = new float[] { -12.5F / 25, -15.0F / 25, -17.0F / 25, -20.0F / 25, -21.0F / 25, -19.0F / 25,
				-17.0F / 25, -15.0F / 25, -12.0F / 25, -8.0F / 25, -7.0F / 25, -5.0F / 25, -4.0F / 25, -3.5F / 25,
				-5.0F / 25, -4.0F / 25, -5.0F / 25, -6.0F / 25, -7.5F / 25, -8.5F / 25, -9.0F / 25, -11.0F / 25,
				-11.5F / 25, -12.0F / 25, -12.0F / 25 };

		float winterMorning[] = new float[] { -19.0F / 25, -18.5F / 25, -18.0F / 25, -17.5F / 25, -17.0F / 25,
				-16.5F / 25, -16.0F / 25, -15.5F / 25, -15.0F / 25, -14.5F / 25, -14.0F / 25, -13.5F / 25, -13.0F / 25,
				-12.5F / 25, -12.0F / 25 };

		float extermeEvening[] = new float[] { -5.0F / 25, -6.0F / 25, -8.0F / 25, -10.0F / 25, -12.0F / 25,
				-13.0F / 25, -14.0F / 25, -16.0F / 25, -18.0F / 25, -22.0F / 25, -27.0F / 25 };
		// -------------------------------

		float roomReference = 24 / 25F;
		float waterReference = 48 / 70F;

		FileWriter fwPlant = new FileWriter(plant.getPath());
		FileWriter fwRTC = new FileWriter(RTC.getPath());
		FileWriter fwHTC = new FileWriter(HTC.getPath());
		FileWriter fwORC = new FileWriter(ORC.getPath());

		for (int i = 0; i < winterDay.length; i++) {
			fwPlant.write("v1:" + winterDay[i] + "F\n");
			fwRTC.write("P1:" + roomReference + "F\n");
			fwHTC.write("P1:" + waterReference + "F\n");
			fwORC.write("P1:" + winterDay[i] + "F\n");
		}

		fwPlant.close();
		fwRTC.close();
		fwHTC.close();
		fwORC.close();
		System.out.println("Done!");
	}
}
