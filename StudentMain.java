package com.te.collectionsdemo.studentprojectcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain {

	static ArrayList<Student> arrayList;
	static char ch;
	static Scanner sc = new Scanner(System.in);

	static void chooseOption() {
		System.out.println("Press 1 to sort based on student ID");
		System.out.println("Press 2 to sort based on student Name");
		System.out.println("Press 3 to sort based on student Age");
		System.out.println("Enter your choice ");
		int choice = sc.nextInt();
		
		if (choice>0 && choice<4) {
		
			switch (choice) {
		case 1:
			stuIdComparator();
			break;
		case 2:
			stuNameComparator();
			break;
		case 3:
			stuAgeComparator();
			break;
		default:
			break;
		}		
		}else 
			throw new MyCustomException("The entered number is not between 1&3");
	}

	public static void main(String[] args) {

		arrayList = new ArrayList<Student>();

		arrayList.add(new Student(301, "Kiran", 21));
		arrayList.add(new Student(401, "Ramesh", 22));
		arrayList.add(new Student(201, "Sateesh", 24));
		arrayList.add(new Student(101, "Hema", 23));

		
	    try {
	    	chooseOption();
		} catch (MyCustomException e) {
			System.out.println(e.getMessage());
		}  
	    
	    try {	
		do {
			System.out.println("Do you want to try again: (y/n)");
			ch = sc.next().charAt(0);
			if (ch == 'y')				
				try {
				chooseOption();
				}catch (MyCustomException e) {
					System.out.println(e.getMessage());
				} 
			else if(ch == 'n')
			  System.out.println("Thank you for using this application");
			else {
		      throw new MyCustomException2("You have not entered y or n.Thanks for using this application");
			}
		} while (ch == 'y');
  	
	    } catch (MyCustomException2 e) {
		    System.out.println(e.getMessage());	
		}		
	}

	
	static void stuIdComparator() {
		Collections.sort(arrayList, new StudentIdComparator());
		Iterator<Student> iteratorId = arrayList.iterator();
		while (iteratorId.hasNext()) {
			System.out.println(iteratorId.next());
		}
	}

	static void stuNameComparator() {
		Collections.sort(arrayList, new StudentNameComparator());
		Iterator<Student> iteratorName = arrayList.iterator();
		while (iteratorName.hasNext()) {
			System.out.println(iteratorName.next());
		}
	}

	static void stuAgeComparator() {
		Collections.sort(arrayList, new StudentAgeComparator());
		Iterator<Student> iteratorAge = arrayList.iterator();
		while (iteratorAge.hasNext()) {
			System.out.println(iteratorAge.next());
		}
	}
	
	
}
