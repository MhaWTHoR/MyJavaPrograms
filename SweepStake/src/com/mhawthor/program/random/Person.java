package com.mhawthor.program.random;

public class Person {
	
	public int id;
	public String name;
	public Person(String name,int id){
		this.id = id;
		this.name = name;
	}
	
	public int getId(){
		return id+1;
	}
	
	public String getName(){
		return name;
	}
	



}
