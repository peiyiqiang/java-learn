package chapter12;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务器
 * 1.指定端口 使用ServerSocket创建服务器
 * 2.阻塞式等待连接Socket ServerSocket.accept();
 * 3.操作：输出输入流操作
 * 4.释放资源
 * @author pYq
 *
 */
public class TestTCPServer {
	public static void main(String[] args) throws IOException {
		System.out.println("TCP server");

		ServerSocket server = new ServerSocket(8888);

		Socket socket = server.accept();
		System.out.println("client connected");

		DataInputStream in = new DataInputStream(socket.getInputStream());
		String data = in.readUTF();
		System.out.println(data);

		in.close();
		socket.close();

		server.close();
	}
}