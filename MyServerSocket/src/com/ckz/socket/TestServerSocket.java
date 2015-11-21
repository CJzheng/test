package com.ckz.socket;
/**
 * Socket 又称"套接字"，应用程序通常通过"套接字"向网络发出请求或者应答网络请求。ServerSocket 用于服务器端，
 * Socket 是建立网络连接时使用的。在连接成功时，应用程序两端都会产生一个 Socket 实例，操作这个实例，完成所需的会话。
 * 
 * Socket通信是网络通信中最常用的技术之一，通过Socket建立的可靠连接，可以让多个终端与服务器保持通信，最典型的应用是建立一个多人聊天程序。
 * 
  1.Socket通信的概念。
  2.创建ServerSocket服务器。
  3.客户端使用Socket与服务器通信。
 * @author kaiser
 *
 */
public class TestServerSocket {

	public static void main(String[] args) {
		new ServerListener().start();
	}

}