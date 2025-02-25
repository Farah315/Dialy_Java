
package pkgclass;


public class Book {
 private String title;
    private String author;
    private String publisher;
    private int copiesSold;
    public Book(String title, String author, String publisher, int copiesSold) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copiesSold = copiesSold;
    }

    public void setTitle(String title) {
        this.title = title;
    }
 public String getTitle() {
        return title;
    }
public void setAuthor(String author) {
        this.author = author;
    }
   
 public String getAuthor() {
        return author;
    }
public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }
public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }

public int getCopiesSold() {
        return copiesSold;
    }

 }   
   
    

    

    
    
