package connectToService;

import java.io.*;

import java.net.*;

import java.applet.Applet;

public class TalkServer {

	public static void main(String args[]) {
		try {

			ServerSocket server = null;
			try {

				server = new ServerSocket(4700);

				// ����һ��ServerSocket�ڶ˿�4700�����ͻ�����

			} catch (Exception e) {

				System.out.println("can not listen to:" + e);

				// ������ӡ������Ϣ

			}

			Socket socket = null;

			try {

				socket = server.accept();

				// ʹ��accept()�����ȴ��ͻ������пͻ�

				// �����������һ��Socket���󣬲�����ִ��

			} catch (Exception e) {

				System.out.println("Error." + e);

				// ������ӡ������Ϣ

			}

			String line;

			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// ��Socket����õ�����������������Ӧ��BufferedReader����
			PrintWriter os = new PrintWriter(socket.getOutputStream());
			// ��Socket����õ��������������PrintWriter����
			//BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			// ��ϵͳ��׼�����豸����BufferedReader����
			System.out.println("Client:" + is.readLine());

			// �ڱ�׼����ϴ�ӡ�ӿͻ��˶�����ַ���

			line = "get";

			// �ӱ�׼�������һ�ַ���
			int i=0;
			while (!line.equals("bye")) {
				System.out.println("A");
				// ������ַ���Ϊ "bye"����ֹͣѭ��
				i++;
				os.println("ss"+i);
				System.out.println("B");
				// ��ͻ���������ַ���

				os.flush();
				System.out.println("C");
				// ˢ���������ʹClient�����յ����ַ���
				//i++;
				//System.out.println("------------>a"+i);
				// ��ϵͳ��׼����ϴ�ӡ������ַ���
				//System.out.println("Client:" + is.readLine());

				// ��Client����һ�ַ���������ӡ����׼�����

				//line = sin.readLine();

				// ��ϵͳ��׼�������һ�ַ���

			} // ����ѭ��

			os.close(); // �ر�Socket�����

			is.close(); // �ر�Socket������

			socket.close(); // �ر�Socket

			server.close(); // �ر�ServerSocket

		} catch (Exception e) {

			System.out.println("Error:" + e);
			// ������ӡ������Ϣ

		}
	}

}