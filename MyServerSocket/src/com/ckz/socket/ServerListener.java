package com.ckz.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;
/**
 * ʹ��accept����������ȡ��ͻ��˵�Socket���Ӷ��󣬽��ö���ָ�ɸ�һ���µ��̣߳����߳���ִ���������ݵĽ�����ʵ��һ��һ�����ݴ��䡣
 * @author kaiser
 *
 */
@SuppressWarnings("resource")
public class ServerListener extends Thread {
	@Override
	public void run() {
		try {
			// 1-65535���˿ںŵķ�Χ
			ServerSocket serverSocket = new ServerSocket(12345);// ֡������˿�
			while (true) {
				Socket socket = serverSocket.accept();// ������ǰ�߳�,block
				JOptionPane.showMessageDialog(null, "�пͷ������ӵ����ص�12345�˿�!");
				//��socket�����µ��߳� 
				new ChatSocket(socket).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}