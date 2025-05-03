package Week1day2;

public class Library {
	
	String addbook (String bookTitle) {
		System.out.println(bookTitle+ " Book added successfully");
		return bookTitle;
		
		
		
		
	}
	
	void issueBook() {
		System.out.println("Book added successfully");
	}
	public static void main(String[] args) {
		Library LM=new Library();
		LM.addbook("java");
		LM.issueBook();
		
	}

}
