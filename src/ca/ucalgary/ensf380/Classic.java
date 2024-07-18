package ca.ucalgary.ensf380;

class Classic extends Hardcover{
	private int origPubYear = 1860;
	private Author theAuthor;
	private Publisher[] bookPublisher;
	
	//other method
	public String createNotes() {
		return "Method createNotes called from Classic";
	}
	
	//setters
	public void setOrigPubYear(int year) {
		this.origPubYear = year;
	}
	
	public void setTheAuthor(Author author) {
		this.theAuthor = author;
	}
	
	public void setBookPublisher(Publisher[] pub) {
		this.bookPublisher = pub;
	}
	
	//getters
	public int getOrigPubYear() {
		return this.origPubYear;
	}

	public Author getTheAuthor() {
		return this.theAuthor;
	}
	
	public Publisher[] getBookPublisher() {
		return this.bookPublisher;
	}

	@Override
	public String binding() {
		return "Method binding called from Classic";
	}

	@Override
	public String coverArt() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
