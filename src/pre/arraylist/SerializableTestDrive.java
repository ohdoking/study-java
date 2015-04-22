package pre.arraylist;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;

public class SerializableTestDrive {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, IOException {
		Student student = new Student("오도근", "01036687952");
		
		try {
			ObjectStreamHandler.write(student, "student_file");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Student st2 = new Student("openpass", "123123");
		ObjectStreamHandler.write(st2, "openpaas.txt");
		
		Student st = (Student) ObjectStreamHandler.read("openpaas.txt");
		
		
		//streamRedirection
		System.setOut(new PrintStream("test.txt"));
		
		
		System.out.println(st.getName());
		System.out.println(st.getPhone());
		
		
		if(st instanceof Serializable){
			System.out.println("wowCheck");
		}
	}
}
