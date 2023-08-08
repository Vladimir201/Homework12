public class Book {
    private final String bookName;
    private final Author author;
    private  int publishingYear;

    public Book(String bookName, Author author, int publishingYear){

        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }
    public Author getAuthor(){
        return this.author;
    }
    public String getBookName(){
        return this.bookName;
    }
    public int getPublishingYear(){
        return this.publishingYear;
    }
    public  void setPublishingYear(int year){
       this.publishingYear = year;
    }

}
