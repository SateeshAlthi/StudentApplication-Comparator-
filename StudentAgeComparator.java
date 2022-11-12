package com.te.collectionsdemo.studentprojectcomparator;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		Integer a1=s1.getStuAge();
		Integer a2=s2.getStuAge();
//		return a1-a2;	
		return a1.compareTo(a2);
	}

}
