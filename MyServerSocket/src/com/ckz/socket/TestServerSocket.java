package com.ckz.socket;
/**
 * Socket �ֳ�"�׽���"��Ӧ�ó���ͨ��ͨ��"�׽���"�����緢���������Ӧ����������ServerSocket ���ڷ������ˣ�
 * Socket �ǽ�����������ʱʹ�õġ������ӳɹ�ʱ��Ӧ�ó������˶������һ�� Socket ʵ�����������ʵ�����������ĻỰ��
 * @author kaiser
 *
 */
public class TestServerSocket {

	public static void main(String[] args) {
		new ServerListener().start();
	}

}