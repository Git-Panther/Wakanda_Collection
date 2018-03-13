package kh.map;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import kh.list.vo.MemberVo;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HashMap<Object, Object> map = new HashMap<>();
//		
//		map.put("시간", "왕이 자기 영역에서 지는 일이 있을 수 있나.");
//		map.put("time", new Date());
//		
//		// 키 값이 달글 경우 중복된 값 입력 가능
//		map.put(50, 150);
//		map.put(100, 150);
//		System.out.println(map);
//		
//		String str = (String)map.get("시간");
//		System.out.println(str);
//		System.out.println(map.get("시간").toString());
//		
//		// time -> 0000 년 00월 00일 로 출력
//		Date date = (Date)map.get("time");
//		SimpleDateFormat format = new SimpleDateFormat("yyyy년 MM월 dd일", Locale.KOREA);
//		System.out.println(format.format(date));
//		
//		map.remove(50);
//		System.out.println(map);
		
		HashMap<Integer, MemberVo> memberMap = new HashMap<>();
		memberMap.put(0, new MemberVo(1, "김동하", new Date(1111111) ) );
		memberMap.put(1, new MemberVo(2, "한왕호", new GregorianCalendar().getTime() ) );
		memberMap.put(2, new MemberVo(3, "곽보성", new Date(3333333333L) ) );
		memberMap.put(3, new MemberVo(4, "김종인", new Date(444444444444444L) ) );
		memberMap.put(4, new MemberVo(5, "강범현", new Date(5555555555555555L) ) );	
		
		System.out.println(memberMap);
		
		Iterator<Integer> keyItr = memberMap.keySet().iterator(); 
		while(keyItr.hasNext()) {
			System.out.println(memberMap.get(keyItr.next()));
		}
	
		Set<Entry<Integer, MemberVo>> entrySet = memberMap.entrySet(); // Map 계열은 Entry Set 형식으로 추출 가능
		Iterator<Entry<Integer, MemberVo>> entryItr = entrySet.iterator();
		Entry<Integer, MemberVo> tempEntry = null;
		while(entryItr.hasNext()) {
			tempEntry = entryItr.next();
			System.out.println(tempEntry.getKey() + " : " + tempEntry.getValue().toString());
		}
		
		
	}

}
