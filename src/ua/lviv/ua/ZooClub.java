package ua.lviv.ua;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {
	
	Map<Person, List<Animal>> map;

	public ZooClub() {
		super();
		this.map = new HashMap<>();
	}
		
	public void addPerson() {
		Scanner sc = new Scanner(System.in);
			System.out.println("Введіть ім'я учасника: ");
			String name = sc.next();
			System.out.println("Введіть вік учасника: ");
		int age = Integer.parseInt(sc.next());
		
		Person person = new Person(name, age);		
		map.put(person, new ArrayList<Animal>());
	}
	
	public void addPetForPerson() {
		Scanner sc = new Scanner(System.in);
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> personNext = iterator.next();
			System.out.println(personNext.getKey());
				System.out.println("Додати тваринку до цього учасника клубу, Так - Y, ні - інше ");
				if(sc.next().equalsIgnoreCase("Y")) {
					System.out.println("Введіть тип тваринки: ");
						String typeAnimal = sc.next();
					System.out.println("Введіть кличку тваринки: ");
						String name = sc.next();
						Animal animal = new Animal(typeAnimal, name);
						personNext.getValue().add(animal);
				}
		}		
	}
	
	public void removePetForPerson() {
		Scanner sc = new Scanner(System.in);
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> personNext = iterator.next();			

			if (!(personNext.getValue().isEmpty())) {
				System.out.println(personNext.getKey());
				System.out.println("Видалити тваринку цього учасника клубу, Так - Y, ні - інше ");

				if (sc.next().equalsIgnoreCase("Y")) {
					List<Animal> animalNext = personNext.getValue();
					Iterator<Animal> iterator2 = animalNext.iterator();
					while (iterator2.hasNext()) {
						Animal pet = iterator2.next();
						System.out.println(pet);
						System.out.println("Видалити цю тваринку, Так - Y, ні - інше ");
						if (sc.next().equalsIgnoreCase("Y")) {
							iterator2.remove();
						}
					}
				}
			}
		}
	}
	
	public void removePerson() {
		Scanner sc = new Scanner(System.in);
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> personNext = iterator.next();
				System.out.println(personNext.getKey());
				System.out.println("Видалити цього учасника клубу, Так - Y, ні - інше ");
			if (sc.next().equalsIgnoreCase("Y")) {
				iterator.remove();	
			}
		}
	}
	
	public void removeWhichPetAllPerson() {
		System.out.println("Яку тварину видалити зі всіх власників: ");
		Scanner sc = new Scanner(System.in);
		String animal = sc.next();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> personNext = iterator.next();
				Iterator<Animal> iterator2 = personNext.getValue().iterator();
				while(iterator2.hasNext()) {
					String animalIsDelete = iterator2.next().getTypeAnimals();
					if(animalIsDelete.equalsIgnoreCase(animal)) {
						iterator2.remove();
					}
				}			
		}
	}
	
	public void printAllZooClub(){
		System.out.println();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> personNext = iterator.next();
			System.out.println(personNext.getKey());
				System.out.println("   Animals :  " + personNext.getValue());
		}
		System.out.println();
	}
	

	@Override
	public String toString() {
		return "ZooClub [map=" + map + "]";
	}

}
