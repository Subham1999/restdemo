package com.subham.database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.subham.pojo.Person;

public class PersonTable {
	public static Map<Integer, Person> table = new HashMap<>();
	public Person add(Person p){
		p.setId(Objects.hash(p.getName(), p.getAddress(), p.getAge()));
		table.put(p.getId(), p);
		return p;
	}
	public void remove(int id) {
		table.remove(id);
	}
	public List<Person> getAllPerson(){
		return new ArrayList<Person>(table.values());
	}
	public Person get(int id) {
		return table.get(id);
	}
	public Person putPerson(int id, Person p) {
		p.setId(id);
		table.put(id, p);
		return p;
	}
}
