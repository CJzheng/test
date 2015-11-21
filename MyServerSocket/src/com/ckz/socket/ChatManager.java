package com.ckz.socket;

import java.util.Vector;

/**
 * 一个聊天会话，只有一个会话管理
 * 单例模式
 * @author kaiser
 *
 */
public class ChatManager {
	
	private static final ChatManager cm = new ChatManager();
	
	private ChatManager(){}
	
	/**
	 * 提供外部防问接口
	 * @return
	 */
	public static ChatManager getChatManager(){
		return cm;
	}
	
	//定义一个会话管理集合
	Vector<ChatSocket> vector = new Vector<ChatSocket>();
	
	/**
	 * 添加到集合管理
	 * @param cs
	 */
	public void add(ChatSocket cs){
		vector.add(cs);
	}
	
	/**
	 * 向所有客户端发送信息
	 */
	public void publish(ChatSocket cs,String out){
		int length  = vector.size();
		for(int i=0;i<length;i++){
			ChatSocket csChatSocket = vector.get(i);
			//当前客户不用接收信息
			if(!cs.equals(csChatSocket)){
				csChatSocket.out(out);
			}
		}
	}
}
