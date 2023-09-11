package AnimalFarm;

import java.util.ArrayList;

public class AnimalFarm {
	ArrayList<Animal> animals = new ArrayList<Animal>();
	
	public AnimalFarm() {
		animals.add(new Dog("개1", 15.5, "흰색"));
		animals.add(new Dog("개2", 31.2, "갈색"));
		animals.add(new Cat("고양이1", 10.3, "검정색"));
		animals.add(new Cat("고양이2", 22.2, "회색"));
		animals.add(new Chicken("닭1", 10.2, "흰색"));
		animals.add(new Chicken("닭2", 17.4, "검정색"));
	}
	
	public void addDog(String name, double weigth, String color) {
		animals.add(new Dog(name, weigth, color));
	}
	
	public void addCat(String name, double weigth, String color) {
		animals.add(new Cat(name, weigth, color));
	}
	
	public void addChicken(String name, double weigth, String color) {
		animals.add(new Chicken(name, weigth, color));
	}
	
	public void find(String name) {
		for (Animal animal : animals) {
			if (animal.name.equals(name)) {
				animal.list();
			}
		}
	}
	
	public void speakYou(String name) {
		for (Animal animal : animals) {
			if (animal.name.equals(name)) {
				animal.speak();
			}
		}

	}
	public void allSpeak() {
		for (Animal animal : animals) {
			animal.speak();
		}
	}

	public void allList() {
		System.out.println("|    이름     |   무게 (kg) |    색깔   |");
        System.out.println("|------------|-------------|----------|");
        
		for (Animal animal : animals) {
			animal.list();
		}
		System.out.println("|------------|-------------|----------|");
	}

}
