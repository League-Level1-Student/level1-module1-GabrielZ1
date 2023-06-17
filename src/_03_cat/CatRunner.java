package _03_cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat cat = new Cat("Chi");
		cat.meow();
		cat.printName();
		while(cat.lives >= 0) {
			cat.kill();
		}
	}
}
