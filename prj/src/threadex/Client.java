package threadex;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {
			Socket s1 = new Socket("192.168.6.134", 54321);
			String str = "yoon message :";
			for (String data : args)
				str += data;
			OutputStream out = s1.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.writeObject(str);
			InputStream is = s1.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			System.out.println("server >>> " + ois.readObject());
			ois.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
