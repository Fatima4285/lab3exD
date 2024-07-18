package ca.ucalgary.ensf380;

class Novel extends Fiction{
	private Author[] theAuthors;
	private Series mySeries;
	
	//setters
	public void setTheAuthors(Author[] authors) {
		this.theAuthors = authors;
	}
	
	public void setMySeries(Series series) {
		this.mySeries = series;
	}
	
	//getters
	public Author[] getTheAuthors() {
		return this.theAuthors;
	}
	
	public Series getMySeries() {
		return this.mySeries;
	}
	
	//Other methods
	public String theme() {
		return "Method theme called from Novel";
	}

	@Override
	public String coverArt() {
		return "Method coverArt called from Novel";
	}
	
}

