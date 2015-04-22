package mar.ten;

public class Member implements Comparable<Member>{
	private String name;
	private String phoneNumber;
	private String teamName;
	
	public Member(String name, String phoneNumber, String teamName) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.teamName = teamName;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getPhoneNumber() {
		return phoneNumber;
	}
	void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	String getTeamName() {
		return teamName;
	}
	void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public int compareTo(Member o) {
		return name.compareTo(o.getName());
	}
	
	@Override
	public String toString(){
		return name;
	}
	

}
