package pre.arraylist;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6061448067907132641L;
	
	
	private String name;
	private transient String phone;
	
	
	public Student(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	
	void setName(String name) {
		this.name = name;
	}
	void setPhone(String phone) {
		this.phone = phone;
	}
	String getName() {
		return name;
	}
	String getPhone() {
		return phone;
	}
	
	
}
