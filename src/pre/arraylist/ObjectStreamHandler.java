package pre.arraylist;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * 객체를 파일로 출력하는 객체
 * 객체 직렬화 / 역직렬화
 * @author ohdoking
 * @role 초심자
 *
 */

public class ObjectStreamHandler {
	
	public static void write(Object object, String fileName) throws FileNotFoundException, IOException
	{
		ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(fileName)));
		
		out.writeObject(object);
		out.flush();
		
		out.close();
	}
	
	public static Object read(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(fileName)));
		
		Object o = in.readObject();
		
		in.close();
		return o;
	}
}
