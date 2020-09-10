package chapter10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//按字符写出
public class TestWriter {
	public static void main(String[] args) {

		File dest = new File("src/chapter10/dest.txt");

		Writer out = null;
		try {
			out = new FileWriter(dest);

			String str = "Test Writer";
//			char[] dates = str.toCharArray();
//			out.write(dates, 0, dates.length);
			out.write(str);
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}