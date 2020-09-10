package chapter12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

/**
 * UDP发送端
 * 1.使用DatagramSocket 指定端口 创建发送端
 * 2.准备数据 转成字节数组
 * 3.封装成DatagramPacket包裹      需指定目的地 new InetSocketAddress(hostname,port)
 * 4.发送包裹 DatagramSocket.send(DatagramPacket p)
 * 5.释放资源
 * @author pYq
 *
 */
public class TestUDPSend {
	public static void main(String[] args) throws IOException {
		System.out.println("UDP send");

		DatagramSocket udpSend = new DatagramSocket(8888);

		String data = "UDP test";
		byte[] datas = data.getBytes();

		DatagramPacket packet = new DatagramPacket(datas, 0, datas.length,
				new InetSocketAddress("localhost",9999));

		udpSend.send(packet);

		udpSend.close();
	}
}