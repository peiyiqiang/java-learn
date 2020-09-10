package chapter10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 每次读取一个字节
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放
 * @author pYq
 *
 */

public class TestInputStream {
	public static void main(String[] args) {
		//Step 1:
		File src = new File("src/chapter10/src.txt");

		//Step 2:
		InputStream in = null;
		try {
			in = new FileInputStream(src);

			//Step 3:
			int temp;
			while((temp = in.read()) != -1) {
				System.out.print((char)temp);
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
