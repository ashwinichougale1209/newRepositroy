package com.springRest.springRest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.service.category.dto.CategoryDto;
import com.springRest.springRest.entites.Course;
import com.springRest.springRest.service.CourseServiceImpl;

//import jakarta.validation.Valid;

@RestController
//@RequestMapping("/api/")
public class MyContoller {
	
	@GetMapping("/home")
	public String home() {
		
		System.out.println("in home");
		return "In Home";
		
	}

	
	
	@GetMapping("/courses")
	public List getCourses() {
		
		System.out.println("in getCourses ");
		CourseServiceImpl impl = new CourseServiceImpl();
		List<Course>  al = impl.getCourseList();;
		
		return al;
		
	}
	

	@GetMapping("/coursesReponseEntity")
	public ResponseEntity<?> getCoursesResponEntity() {
		
		System.out.println("in getCourses ");
		CourseServiceImpl impl = new CourseServiceImpl();
		List<Course>  al = impl.getCourseList();;
		
		return ResponseEntity.status(HttpStatus.CREATED).body(al);
			}
	
// get mapping thr path variable 
	@GetMapping("/getPathvar/{id}")
	public ResponseEntity<?> getPathvar(@PathVariable int id) {
		
		System.out.println("in getPathvar ");
		//CourseServiceImpl impl = new CourseServiceImpl();
		//List<Course>  al = impl.getCourseList();;
		System.out.println("getPathvar"+id);
		return ResponseEntity.status(HttpStatus.CREATED).body("success "+id);
			}
	

	
	
	// get mapping thr url  variable Query 
		@GetMapping("/getURLVar")
		public ResponseEntity<?> getURLVar(@RequestParam(defaultValue = "asc") String sort, 
                @RequestParam(defaultValue = "1") int page){
			
			System.out.println("in 		public "+sort);
			System.out.println("in 		page "+page);
			
			return ResponseEntity.status(HttpStatus.CREATED).body("success "+sort+"  "+page);
				}
		
	
	
	
	
	@PostMapping("/AddCourse")
	public ResponseEntity<?> AddCourse(@Validated @RequestBody Course course)	{	
		System.out.println("in AddCourse ");
		CourseServiceImpl impl = new CourseServiceImpl();
		System.out.println("course.ID() :"+course.getId());
		System.out.println("course.getTitle() :"+course.getTitle());
		System.out.println("course.getDescription() :"+course.getDescription());
		List<Course>  al = impl.getCourseList();;
		al.add(course);
		return ResponseEntity.status(HttpStatus.CREATED).body(course);
		
	}

}
