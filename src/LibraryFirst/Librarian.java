package LibraryFirst;

import java.util.Scanner;

public class Librarian {
private Library library;

Librarian (Library library){
this.library=library;}

public void findMeBooksFromAuthor (String string) {
library.printBooksFromAuthor(string);
}

public void findMeAvailableBooks (){
library.printAvailableBooks();
}

public void findMeBook(String title){
library.printBookDetails(title);
}

public void findMostPopularBook(){
library.printTheMostPopularBook();
}
public void showOptions() {
	String message = "Welcome to the Bootcamp library.\n" + 
	"How do you want to proceed?\n" + 
	"1. Show all available books\n" + 
	"2. Search for a book (by book title)\n" + 
	"3. Display books from a specific author\n" + 
	"4. Show me the most popular book\n" + 
	// fill-in your own code!
	"q. Quit\n" + 
	"> ";
	Scanner sc = new Scanner(System.in);
	
	while (true) {
		System.out.println(message);
		String input = sc.nextLine();
		switch(input) {
			case "1" : 
				this.findMeAvailableBooks();
				break;
			case "2" :
				System.out.println("Enter Book title: \n");
				String title = sc.nextLine();
				this.findMeBook(title);
				break;
			case "3" :
				System.out.println("Enter Author name: \n");
				String authorname = sc.nextLine();
				this.findMeBooksFromAuthor(authorname);
				break;
			case "4" :
				this.findMostPopularBook();
				break;
			// fill-in your own code!
			case "q" :
				System.out.println("Thank you for visiting our Library! Goodbye.");
				sc.close();
				return;
			default : 
				System.out.println("Invalid input. Try again.");
				break;
		}
	}
}
}
