
public class Main {

	public static void main(String[] args) {
		//Create a Tweet object
		Tweet t = new Tweet();

		//Set the instance variables
		t.text = "Avocados are squishy";
		t.author = "Mr. Fox";
		t.likes = 100;

		//Display the  Tweet
		System.out.println(t.author + " tweeted \n" + t.text + "\n" + t.likes + " likes\n");
		
		//Use the like method to like the Tweet
		t.like();
		
		//Display the Tweet again, but this time with the toString method
		//Notice the likes have increased by 1
		System.out.println(t);
		
		//Add a reply and display again
		t.addReply("I'll bring the tacos", "Dave");
		System.out.println("\n" + t);
	}

}
