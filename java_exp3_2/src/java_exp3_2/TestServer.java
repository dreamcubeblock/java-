package java_exp3_2;
import java.net.*;
import java.text.SimpleDateFormat;
import java.io.*;
import java.util.*;
public class TestServer {
	public static void main(String args[]) throws Exception {
		ServerSocket server=new ServerSocket(9999);
		Socket socket=server.accept();
		while(true) {
		InputStream in=socket.getInputStream();
		byte [] bytes = new byte[1024];
        int count = in.read(bytes);
        System.out.print(count);
        String content = new String(bytes,0,count);
        System.out.print(content);
		if(content.equals("what time is it")) {
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String text=df.format(new Date());//设置日期格式
			//System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
			OutputStream out=socket.getOutputStream();
			byte[] bytes1 = text.getBytes();
	        out.write(bytes1);
	        out.flush();
		}else if(content.equals("Exit")) {
			String text="Bye";
			OutputStream out=socket.getOutputStream();
			byte[] bytes1 = text.getBytes();
	        out.write(bytes1);
	        out.flush();
	        out.close();
	        in.close();
	        return;
		}
		else {
			String text="woc";
			OutputStream out=socket.getOutputStream();
			byte[] bytes1 = text.getBytes();
	        out.write(bytes1);
	        out.flush();
		}
		}
	}
}
