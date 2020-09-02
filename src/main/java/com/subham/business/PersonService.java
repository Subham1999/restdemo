package com.subham.business;


import java.util.List;

import com.subham.database.PersonTable;
import com.subham.pojo.Person;

public class PersonService {
	public PersonTable database = null;
	public Person.Builder personBuilder = null;
	
	public PersonService() {
		database = new PersonTable();
		personBuilder = new Person.Builder();
	}
	
	public Person addPerson(Person person) {
		return database.add(person);
	}
	
	public Person getPerson(int id) {
		return database.get(id);
	}
	
	public List<Person> getListOfPerson(){
		return database.getAllPerson();
	}
	
	public void removePerson(int id) {
		database.remove(id);
		return;
	}
	public Person putPerson(int id, Person p) {
		return database.putPerson(id, p);
	}
}
