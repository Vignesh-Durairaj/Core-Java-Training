package cg.javaflp.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InOutPrac {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("d:/inFile.txt");
			out = new FileOutputStream("d:/outFile.txt");
			int c;
			while((c = in.read()) != -1){
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (in != null){
				in.close();
			}
			if (out != null){
				out.close();
			}
		}
		System.out.println("done");
	}

}
