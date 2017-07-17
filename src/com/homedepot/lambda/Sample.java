package com.homedepot.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
	HashMap<String,String> map = new HashMap<String,String>();
	map.put("hello", "prem");
	map.put("good", "morning");
		
	map.forEach((k,v) ->{ 
		System.out.println("map - " +k +" "+v);
	}) ;
	Map<Object,Object> mapObj = new HashMap<Object, Object>();
	Map<Object, Object> collect = mapObj.entrySet().stream()
			.filter(map1 -> map1.getKey().equals(2) && map1.getValue().equals(2))
			.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
	
/*	System.out.println("map2 "+mapObj.entrySet().stream()
    .filter(map2 -> map2.getValue().equals(""))
    .map(map2 -> map2.getValue())
    .collect(supplier, accumulator, combiner));*/
   

	List<Person> people = createPeople();
	
	 List<Person> person2 = 
		people.stream()
		  .filter(person -> person.getAge()>18)
		   .collect(Collectors.toList());
	 
	 List<String> name2 = 
				people.stream()
				  .filter(person -> person.getAge()>18)
				  
				  .map(Person::getName)
				  .map(String::toUpperCase)
				  .collect(Collectors.toList());
	 

	people.sort((p1,p2) -> p1.getName().compareTo(p2.getName()));
	System.out.println("sorted -"+ people);
	System.out.println(	"age only -"+people.stream()
		 	  .mapToInt(Person::getAge)
		 	  .sum());
	
	Map<Gender,List<Person>> mapPerson =
			people.stream()
			      .collect(Collectors.groupingBy(Person::getGender));
	mapPerson.forEach((k,v)-> System.out.println(" Map Groupby "+k +" " +v));

	
	System.out.println("lenght ==4   "+
			people.stream()
			      .filter(new Sample():: is4Didigt)
			      .collect(Collectors.toList()));
	
	System.out.println(name2);	
System.out.println(" persons "+person2);
	}

	public  boolean is4Didigt(Person person){
		return person.getName().length()==4;
	}
	public static List<Person> createPeople(){
		return Arrays.asList(
				new Person("Jack",Gender.MALE,23),
				new Person("Sara",Gender.FEMALE,22),
				new Person("Paul",Gender.MALE,2),
				new Person("Jill",Gender.FEMALE,22),
				new Person("Jack",Gender.MALE,11),
				new Person("Paula",Gender.FEMALE,22)
				
				);
		
				
	}
}
