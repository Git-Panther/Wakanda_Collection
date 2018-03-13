package kh.collection;

public class CustomVectorTest {
	public static void main(String[] args) throws IndexOutOfBoundsException{
		CustomVector myVector = new CustomVector(1);
		System.out.println(myVector.capacity());
		System.out.println(myVector.isEmpty());
		System.out.println(myVector.size());
		
		myVector.add("1");
		myVector.add("2");
		myVector.add("3");
		myVector.add("4");
		myVector.add("5");
		myVector.add("6");
		System.out.println(myVector.capacity());
		System.out.println(myVector.isEmpty());
		System.out.println(myVector.size());
		System.out.println(myVector.get(3));
		System.out.println(myVector.indexOf("5"));
		
		myVector.remove("3");
		System.out.println(myVector.toString());
	}
}
