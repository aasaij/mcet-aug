public class Book {
    private int id;
    private String title, author;
    private boolean isAvailable;
    //Constructor
    public Book(int id, String title, String author, boolean  available){
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = available;
    }
    public boolean borrowBook(){
        if(isAvailable){
            isAvailable = false;
            return true; //book is available
        }
        return false; // book is not available
    }
    public void returnBook(){
        if(!isAvailable)
            isAvailable = true;
    }
    public String getTitle(){
        return title;
    }
    public String toString(){
        return String.format("Book[id=%d, title='%s', author='%s', isAvailable=%b]", id, title, author, isAvailable);
    }
}
