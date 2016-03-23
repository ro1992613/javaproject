package half_close;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientFrame cf = new ClientFrame();
		cf.setVisible(true);
	}

}

class ClientFrame extends JFrame {
	JPanel jp = new JPanel();
	JTextArea jta = new JTextArea(1, 5);
	JButton jb = new JButton("send");
	Socket socket = null;
	BufferedOutputStream toserver;

	public ClientFrame() {
		this.setSize(500, 500);
		this.setEnabled(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp.add(jta);
		jp.add(jb);
		this.add(jp);
		socket = connect();
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if (socket != null) {
					try {
						toserver = new BufferedOutputStream(socket.getOutputStream());
						String msg = jta.getText();
						
						BufferedInputStream bfin=new BufferedInputStream(new FileInputStream(msg));
						byte[] buffer = new byte[1024];
						int i = 0; 
						while((i=bfin.read(buffer)) != -1){
							toserver.write(buffer, 0, i);
						}
						toserver.flush();
						
						socket.shutdownOutput();
						DataInputStream fromServer=new DataInputStream(socket.getInputStream());
						System.out.println(fromServer.readUTF());
						fromServer.close();
						
						
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						System.out.println("file not found!");
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
	}

	public Socket connect() {
		try {
			socket = new Socket("localhost", 4700);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return socket;
	}
}