package pre.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {
	static int b ;
	public static void main(String[] args) {
		 List<String> l = new ArrayList<String>();
		 
		 int a;
		 
		 //초기화 안시켜서 에러남
//		 System.out.println(a);
//		 System.out.println("66"+b);
		 //size 를 어디서 초기화 시키나 ??? 
		 l.add("test");
		 l.add("vvv");
		System.out.println(l.get(0));
		 System.out.println(l.get(1));
		 
		TestArrayList s = new TestArrayList();
		
		
		/**
		 * >> 시프트 공부
		 * http://secretroute.tistory.com/entry/%EC%9E%90%EB%B0%94%EC%9D%98%E7%A5%9E-Vol1-%EB%B9%84%ED%8A%B8-%EC%8B%9C%ED%94%84%ED%8A%B8-%EC%97%B0%EC%82%B0%EC%9E%90
		 */
		
		String v = String.valueOf(s.add(3));
		String v2 = String.valueOf(5 >> 2);
		System.out.println(v);
		System.out.println(v2);
		
		
		/*이해 안됨
		 *   private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
		 */
		
		
		
		/**
		 * array 재생성
		 * Arrays.copyOf에 대해서
		 * 
		 * 배열 사용법부터
		 * http://hyeonstorage.tistory.com/175
		 * 
		 * 값도 그대로 남아있다. 
		 * 
		 */
		int [] arr = new int[5];
		System.out.println("----------첫 배열 ------");
		System.out.println(" 배열 길이 : " + arr.length);
		for(int i = 0 ; i < 5 ;  i ++){
			
			arr[i] = i;
			System.out.println(arr[i]);
		}
		
		System.out.println(arr.length);
		
		arr = Arrays.copyOf(arr, 10); // array 길이 재생성!!
		System.out.println(" 배열 길이 : " + arr.length);
		System.out.println("----------배열 늘린뒤 ------");
		for(int i = 5 ; i < 10 ;  i ++){
			
			arr[i] = i;
			System.out.println(arr[i]);
		}
		System.out.println("---- 이전 배열값 확인-----");
		
		for(int i = 0 ; i < 5 ;  i ++){
			
			System.out.println(arr[i]);
		}
		System.out.println("----------------");
		
		
		
		
		/**
		 * 덮어쓰기 테스트 
		 * 덮어 쓰기가 아니고 링크드 리스트처럼 밀어내기였다.
		 */
		/*
		 * indexOf(Object o)를 사용하면 지정된 element가 ArrayList내에서 
최초로 검출된 위치의 index를 알 수 있습니다
lastIndexOf(Object o)는 indexOf()와 반대로 마지막에 검출된 위치의 index를 알 수 있습니다.

indexof 위치 찾기
		 */
		l.add(0, "vvv");

		System.out.println(l.indexOf("vvv"));
		System.out.println(l.lastIndexOf("vvv"));

		
		l.add(0, "change");
		
		
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		
		System.out.println(l.indexOf("vvv"));
		System.out.println(l.lastIndexOf("vvv"));
		
		for(String ss : l){
			System.out.println(ss);
		}
		
		/**
		 * clone
		 * toArray
		 * 왜 클론을 만들지 ? 그냥 넣으면 되는데 ??
		 */
		
		
		
		/**
		 * contains  
		 * 안에 요소가 있는지 없는지 
		 */
		
		System.out.println(l.contains("vvv"));
		System.out.println(l.contains("vvvv"));
		
		/**
		 * isEmpty
		 * 비었는지
		 * 
		 */
		
		
		/**
		 * modCount ??????  - AbstractList
		 */
		
		/**
		 * fastremove???
		 * 
		 * 흠 리턴 값으로 remove를 당한 요소를 돌려주고 안돌려주고 의 차이인뿐인가??
		 */
		/*
		 public E remove(int index) {
		        rangeCheck(index);

		        modCount++;
		        E oldValue = elementData(index);

		        int numMoved = size - index - 1;
		        if (numMoved > 0)
		            System.arraycopy(elementData, index+1, elementData, index,
		                             numMoved);
		        elementData[--size] = null; // clear to let GC do its work

		        return oldValue;
		    }
		
		   private void fastRemove(int index) {
		        modCount++;
		        int numMoved = size - index - 1;
		        if (numMoved > 0)
		            System.arraycopy(elementData, index+1, elementData, index,
		                             numMoved);
		        elementData[--size] = null; // clear to let GC do its work
		    }
		    
		    */
		
		
		/**
		 * 
		 * clear
		 * 
		 *  모두 삭제
		 *  
		 *  but l.get(0) == false로 남이었엇다.
		 */
		
//		l.clear();
		
		   
		   
	}
	
	int add(int a){
		int i = a;
		
		int j = a >> 1;
		
		return  i + j;
	}
}
