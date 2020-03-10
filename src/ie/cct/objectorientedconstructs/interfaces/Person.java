package ie.cct.objectorientedconstructs.interfaces;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {

	public static void main(String[] args) {
		
		new Person();		
	}
	
	public Person() {

		//lists();
		//deque();
		//map();
		  sets();		
	}
//  public void lists() {
	
	public Person(String string) {
		// TODO Auto-generated constructor stub
	}

	public void map() {
		
//  public void map() {
			
			Map<String, Person> myMap = new HashMap<String, Person>();
			myMap.put("Amilcar", new Person("Amilcar"));
			myMap.put("Misleine", new Person("Misleine"));
			
			//myMap.remove("Amilcar");
			
			myMap.put("Amilcar", new Person("Amilcar2"));
			
			Person test = new Person("j");
			myMap.put("a", test);
			myMap.put("g", test);
			
			System.out.println(myMap);
			
		}
		public void deque() {
			Deque<Person> myDeque = new ArrayDeque<Person>();
			myDeque.add(new Person("q"));
			myDeque.add(new Person("b"));
			
			myDeque.remove();
			
			myDeque.addFirst(new Person("l"));
			
			System.out.println(myDeque);
			
		}
	
		public void lists() {
		
		List<Person> myListofPeople = new ArrayList<Person>();
		
		System.out.println(myListofPeople.add(newPerson("Mis")));
		System.out.println(myListofPeople.add(newPerson("Mis")));
		System.out.println(myListofPeople.add(newPerson("Mis")));
		System.out.println(myListofPeople.add(newPerson("Mis")));
		
		Person p = new Person("P");
		myListofPeople.add(new Person("P"));
		myListofPeople.add(new Person("P"));
		
		System.out.println(myListofPeople);
		myListofPeople.remove(2);		
		
		System.out.println(myListofPeople.get(2));
		myListofPeople.size();
		
		}
		
		private Person newPerson(String string) {
			// TODO Auto-generated method stub
			return null;
		}
		
		public void sets() {
			
			Set<String> mySet = new HashSet<String>();
			
			System.out.println(mySet.add("Mis"));
			System.out.println(mySet.add("Costa"));
			System.out.println(mySet.add("E"));
			System.out.println(mySet.add("Barry"));
			System.out.println(mySet.add("Mis"));
			System.out.println(mySet.add("Eu"));
			
			System.out.println(mySet);
		
			Set<Person> myPeople = new HashSet<Person>();
		
			System.out.println(mySet.add("Mis"));
			System.out.println(mySet.add("Mis"));
			System.out.println(mySet.add("Barry"));
			System.out.println(mySet.add("Barry"));

		
			Person test = new Person("Barry");
			System.out.println(myPeople.add(test));
			System.out.println(myPeople.add(test));
		
			System.out.println(mySet);
	}

}
	
