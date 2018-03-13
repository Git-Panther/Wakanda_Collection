package kh.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import kh.list.vo.MemberVo;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Object> list = new ArrayList<>();
//		list.add(2);
//		list.add(false);
//		list.add('*');
//		list.add("kongkongE");
//		list.add(new MemberVo(2222, "고동빈", new GregorianCalendar().getTime() ) );
//		
//		for(Object obj : list)
//			System.out.println(obj);
//		
//		list.remove(false);
//		
//		for(Object obj : list)
//			System.out.println(obj);
		
		List<MemberVo> memberList = new ArrayList<>();
		memberList.add(new MemberVo(11, "송경호", new Date(0) ) );
		memberList.add(new MemberVo(2222, "고동빈", new GregorianCalendar().getTime() ) );
		memberList.add(new MemberVo(22, "허원석", new Date(222222222L) ) );
		memberList.add(new MemberVo(222, "김혁규", new Date(2222222222222222L) ) );
		memberList.add(new MemberVo(22222, "조세형", new Date(2222222222222222222L) ) );
		
		System.out.println("이름 오름차순");
		
		memberList.sort(new Comparator<MemberVo>() {
			@Override
			public int compare(MemberVo o1, MemberVo o2) {
				// TODO Auto-generated method stub
//				System.out.println((o1.getMemberName()).compareTo(o2.getMemberName()));
				return ( (o1.getMemberName()).compareTo(o2.getMemberName()) );
				// 비교 기준 : 문자열 오름차순. (내림차순은 * -1)
				// 더 정확히는 양수면 변경, 0 이하는 안 변경
			}	
		});
		
//		for(Object member : memberList)
//			System.out.println(member);
		
		Iterator<MemberVo> itr = memberList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("번호 오름차순");
		
		memberList.sort(new Comparator<MemberVo>() {
			@Override
			public int compare(MemberVo o1, MemberVo o2) {
				// TODO Auto-generated method stub
//				System.out.println((o1.getMemberName()).compareTo(o2.getMemberName()));
				
				return o1.getMemberNo() -  o2.getMemberNo(); // 앞 번호가 뒤 번호보다 크면 변경
				// 비교 기준 : 번호 오름차순
				// 더 정확히는 양수면 변경, 0 이하는 안 변경
			}	
		});
		
		itr = memberList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("날짜 오름차순");
		
		memberList.sort(new Comparator<MemberVo>() {
			@Override
			public int compare(MemberVo o1, MemberVo o2) {
				// TODO Auto-generated method stub
//				System.out.println((o1.getMemberName()).compareTo(o2.getMemberName()));
				
				return o1.getJoinDate().compareTo(o2.getJoinDate());
//				return -1 * o1.getJoinDate().compareTo(o2.getJoinDate());
//				return o1.getMemberNo() -  o2.getMemberNo(); // 앞날짜가 뒷날짜보다 크면 
				// 비교 기준 : 날짜 오름차순
				// 더 정확히는 양수면 변경, 0 이하는 안 변경
			}	
		});
		
		itr = memberList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
