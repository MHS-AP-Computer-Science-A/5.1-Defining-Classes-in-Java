
public class Main {

	public static void main(String[] args) {
		Post p = new Post();

		p.postContent = "Avocados are squishy";
		p.postAuthor = "Mr. Fox";
		p.likePost();
		p.likePost();
		
		System.out.println(p.postAuthor + " posted \n" + p.postContent + "\n" + p.postLikes + " likes");

	}

}

