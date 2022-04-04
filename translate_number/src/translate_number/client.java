package translate_number;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Client is connecting ...");
			Socket socket = new Socket("localhost", 8888);
			System.out.println("client connected");
			DataOutputStream ouput = new DataOutputStream(socket.getOutputStream());
			DataInputStream input = new DataInputStream(socket.getInputStream());
			while (true) {
				System.out.println("---CHÂU VĨNH LONG 61133899---");
				System.out.println("---TRANSLATE NUMBER---");
				System.out.println("Client: ");
				ouput.writeDouble(sc.nextDouble());
				ouput.flush();
				//phép tính 
				double tong = input.readDouble();
				System.out.println("Server:"+tong);
				
				//THOÁT
				//System.out.println("Tiếp tục (Yes/no):");
				String rep = sc.next();
				if (rep.equalsIgnoreCase("10")) {
					System.out.println("---Chương trình kết thúc---");
					break;
				}
			}
		}catch (Exception e) {
	}
	
}
}
