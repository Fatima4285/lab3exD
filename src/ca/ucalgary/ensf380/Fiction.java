package ca.ucalgary.ensf380;

abstract class Fiction extends Paperback {
    // No-argument constructor
    public Fiction() {
        super(); // Explicit call to the parent class's no-argument constructor
    }
    
    // Constructor with parameters
    public Fiction(String isbn, int pages) {
        super(isbn, pages);
    }
    
    @Override
    public abstract String coverArt();
    
    public String genre() {
        return "Method genre called from Fiction";
    }
}
