package arrays;

import java.util.ArrayList;

public class BookArrayList {

	public static void main(String[] args) {
		ArrayList<String>booksToRead= new ArrayList<String>();

        booksToRead.add("The Eyre Affair by Jasper Fforde");
        booksToRead.add("Night Watch by Terry Pratchett");
        booksToRead.add("Next by Michael Crichton");
        booksToRead.add("The Brain That Changes Itself by Norman Doidge");
        booksToRead.add("Effective Java by Joshua Bloch");
        booksToRead.add("The Visual Display of Quantitative Information by Edward R. Tufte");

        String anotherBook = "Why zebras don't get ulcers by Robert M. Sapolsky";
        booksToRead.add(2,anotherBook);
        System.out.println(booksToRead);
        System.out.println(booksToRead.get(2));
        
        String sequel = "Lost in a Good Book by Jasper Fforde";
        booksToRead.set(0,sequel);
        System.out.println(booksToRead);
        
        String changeArray = booksToRead.toString();
        String onlyName	= changeArray.substring(1, changeArray.length()-1);
        System.out.println(onlyName);
        
        booksToRead.remove(2);
        System.out.println(booksToRead);
	}

}
