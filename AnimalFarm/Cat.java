package AnimalFarm;

public class Cat extends Animal{
	
	public Cat() {};
	
	public Cat(String name, double weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	
	public void speak() {
		System.out.println("야옹!");
	}

}
