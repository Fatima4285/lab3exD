package ca.ucalgary.ensf380;

class Anthology extends Fiction {
    private Story[] stories;
    
    // No-argument constructor
    public Anthology() {
        super(); // Explicit call to the parent class's no-argument constructor
    }
    
    // Constructor with parameters
    public Anthology(String isbn, int pages) {
        super(isbn, pages);
    }
    
    public String storyOrder() {
        return "Method storyOrder called from Anthology";
    }
    
    public Story[] getStory() {
        return stories;
    }
    
    public void setStory(Story[] stories) {
        this.stories = stories;
    }
    
    @Override
    public String coverArt() {
        return "Method coverArt called from Anthology";
    }
}
