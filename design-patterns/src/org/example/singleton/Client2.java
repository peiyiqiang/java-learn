package org.example.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * *测试反射和反序列化漏洞
 *
 * @author pYq
 */
public class Client2 {
	public static void main(String[] args) throws Exception {
		//反射漏洞
		Class<Singleton02> clazz = (Class<Singleton02>) Class.forName("org.example.singleton.Singleton02");
		Constructor<Singleton02> c = clazz.getDeclaredConstructor(null);
		c.setAccessible(true);
		
		Singleton02 s1 = c.newInstance();
		Singleton02 s2 = c.newInstance();
		
		System.out.println("s1:" + s1);
		System.out.println("s2:" + s2);
		
		//防止反射漏洞
		/*
		Class<Singleton02v2> clazz2 = (Class<Singleton02v2>) Class.forName("org.example.singleton.Singleton02v2");
		Constructor<Singleton02v2> c2 = clazz2.getDeclaredConstructor(null);
		c2.setAccessible(true);

		Singleton02v2 s3 = c2.newInstance();
		Singleton02v2 s4 = c2.newInstance();

		System.out.println("s3:" + s3);
		System.out.println("s4:" + s4);
		 */

		//反序列化漏洞
		Singleton02 s5 = Singleton02.getInstance();
		FileOutputStream fos = new FileOutputStream("design-patterns/src/org/example/singleton/test.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s5);
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("design-patterns/src/org/example/singleton/test.txt"));
		Singleton02 s6 = (Singleton02) ois.readObject();
		ois.close();
		
		System.out.println("s5:" + s5);
		System.out.println("s6:" + s6);
		
		//防止反序列化漏洞
		Singleton02v2 s7 = Singleton02v2.getInstance();
		fos = new FileOutputStream("design-patterns/src/org/example/singleton/test.txt");
		oos = new ObjectOutputStream(fos);
		oos.writeObject(s7);
		oos.close();
		fos.close();
		
		ois = new ObjectInputStream(new FileInputStream("design-patterns/src/org/example/singleton/test.txt"));
		Singleton02v2 s8 = (Singleton02v2) ois.readObject();
		ois.close();
		
		System.out.println("s7:" + s7);
		System.out.println("s8:" + s8);
	}

}
