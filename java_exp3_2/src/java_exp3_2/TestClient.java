package java_exp3_2;
import java.net.*;
import java.io.*;
import java.util.*;

public class TestClient{
	public static void main(String args[]) throws Exception {
		Socket socket=new Socket(InetAddress.getLocalHost().getHostAddress(),9999);
		OutputStream out=socket.getOutputStream();
		System.out.println("请输入学号和姓名：");
		String number=new Scanner(System.in).next();
		String name=new Scanner(System.in).next();
		
		while(true) {
			System.out.print("From "+number+" "+name+":");
			String text=new Scanner(System.in).nextLine();
			byte[] bytes = text.getBytes();
	        out.write(bytes);
	        out.flush();
	        InputStream in=socket.getInputStream();
			byte [] bytes1 = new byte[1024];
	        int count = in.read(bytes1);
	        String content = new String(bytes1,0,count);
	        System.out.println("To "+name+":"+content);
	        if(content.equals("Bye")) {
	        	out.close();
	        	in.close();
	        	break;
	        }
	        
		}
	}
}
