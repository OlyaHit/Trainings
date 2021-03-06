package loops;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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
                shortPost =  twitterPost.substring(i, i+1)+shortPost;
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
    

    public String reverseStringWithCharAt() {
            int stringLength = twitterPost.length();
            String result = "";
            for (int i = 0; i < stringLength; i++) {
                result = twitterPost.charAt(i) + result;
            }
            return result;
        }
	
	public static void main(String[] args) {
		ReverseString message = new ReverseString("TuOjy dyuyfu iouu");	
		System.out.println(message.shorten());
		System.out.println(message.reverse());
		System.out.println(message.reverseStringWithCharAt());
	}

}
