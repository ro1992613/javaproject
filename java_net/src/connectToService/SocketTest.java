package connectToService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SocketTest {

	public static void main(String args[]) {

		try {

			Socket socket = new Socket("127.0.0.1", 4700);

			// �򱾻���4700�˿ڷ����ͻ�����

			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));

			// ��ϵͳ��׼�����豸����BufferedReader����

			PrintWriter os = new PrintWriter(socket.getOutputStream());

			// ��Socket����õ��������������PrintWriter����

			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// ��Socket����õ�����������������Ӧ��BufferedReader����

			String readline;
			System.out.println("a");

			readline = sin.readLine(); // ��ϵͳ��׼�������һ�ַ���
			System.out.println("b");

			while (!readline.equals("bye")) {

				System.out.println("c");

				// ���ӱ�׼���������ַ���Ϊ "bye"��ֹͣѭ��

				os.println(readline);

				// ����ϵͳ��׼���������ַ��������Server
				System.out.println("d");
				os.flush();
				System.out.println("e");
				// ˢ���������ʹServer�����յ����ַ���

				System.out.println("Client:" + readline);

				// ��ϵͳ��׼����ϴ�ӡ������ַ���

				System.out.println("Server:" + is.readLine());

				// ��Server����һ�ַ���������ӡ����׼�����

				readline = sin.readLine(); // ��ϵͳ��׼�������һ�ַ���
				System.out.println("f");
			} // ����ѭ��



		} catch (Exception e) {
			// �������ӡ������Ϣ
			System.out.println("Error" + e);
		}
	}

}
