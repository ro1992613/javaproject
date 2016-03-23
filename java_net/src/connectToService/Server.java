package connectToService;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ServerSocket serverSocket = new ServerSocket(4700);
			Socket socket = serverSocket.accept();
			while (socket.isConnected()) {
				DataInputStream fromclient = new DataInputStream(socket.getInputStream());
				System.out.println("a");
				System.out.println(fromclient.readUTF());
				System.out.println("b");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
