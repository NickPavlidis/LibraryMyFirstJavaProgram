package LibraryFirst;

public class Book {
	private String title;
	private Author authorname;
	private	final String isbn;
	private int physicalCopies;
	private int availableCopies;
	private int timesRented;
	
	Book(String title, Author authorname, String isbn, int physicalCopies, int availableCopies, int timesRented)
	{this.title=title;
	this.authorname=authorname;
	this.isbn=isbn;
	this.physicalCopies=physicalCopies;
	this.availableCopies=availableCopies;
	this.timesRented=timesRented;
	}
	
	public void setTitle(String title){this.title =title;}
	public String getTitle(){return title;}
	public void  setAuthor( Author authorname ) { this.authorname = authorname; }
	public Author getAuthor(){return authorname;}
	public String getIsbn(){return isbn;}
	public void setPhysicalCopies(int physicalcopies, int physicalCopies){this.physicalCopies=physicalCopies;}
	public int getPhysicalCopies(){return physicalCopies;}
	public void setAvailableCopies(int availableCopies){this.availableCopies=availableCopies;}
	public int getAvailableCopies(){return availableCopies;}
	public void setTimesRented(int timesRented){this.timesRented=timesRented;}
	public int getTimesRented(){return timesRented;}
	
	public String toString(){
		return "[ Book "+title+" Author Name= "+authorname.toString()+" ISBN= "+isbn+" Physical copies= "+physicalCopies+" Available Copies= "+availableCopies+" Times Rented= "+timesRented;
}
	public void rentPhysicalCopy(){
		if(availableCopies!=0){
			System.out.println("The Book is available");
	}else{
		System.out.println("The Book is not available");}
	}
	/*public void rentPhysicalCopy() {
		if ( this.availableCopies > 0 ) {
			System.out.println( "There are " + this.availableCopies + " copies of " + this.name + " out of a total " + this.physicalCopies + " available for renting");
			this.availableCopies = ( this.availableCopies - 1 );
			this.timesRented = ( this.timesRented + 1 );
		}else {
			System.out.println( "There are no available books for renting");
		}
	}*/

	public boolean isAvailable(){
		if (availableCopies>0){
			return true;
		}else{
			return false;}
		}
	/*
	 * 	public boolean isAvailable() {
		boolean a = ( this.availableCopies > 0 );
		return a;
	}
	 */
	public boolean hasAuthor(String string) {
		Author string1 = this.authorname;
	    boolean a = (string1.toString().equals(string));
		return a;
	}
	}
	
