package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {

	public static void main(String[] args) {
		
		
		String imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/92/Titanic.jpg";
		
		try {
			URL url = new URL(imageUrl);
			
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("C:/Users/qkrtp/workspace/Java_class/Files/Titanic.jpg");
			
			int result;
			
			byte[] buf = new byte[100];
			
			while((result = is.read(buf)) != -1) {
				os.write(buf, 0, result);
			}
			
			System.out.println("파일 생성 완료");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
