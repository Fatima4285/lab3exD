package ca.ucalgary.ensf380;

//chatgpt was used to generate some of this code but was heavily modified to provide accurate results!
public class MyBook {
    public static void main(String[] args) {
        // Authors
        Author author1 = new Author("Aroush Qureshi", "1 Modeltown Street, Calgary", 58);
        Author author2 = new Author("Fatima Asif", "123 Main Street, Calgary", 41);
        
        // Publisher
        Publisher publisher = new Publisher("Schulich Publishing Inc.", "100 Schulich Lane, Calgary");
        
        // Series
        Series series1 = new Series();
        series1.setSeriesName("Modern Classics Collection");
        
        // Creating Classics
        Classic classic1 = new Classic();
        classic1.setOrigPubYear(2012);
        classic1.setTheAuthor(author1);
        classic1.setBookPublisher(new Publisher[]{publisher});
        classic1.setIsbn("978-1-2345-6789-0");
        
        
        Classic classic2 = new Classic();
        classic2.setOrigPubYear(2016);
        classic2.setTheAuthor(author2);
        classic2.setBookPublisher(new Publisher[]{publisher});
        classic2.setIsbn("978-0-9876-5432-1");
      
        
        // Creating Novel
        Novel novel1 = new Novel();
        novel1.setTheAuthors(new Author[]{author1});
        novel1.setMySeries(series1);
        novel1.setIsbn("978-3-2109-8765-4");

        
        // Creating Nonfiction
        Nonfiction nonfiction1 = new Nonfiction();
        Category category = new Category();
        category.setCategory("Science");
        nonfiction1.setDeweyClassification(category);
        nonfiction1.setIsbn("978-5-6789-0123-4");
      
        
        // Setting classics catalog for the publisher
        publisher.setClassicCataolog(new Classic[]{classic1, classic2});
        
        // Creating a contract
        Contract contract1 = new Contract("2023-01-01", publisher, new Author[]{author1, author2});
        
        // Printing details
        System.out.println("Publisher: " + publisher.getName());
        System.out.println("Address: " + publisher.getAddress());
        System.out.println(publisher.printLetterhead());
        
        System.out.println("\nClassics Published:");
        for (Classic classic : publisher.getClassicsCatalog()) {
            System.out.println("Original Publication Year: " + classic.getOrigPubYear());
            System.out.println("Author: " + classic.getTheAuthor().getName());
            System.out.println("ISBN: " + classic.getIsbn());
            System.out.println("Binding Method: " + classic.binding());
            System.out.println("Create Notes Method: " + classic.createNotes());
            System.out.println();
        }
        
        System.out.println("\nNovels Published:");
        System.out.println("Author: " + novel1.getTheAuthors()[0].getName());
        System.out.println("Series: " + novel1.getMySeries().getSeriesName());
        System.out.println("ISBN: " + novel1.getIsbn());
        System.out.println("Theme Method: " + novel1.theme());
        System.out.println("Cover Art Method: " + novel1.coverArt());
        
        System.out.println("\nNonfiction Published:");
        System.out.println("Topic Method: " + nonfiction1.topic());
        System.out.println("Dewey Classification: " + nonfiction1.getDeweyClassification().getCategory());
        System.out.println("ISBN: " + nonfiction1.getIsbn());
        
        System.out.println("\nContract Details:");
        System.out.println("Date: " + contract1.getDate());
        System.out.println("Publisher: " + contract1.getPublisherInfo().getName());
        System.out.print("Authors: ");
        for (Author author : contract1.getAuthorInfo()) {
            System.out.print(author.getName() + " ");
        }
        System.out.println();
        System.out.println(contract1.printContract());
    }
}


