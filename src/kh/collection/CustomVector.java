package kh.collection;

public class CustomVector {
	private Object[] objArr;
	private int size;
	
	public CustomVector() {
		// TODO Auto-generated constructor stub
		size = 0; 
		objArr = new Object[10]; // 기본값 10
	}

	public CustomVector(int capacity) {
		size = 0;
		objArr = new Object[capacity];
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
	
	public void add(Object i) {
		Object[] copyArr = new Object[objArr.length * 2];
		
		if(size == objArr.length) {
			System.arraycopy(objArr, 0, copyArr, 0, objArr.length);
			objArr = copyArr;
		}
		
		objArr[size++] = i;
	}
	
	public Object get(int index) throws IndexOutOfBoundsException {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException("인덱스 범위 벗어남");
		
		return objArr[index];
	}
	
	public int indexOf(Object obj) {
		for(int index = 0; index < size; index++) {
			if( obj.equals(objArr[index]) )
				return index;
		}
		
		return -1;
	}
	
	public boolean remove(Object obj) {
//		for(int index = 0; index < size; index++) {
//			if( obj.equals(objArr[index]) ) {
//				System.arraycopy(objArr, index + 1, objArr, index, (size - 1) - index); // 배열을 앞당긴다
//				objArr[(size - 1)] = null; // 앞으로 1칸씩 당겼으므로 마지막 값은 null로
//				size--;
//				return true;
//			}
//		}
		
		int index = indexOf(obj);
		
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
		
		for(Object obj : objArr) {
			if(obj == null)
				break;
				
			message += obj.toString() + "\t";
		}

		return message;
	}
	
}
