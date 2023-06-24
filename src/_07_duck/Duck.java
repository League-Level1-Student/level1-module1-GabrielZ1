package _07_duck;

public class Duck {
	String favoriteFood;
	int numberOfFriends;



	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}



	void quack() {
		System.out.println("The duck quacks after eating " + favoriteFood + ".");
	}

	void waddle() {
		System.out.println("The duck waddles towards his " + numberOfFriends + " friends.");
	}

}
