package chapter10;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TestFileUtils {
	public static void main(String[] args) {
		//文件到文件
		try {
			FileInputStream in = new FileInputStream("src/chapter10/TestFileCopy.java");
			FileOutputStream out = new FileOutputStream("src/chapter10/dest.txt");
			copy(in, out);
		} catch (IOException e) {
			e.printStackTrace();
		}

		byte[] dates = null;

		//文件到字节数组
		try {
			FileInputStream in = new FileInputStream("src/images/desk.jpg");
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			copy(in, out);
			dates = out.toByteArray();
			System.out.println(dates.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//字节数组到文件
		try {
			ByteArrayInputStream in = new ByteArrayInputStream(dates);
			FileOutputStream out = new FileOutputStream("src/chapter10/result.jpg");
			copy(in, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void copy(InputStream in, OutputStream out) {
		try {

			byte[] flush = new byte[1024]; //缓冲容器
			int len = -1;
			while((len = in.read(flush)) != -1) {
				out.write(flush, 0, len);
			}
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			close(in, out);
		}
	}

	public static void close(Closeable... clos) {
		for(Closeable clo: clos) {
			try {
				if(clo != null)
					clo.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}