package co.edureka.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) throws Exception{
		File file = new File("src/co/edureka/io/edureka.txt");
		//FileOutputStream fout = new FileOutputStream(file);
		FileOutputStream fout = new FileOutputStream(file, true); //appending mode
		String str = "edureka is into online trainings";
		byte[] b = str.getBytes(); //convert string to byte[]
		fout.write(b);
		fout.close();
		
		/*
		FileWriter fw = new FileWriter(file);
		
		String str = "edureka is into online trainings";
		fw.write(str);
		
		fw.close();
		*/
	}
}
