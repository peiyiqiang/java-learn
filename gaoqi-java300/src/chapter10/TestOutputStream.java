package chapter10;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//按字节写出
public class TestOutputStream {
	public static void main(String[] args) {

		File dest = new File("src/chapter10/dest.txt");

		OutputStream out = null;
		try {
			out = new FileOutputStream(dest, true);

			String str = "Test Output Stream";
			byte[] dates = str.getBytes(); //编码
			out.write(dates, 0, dates.length);
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
