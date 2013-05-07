package comparable.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 生成对象并赋id值
		Person p1 = new Person();
		p1.setSid(12);
		Person p2 = new Person();
		p2.setSid(9);
		Person p3 = new Person();
		p3.setSid(19);
		// 将对象添加到集合中
		ArrayList<Person> arrays = new ArrayList<Person>();
		arrays.add(p1);
		arrays.add(p2);
		arrays.add(p3);
		// 打印未排序的ArrayList
		for (int i = 0; i < arrays.size(); i++) {
			System.out.println(arrays.get(i).getSid());
		}
		// 排序集合
		Collections.sort(arrays);
		// 打印排序后的集合
		for (int i = 0; i < arrays.size(); i++) {
			System.out.println(arrays.get(i).getSid());
		}

	}

}
