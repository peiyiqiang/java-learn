package chapter10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件拷贝
 * use InputStream and Output Stream
 * @author pYq
 *
 */
public class TestFileCopy {
	public static void main(String[] args) {
		fileCopy("src/chapter10/TestFileCopy.java", "src/chapter10/dest.txt");

	}

	public static void fileCopy(String srcPath, String destPath) {
		File src = new File(srcPath);
		File dest = new File(destPath);

		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(src);
			out = new FileOutputStream(dest);

			byte[] flush = new byte[1024]; //缓冲容器
			int len = -1;
			while((len = in.read(flush)) != -1) {
				out.write(flush, 0, len);
			}
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//分别关闭 先打开后关闭
			try {
				if(out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if(in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
