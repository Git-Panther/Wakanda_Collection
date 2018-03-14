package kh.collection;

public class CustomVector<E, U> { // 제네릭 사용. 제네릭에 사용할 대문자로 개수 정할 수 있다.
	private E[] objArr;
	private int size;
	
	@SuppressWarnings("unchecked")
	public CustomVector() {
		// TODO Auto-generated constructor stub
		size = 0; 
		objArr = (E[]) new Object[10]; // 기본값 10
	}

	@SuppressWarnings("unchecked")
	public CustomVector(int capacity) {
		size = 0;
		objArr = (E[]) new Object[capacity];
	}
	
	public int capacity() {
		return objArr.length;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(size == 0)
			return true;
		
		return false;
	}
	
	@SuppressWarnings("unchecked")
	public void add(E e) {
		E[] copyArr = (E[])new Object[objArr.length * 2];
		
		if(size == objArr.length) {
			System.arraycopy(objArr, 0, copyArr, 0, objArr.length);
			objArr = copyArr;
		}
		
		objArr[size++] = e;
	}
	
	public Object get(int index) throws IndexOutOfBoundsException {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("인덱스 범위 벗어남");
		
		return objArr[index];
	}
	
	public int indexOf(E e) {
		for(int index = 0; index < size; index++) {
			if( e.equals(objArr[index]) )
				return index;
		}
		
		return -1;
	}
	
	public boolean remove(E e) {
//		for(int index = 0; index < size; index++) {
//			if( obj.equals(objArr[index]) ) {
//				System.arraycopy(objArr, index + 1, objArr, index, (size - 1) - index); // 배열을 앞당긴다
//				objArr[(size - 1)] = null; // 앞으로 1칸씩 당겼으므로 마지막 값은 null로
//				size--;
//				return true;
//			}
//		}
		
		int index = indexOf(e);
		
		if(index != -1)
		{
			System.arraycopy(objArr, index + 1, objArr, index, (size - 1) - index); // 배열을 앞당긴다
			objArr[(size - 1)] = null; // 앞으로 1칸씩 당겼으므로 마지막 값은 null로
			size--;
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String message = "";
		
		for(E e : objArr) {
			if(e == null)
				break;
				
			message += e.toString() + "\t";
		}

		return message;
	}
	
}
