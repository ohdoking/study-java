package pre.arraylist;

public class CopyTest {

	public static void main(String[] args) {
		
	}
}


class Reference{
	Value v;
	
	public static Reference shallowCopy(Reference r){
		Reference newR = new Reference();
		newR.v = r.v;
		
		return newR;
	}
	public static Reference deepCopy(Reference r){
		Reference newR = new Reference();
		newR.v = r.v; new Value(r.v.i);
		
		return newR;
	}
}

class Value{
	int i = 0;

	public Value(int i) {
		super();
		this.i = i;
	}
	

}