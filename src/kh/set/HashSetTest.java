package kh.set;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import kh.list.vo.MemberVo;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Object> set = new HashSet<>();
		
		set.add(15);
		set.add(new Date());
		set.add(2.55);
		set.add(new Character('c'));
		set.add(new MemberVo(1, "왕의 영역", new Date(1524300000000L)));
		set.add(15); // 중복 저장 불가
		set.remove(15); // 따라서 삭제하는 순간 15 값은 세트에 안 존재하게 됨
		
		Iterator<Object> itr = set.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("개수 : " + set.size());
		
	}

}
