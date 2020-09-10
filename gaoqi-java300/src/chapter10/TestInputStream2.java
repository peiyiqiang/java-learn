package chapter10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 每次读取多个字节(eg:1kb即1024bytes)
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放
 * @author pYq
 *
 */

public class TestInputStream2 {
	public static void main(String[] args) {
		//Step 1:
		File src = new File("src/chapter10/src.txt");

		//Step 2:
		InputStream in = null;
		try {
			in = new FileInputStream(src);

			//Step 3:
			byte[] flush = new byte[1024]; //缓冲容器
			int len = -1;
			while((len = in.read(flush)) != -1) {
				String str = new String(flush, 0, len);//解码
				System.out.print(str);
			}

		} catch (IOException e) {
			e.printStackTrace();

		}finally {
			//Step 4:
			try {
				if(in != null)
					in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
