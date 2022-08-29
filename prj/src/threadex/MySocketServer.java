package threadex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class MySocketServer extends Thread {
	
	static ArrayList<Socket> list = new ArrayList<>();
	static Socket socket = null;
	public MySocketServer(Socket socket){
	this.socket = socket;
	}
	
	public void run() {
		try{
			System.out.println("Server : connect IP Client " + socket.getInetAddress());
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			OutputStream out = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(out, true);
			writer.println("connected Server! input ID");
			String readValue = null;
			String name = null;
			boolean identify = false;
			while ((readValue = reader.readLine()) != null) {
				if (!identify) {
					name = readValue;
					identify = true;
					writer.println(name + " entrance ");
					continue;
				}
				for (int i = 0; i < list.size(); i++) {
					out = list.get(i).getOutputStream();
					writer = new PrintWriter(out, true);
					writer.println(name + " : " + readValue);//
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(9999);
			System.out.println("server start ...");
			
			while(true) {
				Socket clientSocket = serverSocket.accept();
				Thread t = new MySocketServer(clientSocket);
				t.start();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
