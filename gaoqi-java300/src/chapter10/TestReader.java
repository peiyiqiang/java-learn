package chapter10;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

//按字符读取
public class TestReader {
	public static void main(String[] args) {
		//Step 1:
		File src = new File("src/chapter10/src.txt");

		//Step 2:
		Reader in = null;
		try {
			in = new FileReader(src);

			//Step 3:
			char[] flush = new char[1024]; //缓冲容器
			int len = -1;
			while((len = in.read(flush)) != -1) {
				String str = new String(flush, 0, len);
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
