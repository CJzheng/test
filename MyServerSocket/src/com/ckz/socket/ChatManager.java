package com.ckz.socket;

import java.util.Vector;

/**
 * һ������Ự��ֻ��һ���Ự����
 * ����ģʽ
 * @author kaiser
 *
 */
public class ChatManager {
	
	private static final ChatManager cm = new ChatManager();
	
	private ChatManager(){}
	
	/**
	 * �ṩ�ⲿ���ʽӿ�
	 * @return
	 */
	public static ChatManager getChatManager(){
		return cm;
	}
	
	//����һ���Ự������
	Vector<ChatSocket> vector = new Vector<ChatSocket>();
	
	/**
	 * ��ӵ����Ϲ���
	 * @param cs
	 */
	public void add(ChatSocket cs){
		vector.add(cs);
	}
	
	/**
	 * �����пͻ��˷�����Ϣ
	 */
	public void publish(ChatSocket cs,String out){
		int length  = vector.size();
		for(int i=0;i<length;i++){
			ChatSocket csChatSocket = vector.get(i);
			//��ǰ�ͻ����ý�����Ϣ
			if(!cs.equals(csChatSocket)){
				csChatSocket.out(out);
			}
		}
	}
}
