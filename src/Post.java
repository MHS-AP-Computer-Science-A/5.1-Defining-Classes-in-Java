class Post{
      String postAuthor;
      String postContent;
      int postLikes;
   
     void likePost(){
            postLikes++;
            System.out.println("You liked this.");
      }
   
      public String toString(){
           return p.postAuthor + " posted \n" 
                 + p.postContent + "\n" 
                 + p.postLikes + " likes";
      }
}


