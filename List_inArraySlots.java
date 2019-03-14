public class List_inArraySlots{
	private Object[] listOfObjects;
	private static final int INITIAL_CAPACITY = 10;
	private int filledElements;
	
	public List_inArraySlots(){
		listOfObjects = new Object[INITIAL_CAPACITY];
		filledElements= 0;
	}
	
	public int size(){
		return filledElements;
	}
	
	public String toString(){
		String s = "[";
		if (filledElements == 0) return "[]";
		for (int i = 0 ; i < filledElements - 1; i++) s += listOfObjects[i] + ", ";
		return s + listOfObjects[filledElements - 1] + "]";
	}
	
	public boolean add( int type ,int intValue,double doubleValue,String stringValue){
		if (filledElements > listOfObjects.length - 1) expand();
		if (type == 1) listOfObjects[filledElements] = doubleValue;
		if (type == 0) listOfObjects[filledElements] = intValue;
		if (type == 2) listOfObjects[filledElements] = stringValue;
		filledElements++;
		return true;
	}
	
	public void expand(){
		Object[] biggerList = new Object[listOfObjects.length * 2];
		for (int index = 0; index < listOfObjects.length; index ++) biggerList[index] = listOfObjects[index];
		listOfObjects = biggerList;
	}
	
	public Object get(int index){
		return listOfObjects[index];
	}
}