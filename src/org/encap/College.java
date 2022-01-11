package org.encap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class College {

public static void main(String[] args) {
	Student s = new Student();
	s.setStudentId(123);
	s.setStudentName("abc");
	s.setStudentPhone(9876543210l);
	List<Student> li = new ArrayList<>();
	li.add(s);
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i).getStudentId());
		System.out.println(li.get(i).getStudentName());
		System.out.println(li.get(i).getStudentPhone());
	}
	System.out.println("-----------------");
	Set<Student> se = new LinkedHashSet<>();
	se.add(s);
	for (Student s1 : se) {
		System.out.println(s1.getStudentId());
		System.out.println(s1.getStudentName());
		System.out.println(s1.getStudentPhone());
	}
	System.out.println("-----------------");
	Map<Integer, Student> mi = new LinkedHashMap<>();
	mi.put(01, s);
	Set<Entry<Integer, Student>> entrySet = mi.entrySet();
	for (Entry<Integer, Student> entry : entrySet) {
		System.out.println(entry.getValue().getStudentId());
		System.out.println(entry.getValue().getStudentName());
		System.out.println(entry.getValue().getStudentPhone());
	}
	
	
}
}
