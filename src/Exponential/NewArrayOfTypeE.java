package Exponential;

//import Type.type;

public class NewArrayOfTypeE extends E{
	
	E e;
//	Type type;

	public NewArrayOfTypeE(E e){
		this.e = e;
//		this.type = type;
	}

	@Override
	public String toString() {
		return "new array of type ["+e.toString()+"]";
	}

}
