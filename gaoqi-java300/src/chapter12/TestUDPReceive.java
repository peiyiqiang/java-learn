package chapter12;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP接收端
 * 1.使用DatagramSocket 指定端口 创建接收端
 * 2.准备容器 封装成DatagramPacket包裹
 * 3.阻塞式接收包裹 DatagramSocket.receive(DatagramPacket p);
 * 4.分析数据 byte[] DatagramPacket.getData();
 * 5.释放资源
 * @author pYq
 *
 */
public class TestUDPReceive {
	public static void main(String[] args) throws IOException {
		System.out.println("UDP receive");

		DatagramSocket UDPReceive = new DatagramSocket(9999);

		byte[] container = new byte[1024 * 60];
		DatagramPacket packet = new DatagramPacket(container, 0, container.length);

		UDPReceive.receive(packet);

		byte[] datas = packet.getData();
		System.out.println(new String(datas));

		UDPReceive.close();
	}
}