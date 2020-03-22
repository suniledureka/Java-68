package co.edureka.io;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileWrite {

	public static void main(String[] args) throws Exception{
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt", true); //appending mode
		
		String str = "edureka is into online training services.";
		byte[] b = str.getBytes(); //to convert String to byte[]
		
		fout.write(b);
		System.out.println("file created!");
		fout.close();
		
		FileWriter fw = new FileWriter("src/co/edureka/io/edureka.txt");
		fw.write("ABCDEFG");
		fw.close();
	}
}
