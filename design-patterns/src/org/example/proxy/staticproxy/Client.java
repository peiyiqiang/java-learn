package org.example.proxy.staticproxy;

/**
 * 1.抽象角色
 * 2.真实角色
 * 3.代理角色
 * 
 * 应用：多线程的Runnable
 * 
 * @author Ethan
 *
 */

public class Client {
	public static void main(String[] args) {
		Role realRole = new RealRole();
		Role proxyRole = new ProxyRole(realRole);
		
		proxyRole.todo();
	}
}
