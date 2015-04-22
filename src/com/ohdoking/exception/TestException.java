package com.ohdoking.exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {

		PrintStream ps = null;
		FileOutputStream fos = null;
		int value;

		Scanner scan = new Scanner(System.in); // 문자 입력을 인자로 Scanner 생성

		System.out.println("숫자를 입력하세요:");

		value = Integer.valueOf(scan.nextLine()); // 키보드 문자 입력
		
		try {
			
			fos = new FileOutputStream("error.log",true);
			ps = new PrintStream(fos);
			System.setErr(ps);
			ifNotOneMakeErrorMethod(value);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			
			System.err.println("예외 발생 시간 ㅣ" + new Date() );
			System.err.println("Error Code : " + e.getErrCode());
			e.printStackTrace(System.err);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Succes 1");
	}

	static boolean ifNotOneMakeErrorMethod(int value) throws MyException {
		if (value != 1) {
			throw new MyException("1이 아니다");
		}
		return true;
	}

}

class MyException extends Exception {

	private final int ERR_CODE;

	public MyException(String msg, int errorCode) {
		super(msg);
		ERR_CODE = errorCode;
	}

	public MyException(String msg) {
		this(msg, 404);
	}

	public int getErrCode() {
		return ERR_CODE;
	}
}
