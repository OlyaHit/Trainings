package arrays;

import java.util.ArrayList;

public class PersonArrayList {
	private String name;
    private ArrayList<String> friends;

    public PersonArrayList(String name)
    {
        this.name = name;
        friends = new ArrayList<String>();
    }

    /**
     * Adds the given friend to this Person's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(PersonArrayList friend)
    {
        friends.add(friend.name);
    }

    /**
     * Gets a list of all of this Person's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Sara, Cheng-Han, Cay"
     */
    public String getFriends()
    {
        String friendsWithBrackets = friends.toString();
        return friendsWithBrackets.substring(1, friendsWithBrackets.length() - 1);
    }

    /**
     * Gets a friend at a given index
     * @param friendIndex the index at which to find the friend (starting at 0)
     * @return the name of the friend at friendIndex
     */
    public String getFriend(int friendIndex)
    {
        return friends.get(friendIndex);
    }

    /**
     * Gets the number of friends this Person has.
     * @return the number of friends.
     */
    public int getNumFriends()
    {
    	return friends.size();


    }

	public static void main(String[] args) {
		PersonArrayList newfriend = new PersonArrayList("Tolly HAN");
		newfriend.friends.add("GUKK Jan");
		newfriend.friends.add("Lenny");
		newfriend.friends.add("Addam");
		newfriend.addFriend(newfriend);
		System.out.println(newfriend.getFriends());
		System.out.println(newfriend.getFriend(2));
		System.out.println(newfriend.getNumFriends());
	}

}
