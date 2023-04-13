public class BookMain {
	public static void main(String[] args) {
		BookRental br = new BookRental();
		
		System.out.println("ELECTRONIC BOOK RENTAL SYSTEM");
		for(int i = 0; i < br.books.length; i++) {
			System.out.println(i + " " + br.books[i] + "(" + br.pub_year[i] + ") by "+ br.authors[i]);
		}
		System.out.println("");
		br.rentBook();
		System.out.println("PROGRAM ENDS");
	}
}
