public class List_inArraySlots{
	private Object[] listOfObjects;
	private static final int INITIAL_CAPACITY = 10;
	private int filledElements;
	
	public List_inArraySlots(){
		listOfObjects = new Object[INITIAL_CAPACITY];
		filledElements=0;
	}
	
	public int size(){
		return filledElements;
	}
	
	public String toString(){
		return listOfObjects;
	}
	
	public boolean add( int type ,int intValue,double doubleValue,String stringValue){
		if (filledElements > listOfObjects.length) expand();
		if (type == 0) listOfObjects[filledElements] = new Integer[intValue];
		if (type == 1) listOfObjects[filledElements] = new Double[doubleValue];
		if (type == 2) listOfObjects[filledElements] = new String[stringValue];
		filledElements++;
		return true;
	}
	
	public void expand(){
		
	}
	
	public Object get(int index){
	
	}
}