package com.homedepot.lambda;

public class Person {
	private final String name;
	private final int age;
	private final Gender gender;
	
	public Person(String theName, Gender theGender, int theAge ){
		name = theName;
		age =theAge;
		gender = theGender;
	}
	public String toString(){
		return String.format("%s -- %s --%d", name,gender,age);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public Gender getGender() {
		return gender;
	}


}
