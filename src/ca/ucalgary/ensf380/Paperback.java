package ca.ucalgary.ensf380;

abstract class Paperback extends Book {
    // No-argument constructor
    public Paperback() {
        super(); // Explicit call to the parent class's no-argument constructor
    }
    
    // Constructor with parameters
    public Paperback(String isbn, int pages) {
        super(isbn, pages);
    }
    
    @Override
    public String coverArt() {
        return "Method coverArt called from Paperback";
    }
}
