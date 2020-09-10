package chapter10;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件拷贝到字节数组
 * 字节数组拷贝到文件
 * @author pYq
 *
 */
public class TestStream {
	public static void main(String[] args) {

		byte[] result = fileToByteArray("src/images/desk.jpg");
		System.out.println(result.length);

		byteArrayToFile(result, "src/chapter10/result.jpg");


	}

	public static byte[] fileToByteArray(String filePath) {

		File src = new File(filePath);

		FileInputStream in = null;
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			in = new FileInputStream(src);

			byte[] flush = new byte[1024];
			int len = -1;
			while((len = in.read(flush)) != -1) {
				out.write(flush, 0, len);
			}
			out.flush();

			return out.toByteArray();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static void byteArrayToFile(byte[] src, String filePath) {

		File dest = new File(filePath);

		ByteArrayInputStream in = new ByteArrayInputStream(src);
		FileOutputStream out = null;
		try {
			out = new FileOutputStream(dest);

			byte[] flush = new byte[1024];
			int len = -1;
			while((len = in.read(flush)) != -1) {
				out.write(flush, 0, len);
			}
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}