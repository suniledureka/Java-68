package co.edureka.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FileRead 
{
	public static void main(String[] args) throws Exception
	{
	  FileInputStream fin = new FileInputStream("src/co/edureka/io/java.txt");
	  /*
	  System.out.println("No of bytes to read = "+fin.available());
	  System.out.println((char)fin.read());
	  System.out.println(fin.read());
	  System.out.println("No of bytes to read = "+fin.available());
	  */
	  
	  /*
	  //to read file contents byte-by-byte
	  int n= fin.read();
	  while(n != -1) {
	    System.out.print((char)n);
	    Thread.sleep(120);
	    n = fin.read();
	  }
	  */
	  
	  /*
	  //to read file contents completely
	  byte[] b = new byte[fin.available()]; //creates byte[] with size of file
	  fin.read(b);
	  String str = new String(b);
	  System.out.println(str);
	  */
	  
	  /*
	  //read file contents line-by-line
	  InputStreamReader source = new InputStreamReader(fin); //to convert byte stream to character stream
	  BufferedReader br = new BufferedReader(source);
	  String line = br.readLine();
	  while(line != null) {
		  System.out.println(line);
		  Thread.sleep(2000);
		  line = br.readLine();
	  }	  
	  */
	  
	  //display file contents word by word
	  InputStreamReader source = new InputStreamReader(fin); //to convert byte stream to character stream
	  BufferedReader br = new BufferedReader(source);
	  String line = br.readLine();
	  while(line != null) {
		  //System.out.println(line);
		  StringTokenizer st = new StringTokenizer(line);
		  while(st.hasMoreElements()) {
			  System.out.println(st.nextToken());
			  Thread.sleep(200);
		  }
		  Thread.sleep(2000);
		  line = br.readLine();
	  }	  
	  fin.close();
	  br.close();
	}
}
