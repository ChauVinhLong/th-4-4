package translate_number;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
	public static void main(String[] args) {
		try {
			ServerSocket svSocket = new ServerSocket(8888);
			System.out.println("Server is connecting ...");
			Socket socket = svSocket.accept();
			System.out.println("Server connected");
			DataInputStream input = new DataInputStream(socket.getInputStream());
			DataOutputStream output = new DataOutputStream(socket.getOutputStream());
			while (true) {
				double number = input.readDouble();
				System.out.println("Number : "+number);
				
				double translate = number;
				output.writeDouble(translate);
				output.flush();
				
			}
		} catch (Exception e) {
     	}
     }
}
