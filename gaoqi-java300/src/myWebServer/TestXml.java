package myWebServer;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class TestXml {
	public static void main(String[] args) throws Exception {
		//SAX解析xml文件
		//1.获取解析工厂
		SAXParserFactory factory = SAXParserFactory.newInstance();

		//2.从解析工厂获取解析器
		SAXParser parser = factory.newSAXParser();

		//3.编写并加载处理器
		PHandler handler = new PHandler();

		//4.解析
		parser.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("test.xml"), handler);
	}
}

class PHandler extends DefaultHandler {
	@Override
	public void startDocument() throws SAXException {
		System.out.println("解析开始");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println(qName+"解析开始");
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String contents = new String(ch, start, length);
		System.out.println("**"+contents);
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println(qName+"解析结束");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("解析结束");
	}
}