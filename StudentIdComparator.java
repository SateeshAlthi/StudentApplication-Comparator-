package com.te.collectionsdemo.studentprojectcomparator;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		Integer id1=s1.getStuId();
		Integer id2=s2.getStuId();
//		return id1-id2;	
		return id1.compareTo(id2);
	}
}
