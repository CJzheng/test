package com.ckz.socket;

import java.io.IOException;
import java.net.Socket;

public class ChatSocket extends Thread {
	
	private Socket socket;
	
	public ChatSocket(Socket s){
		this.socket = s;
	}
	public void out(String out){
		try {
			//��ͻ��˷�������
			socket.getOutputStream().write(out.getBytes("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		int count = 0;
		while (true) {
			count++;
			out("loop+"+count);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
}
