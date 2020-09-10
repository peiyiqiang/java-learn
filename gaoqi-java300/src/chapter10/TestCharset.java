package chapter10;

import java.io.UnsupportedEncodingException;

public class TestCharset {
	public static void main(String[] args) throws UnsupportedEncodingException {
		//testEncode();
		testDecode();

	}

	//from String to byte array 
	public static void testEncode() throws UnsupportedEncodingException {
		String str = "编码测试EncodeTest";//4 Chinese characters and 10 English characters

		byte[] bytes = str.getBytes(); //use default charset: GBK
		System.out.println(bytes.length);//Chinese: 2bytes English: 1byte
		for(byte b: bytes)
			System.out.print(b);
		System.out.println();

		bytes = str.getBytes("UTF-8");
		System.out.println(bytes.length);//Chinese: 3bytes English: 1byte

		bytes = str.getBytes("UTF-16LE");
		System.out.println(bytes.length);//2 bytes each character
	}

	//from byte array to String
	public static void testDecode() throws UnsupportedEncodingException {
		String str = "解码测试DecodeTest";//4 Chinese characters and 10 English characters
		byte[] bytes = str.getBytes(); //ENCODE use default charset: GBK

		str = new String(bytes); //use default charset
		System.out.println(str);

		str = new String(bytes, 0, bytes.length, "gbk");
		System.out.println(str);

		//garbled code
		//case 1: wrong charset
		str = new String(bytes, "utf8");
		System.out.println(str);

		//case 2:no enough bytes
		str = new String(bytes, 0, 7, "gbk");
		System.out.println(str);
	}
}