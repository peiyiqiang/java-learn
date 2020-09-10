package chapter10;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组输入
 * 1.字节数组不要太大
 * 2.释放资源可以不用处理(不用close())
 * @author pYq
 *
 */
public class TestByteArrayInputStream {
	public static void main(String[] args) {

		byte[] src = "Talk is cheap, show me the code".getBytes();

		InputStream in = new ByteArrayInputStream(src);

		try {
			byte[] flush = new byte[1024]; //缓冲容器
			int len = -1;
			while((len = in.read(flush)) != -1) {
				String str = new String(flush, 0, len);
				System.out.print(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}