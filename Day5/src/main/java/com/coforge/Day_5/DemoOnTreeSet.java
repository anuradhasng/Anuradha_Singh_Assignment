package com.coforge.Day_5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoOnTreeSet {
	
	public static void main(String[] args) {
		TreeSet<Student> studentTree=new TreeSet<Student>();
		Student s1=new Student(123,"Anuradha",79);
		Student s2=new Student(124,"Agrima",89);
		Student s3=new Student(125,"Aman",79);
		Student s4=new Student(126,"Shivam",87);
		Student s5=new Student(127,"Aparna",79);
		Student s6=new Student(128,"Arti",79);
		
		studentTree.add(s1);
		studentTree.add(s2);
		studentTree.add(s3);
		studentTree.add(s4);
		studentTree.add(s5);
		studentTree.add(s6);
		
		studentTree.forEach(s->System.out.println(s));
		System.out.println("--------------------------------");
		Iterator<Student> itr=studentTree.descendingIterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		System.out.println("--------------------------------");
		System.out.println("Descending Set");
		Set<Student> set=studentTree.descendingSet();
		set.forEach(s->System.out.println());
		
		Student fromStud=new Student(123,"",0);
		Student toStud=new Student(1232,"",1);
		Set<Student> subSet=studentTree.subSet(fromStud, toStud);
		System.out.println("---------------------------");
		System.out.println("Subset of student Tree");
		subSet.forEach(s->System.out.println(s));
		
		System.out.println("---------------------------");
		
		Student s=new Student(125,"",90);
		System.out.println(studentTree.ceiling(s));
		System.out.println(studentTree.floor(s));
		System.out.println(studentTree.lower(s));
		System.out.println(studentTree.higher(s));
		
		
		
		
	
		
		
	}

}
