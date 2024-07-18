package ca.ucalgary.ensf380;

class Nonfiction extends Paperback{
	private Category deweyClassification;
	
	public String topic() {
		return "Method topic called from Nonfiction";
	}
	
	//setter
	public void setDeweyClassification(Category cat) {
		this.deweyClassification = cat;
	}
	
	//getter
	public Category getDeweyClassification() {
		return this.deweyClassification;
	}
}
