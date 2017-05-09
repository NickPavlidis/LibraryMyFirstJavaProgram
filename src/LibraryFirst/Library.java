package LibraryFirst;

class Library {
	
public Book[] books;

Library (Book[] books){
	this.books=books;}  

	public void printAvailableBooks(){
		System.out.println("The following books are available at the library for renting"+"\n\"Books available for renting:");
	for (int i=0; i<20; i=i+1){
	if (books[i].isAvailable()==true){
		System.out.println(i+"."+books[i]);}
		}
	}
	
	public void printBookDetails(String title){
		for(int i=0; i<20; i++){
			if(books[i].getTitle().equals(title)){
			System.out.println("Book with title= "+title+" found! Details:");
			System.out.println(books[i]);}
			}
		}
			
	
	public void printBooksFromAuthor(String string){
		System.out.println(" Books from author " + string + ":");
	boolean b = false;
	for(int i=0; i < books.length; i++){
		if(books[i].hasAuthor(string)){
			System.out.println(books[i].toString());
			b = true;
			}
	}
			if ( b == false ) {
			System.out.println( "None" );
			}
	}
	
	public void printTheMostPopularBook(){
			int max=0;
			int storeI=0;
			for(int i=1; i<20; i++){
			if(max<books[i].getTimesRented()){
				max=books[i].getTimesRented();
				storeI=i;}
			}
			System.out.println("Most popular book:");
			System.out.println(books[storeI]);}
}



