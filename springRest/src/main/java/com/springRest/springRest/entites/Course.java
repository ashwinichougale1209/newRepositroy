package com.springRest.springRest.entites;


import jakarta.annotation.Nonnull;
//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.NotNull;
public class Course {
	
	
private long id;

//@NotNull(message = "Name may not be null")
private String title;

@Nonnull
private String description;
public Course(long id, String title, String description) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Course [id=" + id + ", title=" + title + ", description=" + description + "]";
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}




}
