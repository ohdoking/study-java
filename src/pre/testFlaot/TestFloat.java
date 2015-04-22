package pre.testFlaot;

import java.io.IOException;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

public class TestFloat {

	public static void main(String[] args) {
		/*String name = "이준영";
		
		name = "이름;select * from users;";
		
		String sql = "update users set name=?;";
		return sqlResult;
		
			try {
				a();
			} catch (IOException | SQLException | RuntimeException e) {
				e.printStackTrace();
			}*/
		
//		double i = Double.NaN
		int f = 3;
		int c = 0;
		
		
			
			System.out.println(resultOh(f,c));
		
		
//		Double i = Double.POSITIVE_INFINITY;
//		while(i == i + 1){
//			System.out.println("ww");
//		}
		
//		String i = "d";
//		while(i != i+0) {
//			i = i + 0;
//		}
	}
	
	public static int resultOh(int a, int b){
		int result = 0;
		try {
			result = a/b;
		} catch (Exception e) {
			System.out.println("에러러ㅓ럴");
		}
		return result;
	}
	
	public static void a() throws IOException, SQLException, RuntimeException{
		b();
	}
	
	public static void b() throws IOException {
		c();
	}
	
	public static void c() throws IOException {
		if (System.currentTimeMillis() % 2 == 0) {
			throw new IOException("시스템의 밀리세컨드가 짝수이므로 오류가 발생했습니다.");
		}
		
		d();
	}
	
	public static void d() {
//		new Throwable().printStackTrace();
	}
}
