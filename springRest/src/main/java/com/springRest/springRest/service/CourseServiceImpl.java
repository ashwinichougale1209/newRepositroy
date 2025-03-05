package com.springRest.springRest.service;

import java.util.ArrayList;
import java.util.List;

import com.springRest.springRest.entites.Course;

public  class CourseServiceImpl implements CourseService {

	
	
	List<Course> list ;
	
	
	public CourseServiceImpl() {
		
		System.out.println("In course impl");
		list = new ArrayList<Course>();
		
		list.add(new Course(1,"JAVA","java desc"));
		list.add(new Course(2,"C++","C++ desc"));
	}
	
	
	@Override
	public List<Course> getCourseList() {
		System.out.println("In course getCourseList");
		
				return list;
	}
	
	

}
