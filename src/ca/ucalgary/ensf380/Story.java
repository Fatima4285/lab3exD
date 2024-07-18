package ca.ucalgary.ensf380;

class Story {
	private Author[] theAuthors;
	
	public String plot() {
		return "Method plot called from Story";
	}
	
	public Author[] getTheAuthor() {
		return theAuthors;
	}
	
	public void setTheAuthor(Author[] authors) {
		this.theAuthors = authors;
	}
}
