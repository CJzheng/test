package com.ckz.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatSocket extends Thread {
	
	private Socket socket;
	
	public ChatSocket(Socket s){
		this.socket = s;
	}
	public void out(String out){
		try {
			//向客户端发送数据
			socket.getOutputStream().write(out.getBytes("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		//读取数据
		try {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream(),"UTF-8"));
			String line = null;
			while ((line=br.readLine())!=null) {
				ChatManager.getChatManager().publish(this,line);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
