package chapter10;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

//字节数组输出
public class TestByteArrayOutputStream {
	public static void main(String[] args) {

		byte[] dest = null;

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		String str = "Talk is cheap, show me the code";
		byte[] dates = str.getBytes();
		out.write(dates, 0, dates.length);

		try {
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}

		dest = out.toByteArray();
		System.out.println(new String(dest));
	}
}