package loops;

public class ReverseString {
	
	private String twitterPost;
	public ReverseString(String twitterPost){
		this.twitterPost=twitterPost;
	}
	
	/**
     * Shortens and prints longPost by removing vowels.
     * @param longPost the post whose vowels need to be removed.
     */
    public String shorten()
    {
        String shortPost = "";
        for (int i = 0; i < twitterPost.length(); i++)
        {
            if (!"aeiouy".contains(twitterPost.toLowerCase().substring(i, i+1)))
            {
                shortPost = shortPost + twitterPost.substring(i, i+1);
            }
        }
        return shortPost;
    }

    /**
     * Prints a post backwards to hide its contents.
     * @param post the post to be reversed.
     */
    public String reverse()
    {
    	String backwords = "";
    	for (int i=twitterPost.length()-1; i>=0; i--){
    		backwords = backwords + twitterPost.substring(i, i+1);
    	}
		return backwords;
    }
	
	public static void main(String[] args) {
		ReverseString message = new ReverseString("TuOjy dyuyfu iouu");	
		System.out.println(message.shorten());
		System.out.println(message.reverse());
	}

}
