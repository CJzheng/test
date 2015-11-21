package com.ckz.socket;
/**
 * Socket 又称"套接字"，应用程序通常通过"套接字"向网络发出请求或者应答网络请求。ServerSocket 用于服务器端，
 * Socket 是建立网络连接时使用的。在连接成功时，应用程序两端都会产生一个 Socket 实例，操作这个实例，完成所需的会话。
 * @author kaiser
 *
 */
public class TestServerSocket {

	public static void main(String[] args) {
		new ServerListener().start();
	}

}