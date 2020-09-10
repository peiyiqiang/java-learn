package chapter12;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * TCP客户端
 * 1.使用Socket创建客户端  需指定服务器的地址和端口   创建好客户端的同时建立于服务器的连接
 * 2.操作：输出输入流操作
 * 3.释放资源
 * @author pYq
 *
 */
public class TestTCPClient {
	public static void main(String[] args) throws IOException {
		System.out.println("TCP client");

		Socket client = new Socket("localhost", 8888);

		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		String data = "TCP test";
		out.writeUTF(data);
		out.flush();

		out.close();
		client.close();
	}
}