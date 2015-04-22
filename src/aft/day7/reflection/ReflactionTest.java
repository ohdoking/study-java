package aft.day7.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//http://socurites.com/60 출처 

public class ReflactionTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<?> o = Class.forName("aft.day7.reflection.ReflectionView") ;
		
		Method[] mlist = o.getDeclaredMethods();
		Constructor ctorlist[] = o.getDeclaredConstructors();
		Field fieldlist[] = o.getDeclaredFields();
//		Object tempClass = o.newInstance();

		for(Method tempm : mlist){
			System.out.println("메소드 이름 : "+ tempm.getName());
			
			System.out.println("return type = " + tempm.getReturnType());
		}
		
		
		for(Constructor tempm : ctorlist){
			System.out.println("클래스 이름 : "+ tempm.getName());
			System.out.println("생성자가 선언된 클래스 이름 : "+ tempm.getDeclaringClass());
			
			Class pvec[] = tempm.getParameterTypes();
			for(Class tempClass:pvec){
				
				System.out.println("생성자의 파라미터들 :" + tempClass.getName());
			}
			
		}
		for(Field tempm : fieldlist){
			System.out.println("필드 이름 : "+ tempm.getName());
			System.out.println("필드 정보 전부"+tempm.toString());
			System.out.println("필드가 선언된 클래스 이름 : "+ tempm.getDeclaringClass());
			
		}
		
		
		Object retObj = o.newInstance();
		System.out.println(retObj+"!!!");
		
	}
}
