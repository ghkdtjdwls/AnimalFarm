package AnimalFarm;

public class Dog extends Animal {
	
	public Dog() {};
	
	public Dog(String name, double weight, String color) {
		this.name = name;
		this.weight = weight;
		this.color = color;
	}
	
	public void speak() {
		System.out.println("멍멍!");
	}

}
