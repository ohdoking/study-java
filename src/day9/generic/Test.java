package day9.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
	// 여기 변경 좀 이용 물음표 문제를 해결하다
	public static void doTest(List<? extends Parent> list) {

	}

	public   static   void  main(String[] args) {
        
		ArrayList <Parent >  parentList  =   new  ArrayList <Parent > ();
        List <Child >  childList  =   new  ArrayList <Child > ();
        doTest(parentList);
         // 여기 컴파일 정확한 주의        
        doTest(childList);
//          doTest(childList) 
        T g[] = new T[3];
        
        parentList.toArray(g);
        
        
          }}