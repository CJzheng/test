package com.ckz.socket;
/**
 * Socket �ֳ�"�׽���"��Ӧ�ó���ͨ��ͨ��"�׽���"�����緢���������Ӧ����������ServerSocket ���ڷ������ˣ�
 * Socket �ǽ�����������ʱʹ�õġ������ӳɹ�ʱ��Ӧ�ó������˶������һ�� Socket ʵ�����������ʵ�����������ĻỰ��
 * 
 * Socketͨ��������ͨ������õļ���֮һ��ͨ��Socket�����Ŀɿ����ӣ������ö���ն������������ͨ�ţ�����͵�Ӧ���ǽ���һ�������������
 * 
  1.Socketͨ�ŵĸ��
  2.����ServerSocket��������
  3.�ͻ���ʹ��Socket�������ͨ�š�
 * @author kaiser
 *
 */
public class TestServerSocket {

	public static void main(String[] args) {
		new ServerListener().start();
	}

}