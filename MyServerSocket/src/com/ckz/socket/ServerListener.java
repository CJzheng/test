package com.ckz.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;
/**
 * 使用accept（）方法获取与客户端的Socket链接对象，将该对象指派给一个新的线程，在线程中执行网络数据的交换。实现一对一的数据传输。
 * @author kaiser
 *
 */
@SuppressWarnings("resource")
public class ServerListener extends Thread {
	@Override
	public void run() {
		try {
			// 1-65535，端口号的范围
			ServerSocket serverSocket = new ServerSocket(12345);// 帧听这个端口
			while (true) {
				Socket socket = serverSocket.accept();// 阻塞当前线程,block
				JOptionPane.showMessageDialog(null, "有客服机链接到本地的12345端口!");
				//将socket传给新的线程 
				new ChatSocket(socket).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
