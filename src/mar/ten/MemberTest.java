package mar.ten;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MemberTest {
	public static void main(String[] args) {
		List<Member> contacts = new ArrayList<Member>();
		contacts.add(new Member("이준영","1234567890","EMS Team"));
		contacts.add(new Member("오도근","21234623413","EMS Team"));
		contacts.add(new Member("최평강","3234567890","EMS Team"));
		
		
		
		Collections.sort(contacts);
		
		for(Member m:contacts){
			System.out.println(m.getName());
			System.out.println(m.toString());
		}
		
	}

}
