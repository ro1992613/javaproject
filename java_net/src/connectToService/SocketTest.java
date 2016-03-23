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

			// 向本机的4700端口发出客户请求

			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));

			// 由系统标准输入设备构造BufferedReader对象

			PrintWriter os = new PrintWriter(socket.getOutputStream());

			// 由Socket对象得到输出流，并构造PrintWriter对象

			BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 由Socket对象得到输入流，并构造相应的BufferedReader对象

			String readline;
			System.out.println("a");

			readline = sin.readLine(); // 从系统标准输入读入一字符串
			System.out.println("b");

			while (!readline.equals("bye")) {

				System.out.println("c");

				// 若从标准输入读入的字符串为 "bye"则停止循环

				os.println(readline);

				// 将从系统标准输入读入的字符串输出到Server
				System.out.println("d");
				os.flush();
				System.out.println("e");
				// 刷新输出流，使Server马上收到该字符串

				System.out.println("Client:" + readline);

				// 在系统标准输出上打印读入的字符串

				System.out.println("Server:" + is.readLine());

				// 从Server读入一字符串，并打印到标准输出上

				readline = sin.readLine(); // 从系统标准输入读入一字符串
				System.out.println("f");
			} // 继续循环



		} catch (Exception e) {
			// 出错，则打印出错信息
			System.out.println("Error" + e);
		}
	}

}
