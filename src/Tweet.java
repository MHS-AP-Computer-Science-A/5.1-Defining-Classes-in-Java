
public class Tweet {
	String text;
	String author;
	int likes;

	public void like() {
		likes++;
		System.out.println("You liked this");
	}

	// Post: appends reply and name to text
	public void addReply(String reply, String name) {
		text += "\n > " + reply + "\n  -" + name;
	}

	// Post: Returns the object as a String
	public String toString() {
		return author + " tweeted \n" + text + "\n" + likes + " likes";
	}

}
