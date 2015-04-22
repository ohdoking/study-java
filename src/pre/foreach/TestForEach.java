package pre.foreach;

import java.util.ArrayList;
import java.util.List;

public class TestForEach {

	public static void main(String[] args) {

		
		
		
		List<Student> l = new ArrayList<Student>();
		Student s = new Student("ohdoking", 1);
		Student s1 = new Student("ohdoking1", 2);
		
		l.add(s);
		l.add(s1);
		
		for(Student t: l ){
			System.out.println("name : " + t.name);
			System.out.println("name : " + t.grade);
		}
	}

}
