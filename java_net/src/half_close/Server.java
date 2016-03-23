package half_close;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		try {
			ServerSocket serverSocket = new ServerSocket(4700);
			Socket socket = serverSocket.accept();
			while (socket.isConnected()) {
				while(socket.getInputStream().available() == 0){
					System.out.println("------------>aaaa");
					Thread.sleep(2000);
					
				}
				BufferedInputStream fromclient = new BufferedInputStream(socket.getInputStream());
				String path="d:/1.jpg";
				BufferedOutputStream tofile=new BufferedOutputStream(new FileOutputStream(new File(path)));
				System.out.println("------------>");
				byte[] buffer = new byte[1024];
				int i = 0; 
				while((i=fromclient.read(buffer)) != -1){
					
					tofile.write(buffer, 0, i);
				}
				tofile.flush();
				//socket.shutdownInput();
				DataOutputStream toclient=new DataOutputStream(socket.getOutputStream());
				toclient.writeUTF("success!");
				toclient.flush();
				//socket.shutdownOutput();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
