package kh.collection;

import java.util.Date;

import kh.list.vo.MemberVo;

public class CustomVectorTest {
	public static void main(String[] args) throws IndexOutOfBoundsException{
		CustomVector<Integer, Object> myVector = new CustomVector<Integer, Object>(5);
//		System.out.println(myVector.capacity());
//		System.out.println(myVector.isEmpty());
//		System.out.println(myVector.size());
//		
//		myVector.add("1");
//		myVector.add("2");
//		myVector.add("3");
//		myVector.add("4");
//		myVector.add("5");
//		myVector.add("6");
//		System.out.println(myVector.capacity());
//		System.out.println(myVector.isEmpty());
//		System.out.println(myVector.size());
//		System.out.println(myVector.get(3));
//		System.out.println(myVector.indexOf("5"));
//		
//		myVector.remove("3");
//		System.out.println(myVector.toString());
		
		myVector.add(1); // int 입력시 자동으로 Integer(Auto-Boxing)
		myVector.add(2);
		myVector.add(4);
		System.out.println(myVector);
		
		CustomVector<MemberVo, Object> memberVector = new CustomVector<MemberVo, Object>();
		// 제네릭으로 담을 수 있는 타입을 제한
		memberVector.add(new MemberVo(23, "김동하", new Date())); 
		memberVector.add(new MemberVo(20, "한왕호", new Date(0)));
		memberVector.add(new MemberVo(19, "곽보성", new Date(1234567890L)));
		memberVector.add(new MemberVo(24, "김종인", new Date(11111111111L)));
		memberVector.add(new MemberVo(24, "강범현", new Date(101010101010L)));
		memberVector.add(new MemberVo(20, "문우찬", new Date(22L)));
		
		System.out.println(memberVector);
	}
}
