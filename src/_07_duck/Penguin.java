package _07_duck;

public class Penguin {
	String favoriteActivity;
	int fishCaught;

	Penguin(String favoriteActivity, int fishCaught){
		this.favoriteActivity = favoriteActivity;
		this.fishCaught = fishCaught;

	}

	void talk() {
		System.out.println("The penguin tells his friends that his favorite activity is " + favoriteActivity + ".");
	}

	void hunt() {
		System.out.println("The penguin goes fishing and catches " + fishCaught + " fish.");
	}

}
