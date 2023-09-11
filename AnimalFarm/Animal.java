package AnimalFarm;

public abstract class Animal {
	String name;
	double weight;
	String color;
	public Animal() {
		
	};
	
	public void speak() {
		System.out.println("동물이 소리를 냅니다.");
	}
	
	public void list() {
		System.out.printf("| %-10s | %-11.2f | %-8s |\n", this.name, this.weight, this.color);
	}

}
