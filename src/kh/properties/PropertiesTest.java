package kh.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties(); // String Map
		prop.setProperty("KZ_TOP", "김동하");
		prop.setProperty("KZ_JGL", "한왕호");
		prop.setProperty("KZ_MID", "곽보성");
		prop.setProperty("KZ_ADC", "김종인");
		prop.setProperty("KZ_SUP", "강범현");
		
//		System.out.println(prop);
//		try(FileOutputStream fos = new FileOutputStream("king_zone_dragon_x.dat"); // 한글은 유니코드로 저장됨
//				FileWriter writer = new FileWriter("entry_kz.txt"); // 텍스트 그대로 입력됨
//				FileOutputStream xml = new FileOutputStream("kz.xml"); ) {
//			prop.store(fos, "1st");
//			prop.store(writer, "entry");
//			prop.storeToXML(xml, "kz\'s entry"); // xml 형식으로 저장
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Properties readProp = new Properties();
		try(FileInputStream fis = new FileInputStream("king_zone_dragon_x.dat");
				FileReader reader = new FileReader("entry_kz.txt");
				FileInputStream xml = new FileInputStream("kz.xml"); ) {
			readProp.load(fis);
			System.out.println(readProp);
			readProp.load(reader);
			System.out.println(readProp);
			readProp.loadFromXML(xml);
			System.out.println(readProp);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
