package aft.day7.reflection;

public class ReflectionView {

	public float public_variable;
	private int private_variable;
	
	public ReflectionView(){
		System.out.println("인스턴스 생성됨!!!");
	}
	
	public ReflectionView(int value,double value2){
		private_variable = value;
	}
	public int add(int a, int b){
		int c = 1;
		return a + b + c;
	}
	public int sub(int a, int b){
		return a - b;
	}
}
