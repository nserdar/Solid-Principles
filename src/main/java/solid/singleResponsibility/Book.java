package main.java.solid.singleResponsibility;
//In this example, the Book class has only one responsibility:
// it encapsulates the data related to the book (title and author)
// and provides a method to get a textual description of the book

// try-with-resources yapısı ile BufferedWriter kullanılır. Bu yapı,
// dosya yazma işleminden sonra kaynakları otomatik olarak kapatır,
// yani dosya kapatılır ve bellekte sızıntı olmaz.
// bu sınıfın temel görevi, bir kitabın bilgilerini verilen dosya yoluna kaydetmektir.

public class Book {
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public Book(){}

    public String getBookInfo(){
        return "Title: " + this.title +
                "\nAuthor: " + this.author;
    }

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }

}
